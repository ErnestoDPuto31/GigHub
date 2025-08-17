package githubmainapp;

import java.sql.*;
import javax.swing.JOptionPane;

public class UserService 
{

  public static boolean registerUser(String email, String password, String name, int age, String gender, java.sql.Date birthdate) {
    if (email == null || email.trim().isEmpty() || password == null || password.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Email and password are required.");
        return false;
    }

    try (Connection conn = DatabaseConnection.connectDB()) {

        String checkEmailSQL = "SELECT COUNT(*) FROM users WHERE email = ?";
        PreparedStatement checkStmt = conn.prepareStatement(checkEmailSQL);
        checkStmt.setString(1, email);
        ResultSet rs = checkStmt.executeQuery();

        if (rs.next() && rs.getInt(1) > 0) {
            JOptionPane.showMessageDialog(null, "Email already exists. Please use a different one.");
            return false;
        }

        String insertSQL = "INSERT INTO users (email, password, name, age, gender, birthdate) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement insertStmt = conn.prepareStatement(insertSQL);
        insertStmt.setString(1, email);
        insertStmt.setString(2, password);
        insertStmt.setString(3, name);
        insertStmt.setInt(4, age);
        insertStmt.setString(5, gender);
        insertStmt.setDate(6, birthdate);

        int rowsInserted = insertStmt.executeUpdate();
        return rowsInserted > 0;
 
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
        return false;
    }
}

   public static int loginUser(String email, String password) {

    try (Connection conn = DatabaseConnection.connectDB()) {
        String sql = "SELECT id FROM users WHERE email = ? AND password = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, email);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            int id = rs.getInt("id");
            System.out.println("✅ Found user. ID: " + id);
            return id;
        } else {
            System.out.println("❌ No matching user for those credentials.");
        }
    } catch (SQLException e) {
        System.out.println("❌ SQL error: " + e.getMessage());
    }

    return -1; // login failed
   }
   
    public boolean updateUserProfile(int userId, String name, 
                                    String email, int age, String birthdate,
                                    String gender, String password) {
        String sql = "UPDATE users SET name = ?, email = ?, " +
                    "age = ?, birthdate = ?, gender = ?, password = ? " +
                    "WHERE id = ?";
        try (Connection conn = DatabaseConnection.connectDB();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt   (3, age);
            ps.setString(4, birthdate);  
            ps.setString(5, gender);
            ps.setString(6, password);  
            ps.setInt   (7, userId);

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();        
            return false;
        }
    }   

}




