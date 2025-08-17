package githubmainapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TicketService {
    private Connection conn;

    public TicketService() {
        conn = DatabaseConnection.connectDB();
    }


    // Book ticket with availability check
    public boolean bookTicket(int userId, String concertName, double price, int quantity, double totalCost) {
        String ticketType = getTicketTypeByPrice(concertName, price); 
        if (ticketType == null) {
            JOptionPane.showMessageDialog(null, "❌ Ticket type not found for price: " + price);
            return false;
        }

        try {
            conn.setAutoCommit(false);

            // Check availability
            String checkSql = "SELECT available_quantity FROM available_tickets WHERE concert_name = ? AND ticket_type = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setString(1, concertName);
            checkStmt.setString(2, ticketType);
            ResultSet rs = checkStmt.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Ticket availability not found.");
                return false;
            }

            int available = rs.getInt("available_quantity");
            if (quantity > available) {
                JOptionPane.showMessageDialog(null, "Only " + available + " tickets left for " + ticketType + ".");
                return false;
            }

            // Update availability
            String updateSql = "UPDATE available_tickets SET available_quantity = available_quantity - ? WHERE concert_name = ? AND ticket_type = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateSql);
            updateStmt.setInt(1, quantity);
            updateStmt.setString(2, concertName);
            updateStmt.setString(3, ticketType);
            updateStmt.executeUpdate();
            

            // Insert into tickets table
            String insertSql = "INSERT INTO tickets (user_id, concert_name, price, quantity, total_cost) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertSql);
            insertStmt.setInt(1, userId);
            insertStmt.setString(2, concertName);
            insertStmt.setDouble(3, price);
            insertStmt.setInt(4, quantity);
            insertStmt.setDouble(5, totalCost);
            insertStmt.executeUpdate();

            conn.commit(); // finalize all steps
            return true;

        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error during ticket booking.");
            return false;
        }
    }

    // 🔍 Match ticket_type using price & concert
    public String getTicketTypeByPrice(String concertName, double price) {
        try {
            String sql = "SELECT ticket_type FROM available_tickets WHERE concert_name = ? AND price = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, concertName);
            pst.setDouble(2, price);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return rs.getString("ticket_type");
            }

            rs.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    // ✅ Get all tickets by user ID (includes ticket_id for deletion)
    public ArrayList<Object[]> getTicketsByUserId(int userId) {
        ArrayList<Object[]> ticketList = new ArrayList<>();

        try {
            String sql = "SELECT ticket_id, concert_name, price, quantity, total_cost, booking_date FROM tickets WHERE user_id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, userId);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Object[] ticket = new Object[] {
                    rs.getInt("ticket_id"),           // For deletion
                    rs.getString("concert_name"),
                    rs.getDouble("price"),
                    rs.getInt("quantity"),
                    rs.getDouble("total_cost"),
                    rs.getTimestamp("booking_date")
                };
                ticketList.add(ticket);
            }

            rs.close();
            pst.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ticketList;
    }

    // ✅ Delete ticket by ticket_id
    public boolean deleteTicket(int ticketId) {
        try {
            String sql = "DELETE FROM tickets WHERE ticket_id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, ticketId);
            int rows = pst.executeUpdate();
            pst.close();
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
