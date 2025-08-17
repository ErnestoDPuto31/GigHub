package githubmainapp;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public final class MainFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainFrame.class.getName());

    
    // Initialization
    boolean isSetVisible = false;
    Color iThinkBeige = new Color(0xf4cf91);
    Color cream = new Color(255,240,220);
    Color blackk = new Color(255,240,220);
    private int currentUserId;
    private int userId;
    private boolean isEditing = false;
    
    int num = 0;
    Color transparent = new Color(0,0,0,0);
    ImageIcon[] icons = {
        new ImageIcon(getClass().getResource("/githubmainapp/Images/beabadoobee2025D2EventPoster.jpg")),
        new ImageIcon(getClass().getResource("/githubmainapp/Images/ParkSeoJun.png")),
        new ImageIcon(getClass().getResource("/githubmainapp/Images/Superdivas_303x430.jpg")),
        new ImageIcon(getClass().getResource("/githubmainapp/Images/KennyG.jpg")),
        new ImageIcon(getClass().getResource("/githubmainapp/Images/Hyeri.jpg"))
    };
    String[] captionLabel = {
        "beabadoobee",
        "<html>FIT FOR ANY ROLE:<br>PARK SEO JUN</html>",
        "<html>REGINE VELASQUEZ-<br>ALCASID & VICE<br>GANDA</html>",
        "KENNY G",
        "HYERI"
    };
    String[] dateLabel = {
        "August 12-13, 2025 - 8PM",
        "<html>July 12, 2025 - 2PM PRE-<br> EVENT EXPO | 6PM SHOW<html>",
        "August 08-09, 2025 - 8PM",
        "July 15, 2025 - 8PM",
        "July 26, 2025 - 7PM"
    };
    
    private void setToDefualt(){
        //Set to Default beabadoobee
            floorA.setSelected(false);
            floorB.setSelected(false);
            loge.setSelected(false);
            balcony1.setSelected(false);
            balcony2.setSelected(false);
            
            qtyFloorA.setValue(0);
            qtyFloorB.setValue(0);
            qtyLoge.setValue(0);
            qtyBalcony1.setValue(0);
            qtyBalcony2.setValue(0);
            
            jTextField5.setText("Full Name (Last, First M.I.)*");
            jTextField8.setText("Contact Number (+63)*");
            dates.setSelectedIndex(0);
            jComboBox1.setSelectedIndex(0);
            purchaseButton.setEnabled(false);

        //Set to Default Park Seo Jun
            vvip.setSelected(false);
            vip.setSelected(false);
            patron.setSelected(false);
            lowerBox.setSelected(false);
            upperBox.setSelected(false);
            generalAd.setSelected(false);
            
            qtyVvip.setValue(0);
            qtyVip.setValue(0);
            qtyPatron.setValue(0);
            qtyLowerBox.setValue(0);
            qtyUpperBox.setValue(0);
            qtyGeneralAd.setValue(0);
            
            jTextField10.setText("Full Name (Last, First M.I.)*");
            jTextField11.setText("Contact Number (+63)*");
            dates1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            purchaseButton1.setEnabled(false);

        //Set to Default Superdivas
            platinum.setSelected(false);
            svip.setSelected(false);
            vip1.setSelected(false);
            patron1.setSelected(false);
            lowerBox1.setSelected(false);
            upperBox1.setSelected(false);
            generalAd1.setSelected(false);
            
            qtyPlatinum.setValue(0);
            qtySvip.setValue(0);
            qtyVip1.setValue(0);
            qtyPatron1.setValue(0);
            qtyLowerBox1.setValue(0);
            qtyUpperBox1.setValue(0);
            qtyGeneralAd1.setValue(0);
            
            fullNameTextField.setText("Full Name (Last, First M.I.)*");
            jTextField14.setText("Contact Number (+63)*");
            dates2.setSelectedIndex(0);
            jComboBox3.setSelectedIndex(0);
            purchaseButton2.setEnabled(false);

        //Set to Default Kenny G
            gold.setSelected(false);
            silver.setSelected(false);
            bronze.setSelected(false);
            
            qtyGold.setValue(0);
            qtySilver.setValue(0);
            qtyBronze.setValue(0);
            
            jTextField13.setText("Full Name (Last, First M.I.)*");
            jTextField16.setText("Contact Number (+63)*");
            dates3.setSelectedIndex(0);
            jComboBox4.setSelectedIndex(0);
            purchaseButton3.setEnabled(false);

        //Set to Default Hyeri
            vip3.setSelected(false);
            cat1.setSelected(false);
            cat2.setSelected(false);
            cat3.setSelected(false);
            
            qtyVip3.setValue(0);
            qtyCat1.setValue(0);
            qtyCat2.setValue(0);
            qtyCat3.setValue(0);
            
            jTextField18.setText("Full Name (Last, First M.I.)*");
            jTextField19.setText("Contact Number (+63)*");
            dates4.setSelectedIndex(0);
            jComboBox5.setSelectedIndex(0);
            purchaseButton4.setEnabled(false);

    }
    public void mods4Objects(){
        jButton4.setVisible(isSetVisible);
        jButton5.setVisible(isSetVisible);
        jButton6.setVisible(isSetVisible);
        jPanel1.setBackground(iThinkBeige);
        jPanel2.setBackground(blackk);
        jPanel3.setBackground(blackk);
        jPanel4.setBackground(blackk);
        jTextArea1.setOpaque(false); jTextArea1.setBackground(new Color(0,0,0,0)); jTextArea1.setForeground(cream); jTextArea1.setBorder(null);
        jTextArea2.setOpaque(false); jTextArea2.setBackground(new Color(0,0,0,0)); jTextArea2.setForeground(cream); jTextArea2.setBorder(null);
        jTextArea3.setOpaque(false); jTextArea3.setBackground(new Color(0,0,0,0)); jTextArea3.setForeground(cream); jTextArea3.setBorder(null);
        txtMessage.setOpaque(false); txtMessage.setBackground(new Color(0,0,0,0)); txtMessage.setBorder(null);
        jTextArea5.setOpaque(false); jTextArea5.setBackground(new Color(0,0,0,0)); jTextArea5.setBorder(null); //
        jTextArea6.setOpaque(false); jTextArea6.setBackground(new Color(0,0,0,0)); jTextArea11.setBorder(null);
        jTextArea7.setOpaque(false); jTextArea7.setBackground(new Color(0,0,0,0)); jTextArea6.setBorder(null);
        jTextArea8.setOpaque(false); jTextArea8.setBackground(new Color(0,0,0,0)); jTextArea7.setBorder(null);
        jTextArea9.setOpaque(false); jTextArea9.setBackground(new Color(0,0,0,0)); jTextArea8.setBorder(null);
        jTextArea10.setOpaque(false); jTextArea10.setBackground(new Color(0,0,0,0)); jTextArea9.setBorder(null);
        jTextArea11.setOpaque(false); jTextArea11.setBackground(new Color(0,0,0,0)); jTextArea10.setBorder(null);
        txtFirstName.setOpaque(false); txtFirstName.setBackground(new Color(0,0,0,0)); txtFirstName.setBorder(null);
        txtMI.setOpaque(false); txtMI.setBackground(new Color(0,0,0,0)); txtMI.setBorder(null);
        txtLastName.setOpaque(false); txtLastName.setBackground(new Color(0,0,0,0)); txtLastName.setBorder(null);
        txtSubjectEvent.setOpaque(false); txtSubjectEvent.setBackground(new Color(0,0,0,0)); txtSubjectEvent.setBorder(null);
        txtEmailAddress.setOpaque(false); txtEmailAddress.setBackground(new Color(0,0,0,0)); txtEmailAddress.setBorder(null);
        txtContactNumber.setOpaque(false); txtContactNumber.setBackground(new Color(0,0,0,0)); txtContactNumber.setBorder(null);
    }
    private void setFieldsEditable(boolean editable) {
    lblName.setEditable(editable);
    lblEmail.setEditable(editable);
    lblAge.setEditable(editable);
    lblBirthdate.setEditable(editable);
    lblGender.setEditable(editable);
    lblPassword.setEditable(editable);
}
    
    public void loadAvailableTickets(String concertName) {
            try (Connection conn = DatabaseConnection.connectDB()) {
                String sql = "SELECT ticket_type, available_quantity FROM available_tickets WHERE concert_name = ?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, concertName);
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    String type = rs.getString("ticket_type").toLowerCase();
                    int qty = rs.getInt("available_quantity");
                    
                    if(concertName.equals("beabadoobee")){
                        switch (type) {
                            case "floora" -> {
                                lblFloorA.setText("Floor A: " + qty + " tickets left");
                                qtyFloorA.setModel(new SpinnerNumberModel(0, 0, qty, 1));
                                floorA.setEnabled(qty > 0);
                            }
                            case "floorb" -> {
                                lblFloorB.setText("Floor B: " + qty + " tickets left");
                                qtyFloorB.setModel(new SpinnerNumberModel(0, 0, qty, 1));
                                floorB.setEnabled(qty > 0);
                            }
                            case "loge" -> {
                                lblLoge.setText("Loge: " + qty + " tickets left");
                                qtyLoge.setModel(new SpinnerNumberModel(0, 0, qty, 1));
                                loge.setEnabled(qty > 0);
                            }
                            case "balcony1" -> {
                                lblBalcony1.setText("Balcony 1: " + qty + " tickets left");
                                qtyBalcony1.setModel(new SpinnerNumberModel(0, 0, qty, 1));
                                balcony1.setEnabled(qty > 0);
                            }
                            case "balcony2" -> {
                                lblBalcony2.setText("Balcony 2: " + qty + " tickets left");
                                qtyBalcony2.setModel(new SpinnerNumberModel(0, 0, qty, 1));
                                balcony2.setEnabled(qty > 0);
                            }
                            default -> {
                                JOptionPane.showMessageDialog(this, "Please Input Valid Ticket Type.");
                            }
                        }
                    } else if (concertName.equals("Park Seo Jun: FIT FOR ANY ROLE")){
                        switch(type){
                            case "vvip" -> {
                                lblVVIP.setText("VVIP: " + qty + " tickets left");
                                qtyVvip.setModel(new SpinnerNumberModel(0,0,qty,1));
                                vvip.setEnabled(qty > 0);
                            }
                            case "vip" -> {
                                lblVIP.setText("VIP: " + qty + " tickets left");
                                qtyVip.setModel(new SpinnerNumberModel(0,0,qty,1));
                                vip.setEnabled(qty > 0);
                            }
                            case "patron" -> {
                                lblPatron.setText("Patron: " + qty + " tickets left");
                                qtyPatron.setModel(new SpinnerNumberModel(0,0,qty,1));
                                patron.setEnabled(qty > 0);
                            }
                            case "lowerbox" -> {
                                lbllowerBox.setText("Lower Box: " + qty + " tickets left");
                                qtyLowerBox.setModel(new SpinnerNumberModel(0,0,qty,1));
                                lowerBox.setEnabled(qty > 0);
                            }
                            case "upperbox" -> {
                                lblupperBox.setText("Upper Box: " + qty + " tickets left");
                                qtyUpperBox.setModel(new SpinnerNumberModel(0,0,qty,1));
                                upperBox.setEnabled(qty > 0);
                            }
                            case "generalad" -> {
                                lblGenAd.setText("Gen. Ad.: " + qty + " tickets left");
                                qtyGeneralAd.setModel(new SpinnerNumberModel(0,0,qty,1));
                                generalAd.setEnabled(qty > 0);
                            }
                        }
                    }
                    else if (concertName.equals("SUPERDIVAS: The Concert")){
                        switch(type){
                            case "platinum" -> {
                                lblPlatinum.setText("Platinum: " + qty + " tickets left");
                                qtyPlatinum.setModel(new SpinnerNumberModel(0,0,qty,1));
                                platinum.setEnabled(qty > 0);
                            }
                            case "svip" -> {
                                lblSVIP.setText("SVIP: " + qty + " tickets left");
                                qtySvip.setModel(new SpinnerNumberModel(0,0,qty,1));
                                svip.setEnabled(qty > 0);
                            }
                            case "vip1" -> {
                                lblVIP1.setText("VIP: " + qty + " tickets left");
                                qtyVip1.setModel(new SpinnerNumberModel(0,0,qty,1));
                                vip1.setEnabled(qty > 0);
                            }
                            case "patron1" -> {
                                lblPatron1.setText("Patron: " + qty + " tickets left");
                                qtyPatron1.setModel(new SpinnerNumberModel(0,0,qty,1));
                                patron1.setEnabled(qty > 0);
                            }
                            case "lowerbox1" -> {
                                lbllowerBox1.setText("Lower Box: " + qty + " tickets left");
                                qtyLowerBox1.setModel(new SpinnerNumberModel(0,0,qty,1));
                                lowerBox1.setEnabled(qty > 0);
                            }
                            case "upperbox1" -> {
                                lblupperBox1.setText("Upper Box: " + qty + " tickets left");
                                qtyUpperBox1.setModel(new SpinnerNumberModel(0,0,qty,1));
                                upperBox1.setEnabled(qty > 0);
                            }
                            case "generalad1" -> {
                                lblGenAd1.setText("Gen. Ad.: " + qty + " tickets left");
                                qtyGeneralAd1.setModel(new SpinnerNumberModel(0,0,qty,1));
                                generalAd1.setEnabled(qty > 0);
                            }
                        }
                    } else if (concertName.equals("Kenny G Live Tour 2025")){
                        switch(type){
                            case "gold" -> {
                                lblGold.setText("Gold: " + qty + " tickets left");
                                qtyGold.setModel(new SpinnerNumberModel(0,0,qty,1));
                                gold.setEnabled(qty > 0);
                            }
                            case "silver" -> {
                                lblSilver.setText("Silver: " + qty + " tickets left");
                                qtySilver.setModel(new SpinnerNumberModel(0,0,qty,1));
                                silver.setEnabled(qty > 0);
                            }
                            case "bronze" -> {
                                lblBronze.setText("Bronze: " + qty + " tickets left");
                                qtyBronze.setModel(new SpinnerNumberModel(0,0,qty,1));
                                bronze.setEnabled(qty > 0);
                            }
                        }
                    } else if (concertName.equals("Hyeri Fan Meeting Tour 2025")){
                        switch(type){
                            case "vip3" -> {
                                lblVIP3.setText("VIP: " + qty + " tickets left");
                                qtyVip3.setModel(new SpinnerNumberModel(0,0,qty,1));
                                vip3.setEnabled(qty > 0);
                            }
                            case "cat1" -> {
                                lblCat1.setText("Cat. 1: " + qty + " tickets left");
                                qtyCat1.setModel(new SpinnerNumberModel(0,0,qty,1));
                                cat1.setEnabled(qty > 0);
                            }
                            case "cat2" -> {
                                lblCat2.setText("Cat. 2: " + qty + " tickets left");
                                qtyCat2.setModel(new SpinnerNumberModel(0,0,qty,1));
                                cat2.setEnabled(qty > 0);
                            }
                            case "cat3" -> {
                                lblCat3.setText("Cat. 3: " + qty + " tickets left");
                                qtyCat3.setModel(new SpinnerNumberModel(0,0,qty,1));
                                cat3.setEnabled(qty > 0);
                            }
                        }
                    }
                }

                rs.close();
                pst.close();

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "❌ Error loading available tickets.");
            }
        }
    private void loadBookingHistory() {
    DefaultTableModel model = (DefaultTableModel) tblBookingHistory.getModel();
    model.setRowCount(0); // Clear existing rows

    try {
        try (Connection conn = DatabaseConnection.connectDB()) {
            String sql = "SELECT ticket_id, concert_name, price, quantity, total_cost, booking_date FROM tickets WHERE user_id = ?";
            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setInt(1, userId);
                ResultSet rs = pst.executeQuery();
                
                while (rs.next()) {
                    Object[] row = {
                        rs.getInt("ticket_id"),
                        rs.getString("concert_name"),
                        rs.getDouble("price"),
                        rs.getInt("quantity"),
                        rs.getDouble("total_cost"),
                        rs.getTimestamp("booking_date")
                    };
                    model.addRow(row);
                }
                
                rs.close();
            }
        }

    } catch (Exception e) {
            e.printStackTrace();
    }
}
    private void updateTotalCost1() {
    double total = 0;

    if (floorA.isSelected()) {
        int qty = (int) qtyFloorA.getValue();
        total += 5550 * qty;
    }

    if (floorB.isSelected()) {
        int qty = (int) qtyFloorB.getValue();
        total += 4550 * qty;
    }

    if (loge.isSelected()) {
        int qty = (int) qtyLoge.getValue();
        total += 3750 * qty;
    }

    if (balcony1.isSelected()) {
        int qty = (int) qtyBalcony1.getValue();
        total += 2750 * qty;
    }

    if (balcony2.isSelected()) {
        int qty = (int) qtyBalcony2.getValue();
        total += 1750 * qty;
    }

    // Apply PHP 150 service fee if at least one ticket was selected
    if (total > 0) {
        total += 150;
    }

    totalCostLabel.setText(String.format("Total: PHP %.2f", total));
}
    private void updateTotalCost2() {
    double total = 0;

    if (vvip.isSelected()) {
        int qty = (int) qtyVvip.getValue();
        total += 12000 * qty;
    }

    if (vip.isSelected()) {
        int qty = (int) qtyVip.getValue();
        total += 10000 * qty;
    }

    if (patron.isSelected()) {
        int qty = (int) qtyPatron.getValue();
        total += 8500 * qty;
    }

    if (lowerBox.isSelected()) {
        int qty = (int) qtyLowerBox.getValue();
        total += 6500 * qty;
    }

    if (upperBox.isSelected()) {
        int qty = (int) qtyUpperBox.getValue();
        total += 2750 * qty;
    }
    
    if (generalAd.isSelected()){
        int qty = (int) qtyGeneralAd.getValue();
        total += 1750 * qty;
    }

    // Apply PHP 150 service fee if at least one ticket was selected
    if (total > 0) {
        total += 150;
    }

    totalCostLabel1.setText(String.format("Total: PHP %.2f", total));
    }
    private void updateTotalCost3() {
    double total = 0;

    if (platinum.isSelected()) {
        int qty = (int) qtyPlatinum.getValue();
        total += 15000 * qty;
    }

    if (svip.isSelected()) {
        int qty = (int) qtySvip.getValue();
        total += 12000 * qty;
    }
    
    if (vip1.isSelected()) {
        int qty = (int) qtyVip1.getValue();
        total += 8000 * qty;
    }

    if (patron1.isSelected()) {
        int qty = (int) qtyPatron1.getValue();
        total += 6000 * qty;
    }

    if (lowerBox1.isSelected()) {
        int qty = (int) qtyLowerBox1.getValue();
        total += 4000 * qty;
    }

    if (upperBox1.isSelected()) {
        int qty = (int) qtyUpperBox1.getValue();
        total += 1500 * qty;
    }
    
    if (generalAd1.isSelected()){
        int qty = (int) qtyGeneralAd1.getValue();
        total += 500 * qty;
    }

        // Apply PHP 150 service fee if at least one ticket was selected
        if (total > 0) {
            total += 150;
        }

        totalCostLabel2.setText(String.format("Total: PHP %.2f", total));
    }
    private void updateTotalCost4() {
    double total = 0;

    if (gold.isSelected()) {
        int qty = (int) qtyGold.getValue();
        total += 12800 * qty;
    }

    if (silver.isSelected()) {
        int qty = (int) qtySilver.getValue();
        total += 9000 * qty;
    }

    if (bronze.isSelected()) {
        int qty = (int) qtyBronze.getValue();
        total += 5870 * qty;
    }

    // Apply PHP 150 service fee if at least one ticket was selected
    if (total > 0) {
        total += 150;
    }

    totalCostLabel3.setText(String.format("Total: PHP %.2f", total));
}
    private void updateTotalCost5() {
    double total = 0;

    if (vip3.isSelected()) {
        int qty = (int) qtyVip3.getValue();
        total += 10900 * qty;
    }

    if (cat1.isSelected()) {
        int qty = (int) qtyCat1.getValue();
        total += 7800 * qty;
    }

    if (cat2.isSelected()) {
        int qty = (int) qtyCat2.getValue();
        total += 5800 * qty;
    }
    
    if (cat3.isSelected()) {
        int qty = (int) qtyCat3.getValue();
        total += 3900 * qty;
    }

    // Apply PHP 150 service fee if at least one ticket was selected
    if (total > 0) {
        total += 150;
    }

    totalCostLabel4.setText(String.format("Total: PHP %.2f", total));
}
    public void loadUserProfile(int userId) {
        try (Connection conn = DatabaseConnection.connectDB()) {
            if  (conn == null) {
                System.out.println("❌ Connection is null");
                return;
            }
            System.out.println("📥 Loading profile for userId: " + userId);
            
            String sql = "SELECT name, email, password, age, gender, birthdate FROM users WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                lblName.setText(rs.getString("name"));
                lblEmail.setText(rs.getString("email"));
                lblPassword.setText(rs.getString("password"));
                lblAge.setText(String.valueOf(rs.getInt("age")));
                lblGender.setText(rs.getString("gender"));
                lblBirthdate.setText(rs.getDate("birthdate").toString());
            } else {
                System.out.println("❌ No user found with ID: " + userId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    public MainFrame(int userId) {
        initComponents();
        this.userId = userId;
        
        // Set Table Header into BOLD
        javax.swing.table.JTableHeader header = tblBookingHistory.getTableHeader();
        header.setFont(new java.awt.Font("Poppins", java.awt.Font.BOLD, 14));
        
        // Set table to Unable to Move
        tblBookingHistory.getColumnModel().getColumn(0).setPreferredWidth(70);  // Ticket ID
        tblBookingHistory.getColumnModel().getColumn(1).setPreferredWidth(200); // Concert Name
        tblBookingHistory.getColumnModel().getColumn(2).setPreferredWidth(100); // Price
        tblBookingHistory.getColumnModel().getColumn(3).setPreferredWidth(120); // Quantity
        tblBookingHistory.getColumnModel().getColumn(4).setPreferredWidth(120); // Total
        tblBookingHistory.getColumnModel().getColumn(5).setPreferredWidth(180); // Date
        tblBookingHistory.getTableHeader().setResizingAllowed(false);
        
        // Set Checkboxes Opaque False
        floorA.setOpaque(false);
        floorB.setOpaque(false);
        loge.setOpaque(false);
        balcony1.setOpaque(false);
        balcony2.setOpaque(false);
        
        vvip.setOpaque(false);
        vip.setOpaque(false);
        patron.setOpaque(false);
        lowerBox.setOpaque(false);
        upperBox.setOpaque(false);
        generalAd.setOpaque(false);
        
        platinum.setOpaque(false);
        svip.setOpaque(false);
        vip1.setOpaque(false);
        patron1.setOpaque(false);
        lowerBox1.setOpaque(false);
        upperBox1.setOpaque(false);
        generalAd1.setOpaque(false);
        
        gold.setOpaque(false);
        silver.setOpaque(false);
        bronze.setOpaque(false);
        
        vip3.setOpaque(false);
        cat1.setOpaque(false);
        cat2.setOpaque(false);
        cat3.setOpaque(false);

        // Load Profile and Booking HIstory
        loadUserProfile(userId);
        loadBookingHistory();
        
        // Extra JFrame Aesthetics.
        setTitle("GigHub");
        ImageIcon appIcon = new ImageIcon(getClass().getResource("/githubmainapp/Images/GigHub IconLogo.png"));
        this.setIconImage(appIcon.getImage());
        
        // Set Scroll to be Faster.
        beabadoobeePanel.getVerticalScrollBar().setUnitIncrement(16);
        parkSeoJunPanel.getVerticalScrollBar().setUnitIncrement(16);
        regineAndVicePanel.getVerticalScrollBar().setUnitIncrement(16);
        kennygPanel.getVerticalScrollBar().setUnitIncrement(16);
        hyeriPanel.getVerticalScrollBar().setUnitIncrement(16);
        
        // Center Mainframe upon launching
        setLocationRelativeTo(null);
        mods4Objects();
        compMods();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ticketGroup = new javax.swing.ButtonGroup();
        ticketGroup2 = new javax.swing.ButtonGroup();
        ticketGroup3 = new javax.swing.ButtonGroup();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        sideMainPanel = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        mainPanel = new keeptoo.KGradientPanel();
        homePanel = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnLeft = new javax.swing.JButton();
        concertButton1 = new javax.swing.JButton();
        concertButton2 = new javax.swing.JButton();
        concertButton3 = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        captionLabel1 = new javax.swing.JLabel();
        captionLabel2 = new javax.swing.JLabel();
        captionLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dateLabel1 = new javax.swing.JLabel();
        dateLabel2 = new javax.swing.JLabel();
        dateLabel3 = new javax.swing.JLabel();
        aboutUs = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextArea3 = new javax.swing.JTextArea();
        generalInquiry = new keeptoo.KGradientPanel();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtFirstName = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txtLastName = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        txtMI = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        txtSubjectEvent = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        txtEmailAddress = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        txtContactNumber = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jCheckBox1 = new javax.swing.JCheckBox();
        beabadoobeePanel = new javax.swing.JScrollPane();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        beabadoobeeBuyTicket = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel103 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        beabadoobeeBuy = new keeptoo.KGradientPanel();
        jLabel55 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        purchaseButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        dates = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        totalCostLabel = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        floorA = new javax.swing.JCheckBox();
        floorB = new javax.swing.JCheckBox();
        balcony1 = new javax.swing.JCheckBox();
        balcony2 = new javax.swing.JCheckBox();
        loge = new javax.swing.JCheckBox();
        qtyFloorB = new javax.swing.JSpinner();
        qtyFloorA = new javax.swing.JSpinner();
        qtyLoge = new javax.swing.JSpinner();
        qtyBalcony1 = new javax.swing.JSpinner();
        qtyBalcony2 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        lblFloorB = new javax.swing.JLabel();
        lblFloorA = new javax.swing.JLabel();
        lblBalcony2 = new javax.swing.JLabel();
        lblLoge = new javax.swing.JLabel();
        lblBalcony1 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        parkSeoJunPanel = new javax.swing.JScrollPane();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        psjBuyTicket = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        parkSeoJunBuy = new keeptoo.KGradientPanel();
        jLabel82 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        purchaseButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        dates1 = new javax.swing.JComboBox<>();
        jLabel86 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        totalCostLabel1 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        lowerBox = new javax.swing.JCheckBox();
        vvip = new javax.swing.JCheckBox();
        vip = new javax.swing.JCheckBox();
        patron = new javax.swing.JCheckBox();
        upperBox = new javax.swing.JCheckBox();
        generalAd = new javax.swing.JCheckBox();
        qtyLowerBox = new javax.swing.JSpinner();
        qtyGeneralAd = new javax.swing.JSpinner();
        qtyUpperBox = new javax.swing.JSpinner();
        qtyPatron = new javax.swing.JSpinner();
        qtyVvip = new javax.swing.JSpinner();
        qtyVip = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        lblVVIP = new javax.swing.JLabel();
        lblVIP = new javax.swing.JLabel();
        lblPatron = new javax.swing.JLabel();
        lbllowerBox = new javax.swing.JLabel();
        lblupperBox = new javax.swing.JLabel();
        lblGenAd = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        regineAndVicePanel = new javax.swing.JScrollPane();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        regineAndViceBuyTicket = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel131 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        regineAndViceBuy = new keeptoo.KGradientPanel();
        jLabel125 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        purchaseButton2 = new javax.swing.JButton();
        jLabel126 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        dates2 = new javax.swing.JComboBox<>();
        jLabel147 = new javax.swing.JLabel();
        fullNameTextField = new javax.swing.JTextField();
        totalCostLabel2 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        patron1 = new javax.swing.JCheckBox();
        vip1 = new javax.swing.JCheckBox();
        platinum = new javax.swing.JCheckBox();
        svip = new javax.swing.JCheckBox();
        upperBox1 = new javax.swing.JCheckBox();
        generalAd1 = new javax.swing.JCheckBox();
        lowerBox1 = new javax.swing.JCheckBox();
        qtyPlatinum = new javax.swing.JSpinner();
        qtyVip1 = new javax.swing.JSpinner();
        qtySvip = new javax.swing.JSpinner();
        qtyPatron1 = new javax.swing.JSpinner();
        qtyLowerBox1 = new javax.swing.JSpinner();
        qtyUpperBox1 = new javax.swing.JSpinner();
        qtyGeneralAd1 = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        lblSVIP = new javax.swing.JLabel();
        lblVIP1 = new javax.swing.JLabel();
        lblPatron1 = new javax.swing.JLabel();
        lbllowerBox1 = new javax.swing.JLabel();
        lblupperBox1 = new javax.swing.JLabel();
        lblGenAd1 = new javax.swing.JLabel();
        lblPlatinum = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        kennygPanel = new javax.swing.JScrollPane();
        kGradientPanel10 = new keeptoo.KGradientPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        beabadoobeeBuyTicket1 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        kennygBuy = new keeptoo.KGradientPanel();
        jLabel170 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        kGradientPanel11 = new keeptoo.KGradientPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        purchaseButton3 = new javax.swing.JButton();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        dates3 = new javax.swing.JComboBox<>();
        jLabel183 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        totalCostLabel3 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel184 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        gold = new javax.swing.JCheckBox();
        silver = new javax.swing.JCheckBox();
        bronze = new javax.swing.JCheckBox();
        qtySilver = new javax.swing.JSpinner();
        qtyGold = new javax.swing.JSpinner();
        qtyBronze = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        lblGold = new javax.swing.JLabel();
        lblBronze = new javax.swing.JLabel();
        lblSilver = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        hyeriPanel = new javax.swing.JScrollPane();
        kGradientPanel12 = new keeptoo.KGradientPanel();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        beabadoobeeBuyTicket2 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        hyeriPanelBuy = new keeptoo.KGradientPanel();
        jLabel221 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        kGradientPanel13 = new keeptoo.KGradientPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        purchaseButton4 = new javax.swing.JButton();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        dates4 = new javax.swing.JComboBox<>();
        jLabel225 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        totalCostLabel4 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel226 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel230 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        vip3 = new javax.swing.JCheckBox();
        cat1 = new javax.swing.JCheckBox();
        cat2 = new javax.swing.JCheckBox();
        qtyCat1 = new javax.swing.JSpinner();
        qtyVip3 = new javax.swing.JSpinner();
        qtyCat2 = new javax.swing.JSpinner();
        cat3 = new javax.swing.JCheckBox();
        qtyCat3 = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        lblVIP3 = new javax.swing.JLabel();
        lblCat1 = new javax.swing.JLabel();
        lblCat3 = new javax.swing.JLabel();
        lblCat2 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        infoCustomer = new keeptoo.KGradientPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jTextArea6 = new javax.swing.JTextArea();
        jTextArea7 = new javax.swing.JTextArea();
        jTextArea8 = new javax.swing.JTextArea();
        jTextArea9 = new javax.swing.JTextArea();
        jTextArea10 = new javax.swing.JTextArea();
        jTextArea11 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        profilePanel = new keeptoo.KGradientPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel156 = new javax.swing.JLabel();
        kGradientPanel8 = new keeptoo.KGradientPanel();
        jButton8 = new javax.swing.JButton();
        jLabel155 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JTextField();
        lblName = new javax.swing.JTextField();
        lblGender = new javax.swing.JTextField();
        lblBirthdate = new javax.swing.JTextField();
        lblAge = new javax.swing.JTextField();
        editSaveButton = new javax.swing.JButton();
        jLabel165 = new javax.swing.JLabel();
        lblPassword = new javax.swing.JPasswordField();
        showPasswordCheckBoxProfilePage = new javax.swing.JCheckBox();
        jLabel159 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        bookingHistoryPanel = new keeptoo.KGradientPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        kGradientPanel9 = new keeptoo.KGradientPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBookingHistory = new javax.swing.JTable();
        jLabel168 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);

        kGradientPanel3.setkEndColor(new java.awt.Color(31, 52, 96));
        kGradientPanel3.setkGradientFocus(0);
        kGradientPanel3.setkStartColor(new java.awt.Color(20, 22, 26));
        kGradientPanel3.setMaximumSize(new java.awt.Dimension(1280, 720));
        kGradientPanel3.setMinimumSize(new java.awt.Dimension(1280, 720));
        kGradientPanel3.setPreferredSize(new java.awt.Dimension(1280, 720));

        sideMainPanel.setkEndColor(new java.awt.Color(255, 240, 220));
        sideMainPanel.setkStartColor(new java.awt.Color(255, 240, 220));
        sideMainPanel.setPreferredSize(new java.awt.Dimension(250, 720));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/GigHubNameTryLang.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/home.png"))); // NOI18N
        jButton1.setText("  HOME");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jButton2.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/info.png"))); // NOI18N
        jButton2.setText("  ABOUT US");
        jButton2.setToolTipText("");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusable(false);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jButton3.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/phone-call.png"))); // NOI18N
        jButton3.setText("  CONTACTS");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusable(false);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton4.setText("General Inquiry");
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton5.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton5.setText("Information and");
        jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusable(false);
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton6.setText("Customer Service");
        jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusable(false);
        jButton6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exitButton.setBackground(new java.awt.Color(255, 240, 220));
        exitButton.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/exit.png"))); // NOI18N
        exitButton.setText(" EXIT");
        exitButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jPanel32.setBackground(new java.awt.Color(255, 240, 220));

        jButton7.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/user.png"))); // NOI18N
        jButton7.setText("  PROFILE");
        jButton7.setToolTipText("");
        jButton7.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusable(false);
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        logoutButton.setBackground(new java.awt.Color(255, 240, 220));
        logoutButton.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/logout.png"))); // NOI18N
        logoutButton.setText("LOGOUT");
        logoutButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideMainPanelLayout = new javax.swing.GroupLayout(sideMainPanel);
        sideMainPanel.setLayout(sideMainPanelLayout);
        sideMainPanelLayout.setHorizontalGroup(
            sideMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sideMainPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(sideMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sideMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addGap(16, 16, 16))
        );
        sideMainPanelLayout.setVerticalGroup(
            sideMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideMainPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sideMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(logoutButton))
                .addContainerGap())
        );

        mainPanel.setkEndColor(new java.awt.Color(31, 52, 96));
        mainPanel.setkStartColor(new java.awt.Color(20, 22, 26));
        mainPanel.setMaximumSize(new java.awt.Dimension(1030, 720));
        mainPanel.setPreferredSize(new java.awt.Dimension(1030, 720));
        mainPanel.setLayout(new java.awt.CardLayout());

        homePanel.setkEndColor(new java.awt.Color(31, 52, 96));
        homePanel.setkGradientFocus(0);
        homePanel.setkStartColor(new java.awt.Color(20, 22, 26));
        homePanel.setMaximumSize(new java.awt.Dimension(1030, 720));
        homePanel.setMinimumSize(new java.awt.Dimension(1030, 720));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 240, 220));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/GigHubNameWLogo1Test.png"))); // NOI18N
        jLabel2.setText("DISCOVER UPCOMING CONCERTS");
        jLabel2.setFocusable(false);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(-17);
        jLabel2.setPreferredSize(new java.awt.Dimension(1030, 197));
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        homePanel.add(jLabel2);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("jLabel3");
        homePanel.add(jLabel9);

        btnLeft.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        btnLeft.setForeground(new java.awt.Color(255, 240, 220));
        btnLeft.setText("<");
        btnLeft.setBorder(null);
        btnLeft.setBorderPainted(false);
        btnLeft.setContentAreaFilled(false);
        btnLeft.setFocusPainted(false);
        btnLeft.setFocusable(false);
        btnLeft.setMaximumSize(new java.awt.Dimension(90, 73));
        btnLeft.setMinimumSize(new java.awt.Dimension(90, 73));
        btnLeft.setPreferredSize(new java.awt.Dimension(90, 73));
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });
        homePanel.add(btnLeft);

        concertButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/beabadoobee2025D2EventPoster.jpg"))); // NOI18N
        concertButton1.setBorder(null);
        concertButton1.setBorderPainted(false);
        concertButton1.setContentAreaFilled(false);
        concertButton1.setFocusPainted(false);
        concertButton1.setFocusable(false);
        concertButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concertButton1ActionPerformed(evt);
            }
        });
        homePanel.add(concertButton1);

        concertButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/ParkSeoJun.png"))); // NOI18N
        concertButton2.setBorder(null);
        concertButton2.setBorderPainted(false);
        concertButton2.setContentAreaFilled(false);
        concertButton2.setFocusPainted(false);
        concertButton2.setFocusable(false);
        concertButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concertButton2ActionPerformed(evt);
            }
        });
        homePanel.add(concertButton2);

        concertButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/Superdivas_303x430.jpg"))); // NOI18N
        concertButton3.setBorder(null);
        concertButton3.setBorderPainted(false);
        concertButton3.setContentAreaFilled(false);
        concertButton3.setFocusPainted(false);
        concertButton3.setFocusable(false);
        concertButton3.setMaximumSize(new java.awt.Dimension(230, 326));
        concertButton3.setMinimumSize(new java.awt.Dimension(230, 326));
        concertButton3.setPreferredSize(new java.awt.Dimension(230, 326));
        concertButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concertButton3ActionPerformed(evt);
            }
        });
        homePanel.add(concertButton3);

        btnRight.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        btnRight.setForeground(new java.awt.Color(255, 240, 220));
        btnRight.setText(">");
        btnRight.setBorder(null);
        btnRight.setBorderPainted(false);
        btnRight.setContentAreaFilled(false);
        btnRight.setFocusPainted(false);
        btnRight.setFocusable(false);
        btnRight.setMaximumSize(new java.awt.Dimension(80, 73));
        btnRight.setMinimumSize(new java.awt.Dimension(80, 73));
        btnRight.setPreferredSize(new java.awt.Dimension(90, 73));
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });
        homePanel.add(btnRight);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("jLabel2");
        homePanel.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("sasdasasdasdsad");
        homePanel.add(jLabel11);

        captionLabel1.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        captionLabel1.setForeground(new java.awt.Color(255, 240, 220));
        captionLabel1.setText("beabadoobee");
        captionLabel1.setFocusable(false);
        captionLabel1.setMaximumSize(new java.awt.Dimension(230, 90));
        captionLabel1.setMinimumSize(new java.awt.Dimension(230, 90));
        captionLabel1.setName(""); // NOI18N
        captionLabel1.setPreferredSize(new java.awt.Dimension(230, 90));
        homePanel.add(captionLabel1);

        captionLabel2.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        captionLabel2.setForeground(new java.awt.Color(255, 240, 220));
        captionLabel2.setText("<html>FIT FOR ANY ROLE:<br>PARK SEO JUN</html>");
        captionLabel2.setFocusable(false);
        captionLabel2.setMaximumSize(new java.awt.Dimension(230, 90));
        captionLabel2.setMinimumSize(new java.awt.Dimension(230, 90));
        captionLabel2.setPreferredSize(new java.awt.Dimension(230, 90));
        homePanel.add(captionLabel2);

        captionLabel3.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        captionLabel3.setForeground(new java.awt.Color(255, 240, 220));
        captionLabel3.setText("<html>REGINE VELASQUEZ-<br>ALCASID & VICE<br>GANDA</html>");
        captionLabel3.setFocusable(false);
        captionLabel3.setMaximumSize(new java.awt.Dimension(230, 90));
        captionLabel3.setMinimumSize(new java.awt.Dimension(230, 90));
        captionLabel3.setPreferredSize(new java.awt.Dimension(230, 90));
        homePanel.add(captionLabel3);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("sasdasasdasdsad");
        homePanel.add(jLabel12);

        dateLabel1.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        dateLabel1.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel1.setText("August 12-13, 2025 - 8PM");
        dateLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        dateLabel1.setFocusable(false);
        dateLabel1.setMaximumSize(new java.awt.Dimension(230, 25));
        dateLabel1.setMinimumSize(new java.awt.Dimension(230, 25));
        dateLabel1.setPreferredSize(new java.awt.Dimension(230, 25));
        homePanel.add(dateLabel1);

        dateLabel2.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        dateLabel2.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel2.setText("<html>July 12, 2025 - 2PM PRE-<br> EVENT EXPO | 6PM SHOW<html>");
        dateLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        dateLabel2.setFocusable(false);
        dateLabel2.setMaximumSize(new java.awt.Dimension(230, 25));
        dateLabel2.setMinimumSize(new java.awt.Dimension(230, 25));
        dateLabel2.setPreferredSize(new java.awt.Dimension(230, 25));
        homePanel.add(dateLabel2);

        dateLabel3.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        dateLabel3.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel3.setText("August 08-09, 2025 - 8PM");
        dateLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        dateLabel3.setFocusable(false);
        dateLabel3.setMaximumSize(new java.awt.Dimension(230, 25));
        dateLabel3.setMinimumSize(new java.awt.Dimension(230, 25));
        dateLabel3.setPreferredSize(new java.awt.Dimension(230, 25));
        homePanel.add(dateLabel3);

        mainPanel.add(homePanel, "cardHomePanel");

        aboutUs.setkEndColor(new java.awt.Color(31, 52, 96));
        aboutUs.setkGradientFocus(0);
        aboutUs.setkStartColor(new java.awt.Color(20, 22, 26));
        aboutUs.setMaximumSize(new java.awt.Dimension(1030, 720));
        aboutUs.setMinimumSize(new java.awt.Dimension(1030, 720));
        aboutUs.setOpaque(false);
        aboutUs.setBounds(0, 0, 1030, 705);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/GigHubNameWLogo1TestLarger.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 50)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 240, 220));
        jLabel4.setText("WELCOME TO GIGHUB");

        jTextArea1.setBackground(null);
        jTextArea1.setEditable(false);
        jTextArea1.setColumns(35);
        jTextArea1.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 240, 220));
        jTextArea1.setRows(4);
        jTextArea1.setText("Tired of missing out on your favorite artists? Sick of clunky booking sites and \nconfusing ticketing systems? GigHub is your all-in-one concert booking platform \nbuilt for fans, by fans. Whether it’s a bar gig in Manila or a stadium show in Cebu, \nwe’ve got you covered.");
        jTextArea1.setCaretColor(new java.awt.Color(255, 255, 204));
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.setOpaque(false);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(35);
        jTextArea2.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 240, 220));
        jTextArea2.setRows(2);
        jTextArea2.setText("To bring people closer to the live music they love — by making concert \ndiscovery and booking effortless, exciting, and unforgettable.");
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea2.setOpaque(false);

        jLabel18.setFont(new java.awt.Font("Poppins ExtraBold", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 240, 220));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Our Mission: ");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel19.setFont(new java.awt.Font("Poppins Medium", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 240, 220));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("The stage is set. Are you in?");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(35);
        jTextArea3.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 240, 220));
        jTextArea3.setRows(2);
        jTextArea3.setText("Whether you’re a hardcore fan or just looking for a good night out, \nGigHub helps you find the sound — and own the night.");
        jTextArea3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea3.setOpaque(false);

        javax.swing.GroupLayout aboutUsLayout = new javax.swing.GroupLayout(aboutUs);
        aboutUs.setLayout(aboutUsLayout);
        aboutUsLayout.setHorizontalGroup(
            aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutUsLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(aboutUsLayout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutUsLayout.createSequentialGroup()
                .addGap(0, 156, Short.MAX_VALUE)
                .addGroup(aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutUsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel19))
                    .addComponent(jLabel18)
                    .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutUsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutUsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
        aboutUsLayout.setVerticalGroup(
            aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutUsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(726, 726, 726))
        );

        mainPanel.add(aboutUs, "card3");

        generalInquiry.setkEndColor(new java.awt.Color(31, 52, 96));
        generalInquiry.setkGradientFocus(0);
        generalInquiry.setkStartColor(new java.awt.Color(20, 22, 26));
        generalInquiry.setMaximumSize(new java.awt.Dimension(1030, 720));
        generalInquiry.setMinimumSize(new java.awt.Dimension(1030, 720));
        generalInquiry.setPreferredSize(new java.awt.Dimension(1030, 720));

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(30);
        jTextArea5.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(255, 240, 220));
        jTextArea5.setRows(3);
        jTextArea5.setText("By clicking here, I give my consent to GigHub to collect and \nprocess my personal data according to its terms and\nconditions, and privacy policy.");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/GigHubNameWLogo1Test.png"))); // NOI18N

        RoundedPanelHelper.makeRounded(jPanel5, 30);
        jPanel5.setBackground(new java.awt.Color(255, 240, 220));

        jLabel21.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel21.setText("GENERAL INQUIRY");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        RoundedPanelHelper.makeRounded(jPanel6, 30);
        jPanel6.setBackground(iThinkBeige);

        txtFirstName.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtFirstName.setText("First Name*");
        txtFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFirstNameFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RoundedPanelHelper.makeRounded(jPanel7, 30);
        jPanel7.setBackground(iThinkBeige);

        txtLastName.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtLastName.setText("Last Name*");
        txtLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLastNameFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RoundedPanelHelper.makeRounded(jPanel8, 30);
        jPanel8.setBackground(iThinkBeige);

        txtMI.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtMI.setText("M.I.*");
        txtMI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMIFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMI, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RoundedPanelHelper.makeRounded(jPanel9, 30);
        jPanel9.setBackground(iThinkBeige);

        txtSubjectEvent.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtSubjectEvent.setText("Subject Event*");
        txtSubjectEvent.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSubjectEventFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSubjectEvent)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSubjectEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RoundedPanelHelper.makeRounded(jPanel11, 30);
        jPanel11.setBackground(iThinkBeige);

        String email = UserSession.getEmail();
        txtEmailAddress.setText(email);
        txtEmailAddress.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtEmailAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailAddressFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEmailAddress)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RoundedPanelHelper.makeRounded(jPanel12, 30);
        jPanel12.setBackground(iThinkBeige);

        txtContactNumber.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtContactNumber.setText("Contact No.*");
        txtContactNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContactNumberFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtContactNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RoundedPanelHelper.makeRounded(jPanel14, 30);
        jPanel14.setBackground(iThinkBeige);

        jScrollPane3.setOpaque(false);                      // ScrollPane background transparent
        jScrollPane3.getViewport().setOpaque(false);        // Viewport background transparent
        jScrollPane3.setBackground(new java.awt.Color(244, 207, 145));
        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtMessage.setLineWrap(true);
        txtMessage.setOpaque(false);
        txtMessage.setBackground(new Color(0, 0, 0, 0));
        txtMessage.setColumns(40);
        txtMessage.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtMessage.setRows(6);
        txtMessage.setText("Message*");
        txtMessage.setWrapStyleWord(true);
        txtMessage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMessageFocusGained(evt);
            }
        });
        jScrollPane3.setViewportView(txtMessage);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(285, 285, 285))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        RoundedPanelHelper.makeRounded(jPanel10, 70);
        jPanel10.setBackground(new java.awt.Color(255, 240, 220));

        RoundedPanelHelper.makeRounded(jPanel13, 60);
        jPanel13.setBackground(new java.awt.Color(31, 52, 96));

        submitButton.setEnabled(false);
        submitButton.setBackground(new java.awt.Color(255, 240, 220));
        submitButton.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 240, 220));
        submitButton.setText("SUBMIT");
        submitButton.setBorder(null);
        submitButton.setBorderPainted(false);
        submitButton.setContentAreaFilled(false);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout generalInquiryLayout = new javax.swing.GroupLayout(generalInquiry);
        generalInquiry.setLayout(generalInquiryLayout);
        generalInquiryLayout.setHorizontalGroup(
            generalInquiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalInquiryLayout.createSequentialGroup()
                .addGroup(generalInquiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(generalInquiryLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextArea5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(generalInquiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(generalInquiryLayout.createSequentialGroup()
                            .addGap(390, 390, 390)
                            .addComponent(jLabel20))
                        .addGroup(generalInquiryLayout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        generalInquiryLayout.setVerticalGroup(
            generalInquiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalInquiryLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(generalInquiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(generalInquiryLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(generalInquiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextArea5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(generalInquiryLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jCheckBox1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        mainPanel.add(generalInquiry, "card4");

        beabadoobeePanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        beabadoobeePanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        beabadoobeePanel.setAutoscrolls(true);
        beabadoobeePanel.setFocusCycleRoot(true);
        beabadoobeePanel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        beabadoobeePanel.setHorizontalScrollBar(null);
        beabadoobeePanel.setOpaque(false);
        beabadoobeePanel.setPreferredSize(new java.awt.Dimension(1118, 2180));

        kGradientPanel1.setkEndColor(new java.awt.Color(31, 52, 96));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(20, 22, 26));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1100, 2180));

        jTextArea1.setBackground(null);
        jTextArea4.setEditable(false);
        jTextArea4.setColumns(35);
        jTextArea4.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(242, 242, 242));
        jTextArea4.setRows(4);
        jTextArea4.setText("Born in the Philippines and raised in London, Beatrice Laus, known as \nbeabadoobee, has emerged as a British indie icon. With three \nacclaimed hit albums and five diverse EPs, not least last year’s #1 \nrecord ‘This Is How Tomorrow Moves’, she’s garnered multiple BRIT \nAward nominations, in excess of 5 billion streams globally, a \ndedicated Gen-Z fanbase and a 12 million+ social reach.\n\nbeabadoobee has sold out headline tours globally including stops at \nLondon’s Alexandra Palace and multiple nights at LA’s Greek Theatre \nas well as appearing at festivals including Glastonbury, Coachella, \nGovernors Ball and Reading & Leeds and supporting artists like Taylor \nSwift and The 1975 on the road.");
        jTextArea4.setCaretColor(new java.awt.Color(255, 255, 204));
        jTextArea4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea4.setOpaque(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/beabadoobeeFULL.jpg"))); // NOI18N

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/GigHubNameWLogo1Test.png"))); // NOI18N
        jLabel28.setToolTipText("");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel28.setFocusable(false);
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel28.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel29.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 240, 220));
        jLabel29.setText("beabadoobee ");

        jLabel30.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(244, 207, 145));
        jLabel30.setText("beabadoobee Asia Tour 2025 Manila ");

        jLabel31.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 240, 220));
        jLabel31.setText("Ticket Prices");

        jLabel33.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 240, 220));
        jLabel33.setText("August 12-13, 2025 - 8PM");

        jLabel35.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 240, 220));
        jLabel35.setText("Balcony 2                               1,750 PHP");

        jLabel36.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 240, 220));
        jLabel36.setText("Floor A                                    5,550 PHP ");

        jLabel37.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 240, 220));
        jLabel37.setText("Floor B                                    4,550 PHP ");

        jLabel38.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 240, 220));
        jLabel38.setText("Loge                                        3,750 PHP");

        jLabel39.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 240, 220));
        jLabel39.setText("Balcony 1                                2,750 PHP");

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/beabadoobee2025D2WebMap.jpg"))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText(" ");

        jLabel50.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 240, 220));
        jLabel50.setText("-----------------------------------------------------------");

        jLabel51.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 240, 220));
        jLabel51.setText("-----------------------------------------------------------");

        jLabel52.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 240, 220));
        jLabel52.setText("-----------------------------------------------------------");

        jLabel53.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 240, 220));
        jLabel53.setText("-----------------------------------------------------------");

        jButton10.setBackground(new java.awt.Color(255, 240, 220));
        jButton10.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 240, 220));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/arrow-88-32.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        RoundedPanelHelper.makeRounded(jPanel17, 70);
        jPanel17.setBackground(new java.awt.Color(255, 240, 220));
        jPanel17.setForeground(new java.awt.Color(20, 22, 26));

        RoundedPanelHelper.makeRounded(jPanel18, 60);
        jPanel18.setBackground(new java.awt.Color(15, 23, 42));
        jPanel18.setForeground(new java.awt.Color(20, 22, 26));

        beabadoobeeBuyTicket.setBackground(new java.awt.Color(255, 240, 220));
        beabadoobeeBuyTicket.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        beabadoobeeBuyTicket.setForeground(new java.awt.Color(255, 240, 220));
        beabadoobeeBuyTicket.setText("BUY TICKET");
        beabadoobeeBuyTicket.setBorder(null);
        beabadoobeeBuyTicket.setBorderPainted(false);
        beabadoobeeBuyTicket.setContentAreaFilled(false);
        beabadoobeeBuyTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beabadoobeeBuyTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(beabadoobeeBuyTicket, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(beabadoobeeBuyTicket, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton15.setBackground(new java.awt.Color(24, 28, 44));
        jButton15.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 240, 220));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/white-down-arrow-png-2.png"))); // NOI18N
        jButton15.setText("For More Information");
        jButton15.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-calendar-24.png"))); // NOI18N

        jLabel140.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(244, 207, 145));
        jLabel140.setText("SEAT");

        jLabel141.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(255, 240, 220));
        jLabel141.setText("PLAN");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(301, 301, 301)
                        .addComponent(jLabel28))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel31)
                                            .addComponent(jLabel29)
                                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel33))))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel36)
                                            .addComponent(jLabel35)
                                            .addComponent(jLabel39)
                                            .addComponent(jLabel52)
                                            .addComponent(jLabel53)
                                            .addComponent(jLabel51)
                                            .addComponent(jLabel37)
                                            .addComponent(jLabel38)
                                            .addComponent(jLabel50)))))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(450, 450, 450)
                                .addComponent(jButton15))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel140)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel141))
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel34)
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addComponent(jTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel44)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE))))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel51)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel50)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel141, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel140, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel44))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(812, 812, 812))
        );

        beabadoobeePanel.setViewportView(kGradientPanel1);

        mainPanel.add(beabadoobeePanel, "cardBea");

        beabadoobeeBuy.setkEndColor(new java.awt.Color(31, 52, 96));
        beabadoobeeBuy.setkGradientFocus(0);
        beabadoobeeBuy.setkStartColor(new java.awt.Color(20, 22, 26));
        beabadoobeeBuy.setMaximumSize(new java.awt.Dimension(1030, 720));
        beabadoobeeBuy.setMinimumSize(new java.awt.Dimension(1030, 720));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/GigHubNameWLogo1Test.png"))); // NOI18N
        jLabel55.setToolTipText("");
        jLabel55.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel55.setFocusable(false);
        jLabel55.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel55.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jPanel19.setBackground(new java.awt.Color(255, 240, 220));

        kGradientPanel2.setkEndColor(new java.awt.Color(31, 52, 96));
        kGradientPanel2.setkGradientFocus(0);
        kGradientPanel2.setkStartColor(new java.awt.Color(20, 22, 26));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RoundedPanelHelper.makeRounded(jPanel20, 70);
        jPanel20.setBackground(new java.awt.Color(255, 240, 220));
        jPanel20.setForeground(new java.awt.Color(20, 22, 26));

        RoundedPanelHelper.makeRounded(jPanel21, 60);
        jPanel21.setBackground(new java.awt.Color(32, 52, 92));
        jPanel21.setForeground(new java.awt.Color(32, 52, 92));

        purchaseButton.setEnabled(false);
        purchaseButton.setBackground(new java.awt.Color(255, 240, 220));
        purchaseButton.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        purchaseButton.setForeground(new java.awt.Color(255, 240, 220));
        purchaseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-purchase-48.png"))); // NOI18N
        purchaseButton.setText("PURCHASE TICKET");
        purchaseButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        purchaseButton.setBorderPainted(false);
        purchaseButton.setContentAreaFilled(false);
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchaseButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchaseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        kGradientPanel2.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 461, -1, -1));

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 240, 220));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/Screenshot 2025-06-24 135148.png"))); // NOI18N
        jLabel7.setText("  Buy Ticket - Beabadoobee Asia Tour 2025");
        kGradientPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 13, -1, -1));

        jLabel57.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 240, 220));
        jLabel57.setText("New Frontier Theater, Manila | August 12–13, 2025 | 8:00 PM");
        kGradientPanel2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 56, -1, -1));

        jLabel58.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 240, 220));
        jLabel58.setText("1. Select Date");
        kGradientPanel2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 125, -1, -1));

        dates.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        dates.setMaximumRowCount(3);
        dates.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Date:", "August 12", "August 13" }));
        dates.setToolTipText("");
        dates.setAutoscrolls(true);
        dates.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kGradientPanel2.add(dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 154, 240, -1));

        jLabel59.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 240, 220));
        jLabel59.setText("2. Select Ticket  Type & Quantity");
        kGradientPanel2.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTextField5.selectAll();
        jTextField5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTextField5.setText("Full Name (Last, First M.I.)*");
        jTextField5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
        });
        kGradientPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 154, 439, 32));

        totalCostLabel.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        totalCostLabel.setForeground(new java.awt.Color(255, 240, 220));
        totalCostLabel.setText("Total:   PHP 0.00");
        kGradientPanel2.add(totalCostLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 396, -1, -1));

        jTextField8.selectAll();
        jTextField8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTextField8.setText("Contact Number (+639)*");
        jTextField8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField8FocusGained(evt);
            }
        });
        kGradientPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 242, 439, 32));

        jTextField9.setText(email);
        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTextField9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kGradientPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 198, 439, 32));

        jLabel61.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 240, 220));
        jLabel61.setText("3. Personal Information");
        kGradientPanel2.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 125, -1, -1));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-email-32.png"))); // NOI18N
        kGradientPanel2.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 198, -1, -1));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-phone-32.png"))); // NOI18N
        kGradientPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 242, -1, -1));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-person-32.png"))); // NOI18N
        kGradientPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 154, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox1.setMaximumRowCount(5);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Payment Method:", "PayMaya", "GCash", "Debit/Credit Card", "PayPal" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 321, 291, -1));

        jLabel65.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 240, 220));
        jLabel65.setText("4. Payment Method");
        kGradientPanel2.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 292, -1, -1));

        jLabel66.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 240, 220));
        jLabel66.setText("Service Fee: PHP 150.00");
        kGradientPanel2.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 432, -1, -1));

        jLabel67.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 240, 220));
        jLabel67.setText("5. Order Summary");
        kGradientPanel2.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 367, -1, -1));

        floorA.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        floorA.setForeground(new java.awt.Color(255, 240, 220));
        floorA.setText("  Floor A - PHP 5,550");
        floorA.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        floorA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                floorAItemStateChanged(evt);
            }
        });
        kGradientPanel2.add(floorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        floorB.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        floorB.setForeground(new java.awt.Color(255, 240, 220));
        floorB.setText("  Floor B - PHP 4,550");
        floorB.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        floorB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                floorBItemStateChanged(evt);
            }
        });
        kGradientPanel2.add(floorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        balcony1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        balcony1.setForeground(new java.awt.Color(255, 240, 220));
        balcony1.setText("  Balcony 1 - PHP 2,750");
        balcony1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        balcony1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                balcony1ItemStateChanged(evt);
            }
        });
        kGradientPanel2.add(balcony1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        balcony2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        balcony2.setForeground(new java.awt.Color(255, 240, 220));
        balcony2.setText("  Balcony 2 - PHP 1,750");
        balcony2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        balcony2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                balcony2ItemStateChanged(evt);
            }
        });
        kGradientPanel2.add(balcony2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        loge.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        loge.setForeground(new java.awt.Color(255, 240, 220));
        loge.setText("  Loge - PHP 3,750");
        loge.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        loge.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                logeItemStateChanged(evt);
            }
        });
        kGradientPanel2.add(loge, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        qtyFloorB.setVisible(false);
        qtyFloorB.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyFloorB.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyFloorB.setBorder(null);
        qtyFloorB.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyFloorB.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyFloorB.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyFloorB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyFloorBStateChanged(evt);
            }
        });
        kGradientPanel2.add(qtyFloorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        qtyFloorA.setVisible(false);
        qtyFloorA.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyFloorA.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyFloorA.setBorder(null);
        qtyFloorA.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyFloorA.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyFloorA.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyFloorA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyFloorAStateChanged(evt);
            }
        });
        kGradientPanel2.add(qtyFloorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        qtyLoge.setVisible(false);
        qtyLoge.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyLoge.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyLoge.setBorder(null);
        qtyLoge.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyLoge.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyLoge.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyLoge.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyLogeStateChanged(evt);
            }
        });
        kGradientPanel2.add(qtyLoge, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        qtyBalcony1.setVisible(false);
        qtyBalcony1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyBalcony1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyBalcony1.setBorder(null);
        qtyBalcony1.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyBalcony1.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyBalcony1.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyBalcony1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyBalcony1StateChanged(evt);
            }
        });
        kGradientPanel2.add(qtyBalcony1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        qtyBalcony2.setVisible(false);
        qtyBalcony2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyBalcony2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyBalcony2.setBorder(null);
        qtyBalcony2.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyBalcony2.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyBalcony2.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyBalcony2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyBalcony2StateChanged(evt);
            }
        });
        kGradientPanel2.add(qtyBalcony2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 240, 220));
        jLabel5.setText("Available Tickets");
        kGradientPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, -1, -1));

        lblFloorB.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblFloorB.setForeground(new java.awt.Color(255, 240, 220));
        lblFloorB.setText("Floor B:");
        kGradientPanel2.add(lblFloorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, -1, -1));

        lblFloorA.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblFloorA.setForeground(new java.awt.Color(255, 240, 220));
        lblFloorA.setText("Floor A:");
        kGradientPanel2.add(lblFloorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, -1, -1));

        lblBalcony2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblBalcony2.setForeground(new java.awt.Color(255, 240, 220));
        lblBalcony2.setText("Balc. 2:");
        kGradientPanel2.add(lblBalcony2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, -1, -1));

        lblLoge.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblLoge.setForeground(new java.awt.Color(255, 240, 220));
        lblLoge.setText("Loge:");
        kGradientPanel2.add(lblLoge, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, -1, -1));

        lblBalcony1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblBalcony1.setForeground(new java.awt.Color(255, 240, 220));
        lblBalcony1.setText("Balc. 1:");
        kGradientPanel2.add(lblBalcony1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, -1, -1));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton14.setBackground(new java.awt.Color(255, 240, 220));
        jButton14.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 240, 220));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/arrow-88-32.png"))); // NOI18N
        jButton14.setToolTipText("");
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout beabadoobeeBuyLayout = new javax.swing.GroupLayout(beabadoobeeBuy);
        beabadoobeeBuy.setLayout(beabadoobeeBuyLayout);
        beabadoobeeBuyLayout.setHorizontalGroup(
            beabadoobeeBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(beabadoobeeBuyLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(beabadoobeeBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, beabadoobeeBuyLayout.createSequentialGroup()
                        .addComponent(jButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel55)
                        .addGap(338, 338, 338))
                    .addGroup(beabadoobeeBuyLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        beabadoobeeBuyLayout.setVerticalGroup(
            beabadoobeeBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(beabadoobeeBuyLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(beabadoobeeBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14))
                .addGap(12, 12, 12)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        mainPanel.add(beabadoobeeBuy, "cardBeaBuy");

        parkSeoJunPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        parkSeoJunPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        parkSeoJunPanel.setAutoscrolls(true);
        parkSeoJunPanel.setName(""); // NOI18N
        parkSeoJunPanel.setPreferredSize(new java.awt.Dimension(1080, 3200));

        kGradientPanel4.setkEndColor(new java.awt.Color(31, 52, 96));
        kGradientPanel4.setkGradientFocus(0);
        kGradientPanel4.setkStartColor(new java.awt.Color(20, 22, 26));
        kGradientPanel4.setPreferredSize(new java.awt.Dimension(1080, 3200));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/PSJ.jpg"))); // NOI18N

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/GigHubNameWLogo1Test.png"))); // NOI18N
        jLabel60.setToolTipText("");
        jLabel60.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel60.setFocusable(false);
        jLabel60.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel60.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel68.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 240, 220));
        jLabel68.setText("FIT FOR ANY ROLE: ");

        jLabel69.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(244, 207, 145));
        jLabel69.setText("CENTURY TUNA PRESENTS");

        jLabel70.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 240, 220));
        jLabel70.setText("Ticket Prices");

        jLabel71.setFont(new java.awt.Font("Poppins", 0, 22)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 240, 220));
        jLabel71.setText("2PM PRE-EVENT EXPO | 6PM SHOW");

        jLabel72.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 240, 220));
        jLabel72.setText("GEN. ADM                                  1,750 PHP");

        jLabel73.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 240, 220));
        jLabel73.setText("VVIP                                       12,000 PHP ");

        jLabel74.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 240, 220));
        jLabel74.setText("VIP                                          10,000 PHP ");

        jLabel75.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 240, 220));
        jLabel75.setText("LOWER BOX                            6,500 PHP");

        jLabel76.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 240, 220));
        jLabel76.setText("UPPER BOX                              2,750 PHP");

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/PSJC_map600.jpg"))); // NOI18N

        jLabel89.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 240, 220));
        jLabel89.setText("-----------------------------------------------------------");

        jLabel90.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 240, 220));
        jLabel90.setText("-----------------------------------------------------------");

        jLabel91.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 240, 220));
        jLabel91.setText("-----------------------------------------------------------");

        jLabel92.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 240, 220));
        jLabel92.setText("-----------------------------------------------------------");

        jButton16.setBackground(new java.awt.Color(255, 240, 220));
        jButton16.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 240, 220));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/arrow-88-32.png"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        RoundedPanelHelper.makeRounded(jPanel22, 70);
        jPanel22.setBackground(new java.awt.Color(255, 240, 220));
        jPanel22.setForeground(new java.awt.Color(20, 22, 26));

        RoundedPanelHelper.makeRounded(jPanel23, 60);
        jPanel23.setBackground(new java.awt.Color(15, 23, 42));
        jPanel23.setForeground(new java.awt.Color(20, 22, 26));

        psjBuyTicket.setBackground(new java.awt.Color(255, 240, 220));
        psjBuyTicket.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        psjBuyTicket.setForeground(new java.awt.Color(255, 240, 220));
        psjBuyTicket.setText("BUY TICKET");
        psjBuyTicket.setBorder(null);
        psjBuyTicket.setBorderPainted(false);
        psjBuyTicket.setContentAreaFilled(false);
        psjBuyTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psjBuyTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(psjBuyTicket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(psjBuyTicket, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton18.setBackground(new java.awt.Color(24, 28, 44));
        jButton18.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 240, 220));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/white-down-arrow-png-2.png"))); // NOI18N
        jButton18.setText("For More Information");
        jButton18.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Poppins", 0, 22)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 240, 220));
        jLabel93.setText("JULY 12, 2025 - 2PM");

        jLabel94.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 240, 220));
        jLabel94.setText("-----------------------------------------------------------");

        jLabel95.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 240, 220));
        jLabel95.setText("PATRON                                  8,500 PHP ");

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-clock-24.png"))); // NOI18N

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-calendar-24.png"))); // NOI18N

        jLabel78.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 240, 220));
        jLabel78.setText("PARK SEO JUN");

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/psjrule1.jpg"))); // NOI18N

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/psjrule2.jpg"))); // NOI18N

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/psjrule3.jpg"))); // NOI18N

        jLabel142.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(244, 207, 145));
        jLabel142.setText("SEAT");

        jLabel143.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(255, 240, 220));
        jLabel143.setText("PLAN");

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(301, 301, 301)
                        .addComponent(jLabel60))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(179, 179, 179))
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel54)
                                .addGap(18, 18, 18)))
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel69)
                            .addComponent(jLabel68)
                            .addComponent(jLabel70)
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel73)
                                    .addComponent(jLabel94)
                                    .addComponent(jLabel72)
                                    .addComponent(jLabel76)
                                    .addComponent(jLabel91)
                                    .addComponent(jLabel92)
                                    .addComponent(jLabel90)
                                    .addComponent(jLabel74)
                                    .addComponent(jLabel75)
                                    .addComponent(jLabel89)
                                    .addComponent(jButton18)
                                    .addComponent(jLabel95)))
                            .addComponent(jLabel78)
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel93)))))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel79)
                            .addComponent(jLabel77)
                            .addComponent(jLabel80)
                            .addComponent(jLabel81)
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel142)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel143)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel68)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel94)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel95)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel89)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel76)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel92)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton18)
                        .addGap(66, 66, 66))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel143, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel81)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        parkSeoJunPanel.setViewportView(kGradientPanel4);

        mainPanel.add(parkSeoJunPanel, "cardPSJ");

        parkSeoJunBuy.setkEndColor(new java.awt.Color(31, 52, 96));
        parkSeoJunBuy.setkGradientFocus(0);
        parkSeoJunBuy.setkStartColor(new java.awt.Color(20, 22, 26));
        parkSeoJunBuy.setMaximumSize(new java.awt.Dimension(1030, 720));
        parkSeoJunBuy.setMinimumSize(new java.awt.Dimension(1030, 720));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/GigHubNameWLogo1Test.png"))); // NOI18N
        jLabel82.setToolTipText("");
        jLabel82.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel82.setFocusable(false);
        jLabel82.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel82.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jPanel24.setBackground(new java.awt.Color(255, 240, 220));

        kGradientPanel5.setkEndColor(new java.awt.Color(31, 52, 96));
        kGradientPanel5.setkGradientFocus(0);
        kGradientPanel5.setkStartColor(new java.awt.Color(20, 22, 26));
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RoundedPanelHelper.makeRounded(jPanel25, 70);
        jPanel25.setBackground(new java.awt.Color(255, 240, 220));
        jPanel25.setForeground(new java.awt.Color(20, 22, 26));

        RoundedPanelHelper.makeRounded(jPanel26, 60);
        jPanel26.setBackground(new java.awt.Color(32, 52, 92));
        jPanel26.setForeground(new java.awt.Color(32, 52, 92));

        purchaseButton1.setEnabled(false);
        purchaseButton1.setBackground(new java.awt.Color(255, 240, 220));
        purchaseButton1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        purchaseButton1.setForeground(new java.awt.Color(255, 240, 220));
        purchaseButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-purchase-48.png"))); // NOI18N
        purchaseButton1.setText("PURCHASE TICKET");
        purchaseButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        purchaseButton1.setBorderPainted(false);
        purchaseButton1.setContentAreaFilled(false);
        purchaseButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchaseButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchaseButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        kGradientPanel5.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 240, 220));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/Screenshot 2025-06-24 135148.png"))); // NOI18N
        jLabel8.setText("  Buy Ticket - Century Tuna Presents: FIT FOR ANY ROLE PSJ");
        kGradientPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 13, -1, -1));

        jLabel84.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 240, 220));
        jLabel84.setText("Araneta Coliseum, Manila | June 12, 2025 | 2:00 PM PRE EVENT, 6:00PM SHOW ");
        kGradientPanel5.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 56, -1, -1));

        jLabel85.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 240, 220));
        jLabel85.setText("Select Time:");
        kGradientPanel5.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 125, -1, -1));

        dates1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        dates1.setMaximumRowCount(3);
        dates1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "June 12 2025 - 2:00-6:00 PM" }));
        dates1.setToolTipText("");
        dates1.setAutoscrolls(true);
        dates1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kGradientPanel5.add(dates1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 154, 240, -1));

        jLabel86.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 240, 220));
        jLabel86.setText("2. Select Ticket  Type & Quantity");
        kGradientPanel5.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 213, -1, -1));

        jTextField5.selectAll();
        jTextField10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTextField10.setText("Full Name (Last, First M.I.)*");
        jTextField10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField10FocusGained(evt);
            }
        });
        kGradientPanel5.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 439, 32));

        totalCostLabel1.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        totalCostLabel1.setForeground(new java.awt.Color(255, 240, 220));
        totalCostLabel1.setText("Total:   PHP 0.00");
        kGradientPanel5.add(totalCostLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        jTextField8.selectAll();
        jTextField11.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTextField11.setText("Contact Number (+639)*");
        jTextField11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField11FocusGained(evt);
            }
        });
        kGradientPanel5.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 439, 32));

        jTextField12.setText(email);
        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTextField12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kGradientPanel5.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 439, 32));

        jLabel87.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 240, 220));
        jLabel87.setText("3. Personal Information");
        kGradientPanel5.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-email-32.png"))); // NOI18N
        kGradientPanel5.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-phone-32.png"))); // NOI18N
        kGradientPanel5.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-person-32.png"))); // NOI18N
        kGradientPanel5.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox2.setMaximumRowCount(5);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Payment Method:", "PayMaya", "GCash", "Debit/Credit Card", "PayPal" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        kGradientPanel5.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 291, -1));

        jLabel100.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 240, 220));
        jLabel100.setText("4. Payment Method");
        kGradientPanel5.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        jLabel101.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 240, 220));
        jLabel101.setText("Service Fee: PHP 150.00");
        kGradientPanel5.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        jLabel102.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 240, 220));
        jLabel102.setText("5. Order Summary");
        kGradientPanel5.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        lowerBox.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        lowerBox.setForeground(new java.awt.Color(255, 240, 220));
        lowerBox.setText(" Lower Box - PHP 6,500");
        lowerBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        lowerBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lowerBoxItemStateChanged(evt);
            }
        });
        kGradientPanel5.add(lowerBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 385, -1, -1));

        vvip.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        vvip.setForeground(new java.awt.Color(255, 240, 220));
        vvip.setText("  VVIP - PHP 12,000");
        vvip.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        vvip.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                vvipItemStateChanged(evt);
            }
        });
        kGradientPanel5.add(vvip, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 259, -1, -1));

        vip.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        vip.setForeground(new java.awt.Color(255, 240, 220));
        vip.setText("  VIP - PHP 10,000");
        vip.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        vip.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                vipItemStateChanged(evt);
            }
        });
        kGradientPanel5.add(vip, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 301, -1, -1));

        patron.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        patron.setForeground(new java.awt.Color(255, 240, 220));
        patron.setText(" Patron - PHP 8,500");
        patron.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        patron.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                patronItemStateChanged(evt);
            }
        });
        kGradientPanel5.add(patron, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 343, -1, -1));

        upperBox.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        upperBox.setForeground(new java.awt.Color(255, 240, 220));
        upperBox.setText(" Upper Box - PHP 2,750");
        upperBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        upperBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                upperBoxItemStateChanged(evt);
            }
        });
        kGradientPanel5.add(upperBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 427, -1, -1));

        generalAd.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        generalAd.setForeground(new java.awt.Color(255, 240, 220));
        generalAd.setText(" Gen. Adm. - PHP 1,750");
        generalAd.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        generalAd.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                generalAdItemStateChanged(evt);
            }
        });
        kGradientPanel5.add(generalAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 469, -1, -1));

        qtyLowerBox.setVisible(false);
        qtyLowerBox.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyLowerBox.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyLowerBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        qtyLowerBox.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyLowerBox.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyLowerBox.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyLowerBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyLowerBoxStateChanged(evt);
            }
        });
        kGradientPanel5.add(qtyLowerBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 388, -1, -1));

        qtyGeneralAd.setVisible(false);
        qtyGeneralAd.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyGeneralAd.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyGeneralAd.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        qtyGeneralAd.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyGeneralAd.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyGeneralAd.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyGeneralAd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyGeneralAdStateChanged(evt);
            }
        });
        kGradientPanel5.add(qtyGeneralAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 472, 52, -1));

        qtyUpperBox.setVisible(false);
        qtyUpperBox.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyUpperBox.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyUpperBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        qtyUpperBox.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyUpperBox.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyUpperBox.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyUpperBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyUpperBoxStateChanged(evt);
            }
        });
        kGradientPanel5.add(qtyUpperBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 430, -1, -1));

        qtyPatron.setVisible(false);
        qtyPatron.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyPatron.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyPatron.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        qtyPatron.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyPatron.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyPatron.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyPatron.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyPatronStateChanged(evt);
            }
        });
        kGradientPanel5.add(qtyPatron, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 346, -1, -1));

        qtyVvip.setVisible(false);
        qtyVvip.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyVvip.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyVvip.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        qtyVvip.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyVvip.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyVvip.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyVvip.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyVvipStateChanged(evt);
            }
        });
        kGradientPanel5.add(qtyVvip, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 259, -1, -1));

        qtyVip.setVisible(false);
        qtyVip.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyVip.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyVip.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        qtyVip.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyVip.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyVip.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyVip.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyVipStateChanged(evt);
            }
        });
        kGradientPanel5.add(qtyVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 304, -1, -1));

        jLabel13.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 240, 220));
        jLabel13.setText("Available Tickets");
        kGradientPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, -1, -1));

        lblVVIP.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblVVIP.setForeground(new java.awt.Color(255, 240, 220));
        lblVVIP.setText("VVIP:");
        kGradientPanel5.add(lblVVIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, -1, -1));

        lblVIP.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblVIP.setForeground(new java.awt.Color(255, 240, 220));
        lblVIP.setText("VIP:");
        kGradientPanel5.add(lblVIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, -1, -1));

        lblPatron.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblPatron.setForeground(new java.awt.Color(255, 240, 220));
        lblPatron.setText("Patron:");
        kGradientPanel5.add(lblPatron, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, -1, -1));

        lbllowerBox.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbllowerBox.setForeground(new java.awt.Color(255, 240, 220));
        lbllowerBox.setText("Lower Box:");
        kGradientPanel5.add(lbllowerBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, -1, -1));

        lblupperBox.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblupperBox.setForeground(new java.awt.Color(255, 240, 220));
        lblupperBox.setText("Upper Box:");
        kGradientPanel5.add(lblupperBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, -1, -1));

        lblGenAd.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblGenAd.setForeground(new java.awt.Color(255, 240, 220));
        lblGenAd.setText("Gen. Ad.:");
        kGradientPanel5.add(lblGenAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, -1, -1));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton20.setBackground(new java.awt.Color(255, 240, 220));
        jButton20.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 240, 220));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/arrow-88-32.png"))); // NOI18N
        jButton20.setToolTipText("");
        jButton20.setBorder(null);
        jButton20.setBorderPainted(false);
        jButton20.setContentAreaFilled(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout parkSeoJunBuyLayout = new javax.swing.GroupLayout(parkSeoJunBuy);
        parkSeoJunBuy.setLayout(parkSeoJunBuyLayout);
        parkSeoJunBuyLayout.setHorizontalGroup(
            parkSeoJunBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parkSeoJunBuyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                .addComponent(jLabel82)
                .addGap(377, 377, 377))
            .addGroup(parkSeoJunBuyLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        parkSeoJunBuyLayout.setVerticalGroup(
            parkSeoJunBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parkSeoJunBuyLayout.createSequentialGroup()
                .addGroup(parkSeoJunBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20))
                .addGap(12, 12, 12)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        mainPanel.add(parkSeoJunBuy, "psjBUYTICKET");

        regineAndVicePanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        regineAndVicePanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        regineAndVicePanel.setAutoscrolls(true);
        regineAndVicePanel.setFocusCycleRoot(true);
        regineAndVicePanel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        regineAndVicePanel.setHorizontalScrollBar(null);
        regineAndVicePanel.setOpaque(false);
        regineAndVicePanel.setPreferredSize(new java.awt.Dimension(1118, 1900));

        kGradientPanel6.setkEndColor(new java.awt.Color(31, 52, 96));
        kGradientPanel6.setkGradientFocus(0);
        kGradientPanel6.setkStartColor(new java.awt.Color(20, 22, 26));
        kGradientPanel6.setPreferredSize(new java.awt.Dimension(1106, 1900));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/vice-ganda-regine-velasquez-concert-ftr-img-1600x838.jpg"))); // NOI18N

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/GigHubNameWLogo1Test.png"))); // NOI18N
        jLabel105.setToolTipText("");
        jLabel105.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel105.setFocusable(false);
        jLabel105.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel105.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel106.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 240, 220));
        jLabel106.setText("REGINE VELASQUEZ");

        jLabel107.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(244, 207, 145));
        jLabel107.setText("SUPERDIVAS : THE CONCERT");

        jLabel108.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 240, 220));
        jLabel108.setText("Ticket Prices");

        jLabel109.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(255, 240, 220));
        jLabel109.setText("August 08-09, 2025 - 8PM");

        jLabel110.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 240, 220));
        jLabel110.setText("Lower Box                               4,000 PHP");

        jLabel111.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 240, 220));
        jLabel111.setText("Platinum                               15,000 PHP");

        jLabel112.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 240, 220));
        jLabel112.setText("SVIP                                         12,000 PHP ");

        jLabel113.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 240, 220));
        jLabel113.setText("VIP                                            8,000 PHP");

        jLabel114.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 240, 220));
        jLabel114.setText("Patron                                     6,000 PHP");

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/SD_700map.jpg"))); // NOI18N

        jLabel116.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("Asia’s Songbird Regine Velasquez and Asia’s UNKABOGABLE Phenomenal Box");

        jLabel127.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(255, 240, 220));
        jLabel127.setText("-----------------------------------------------------------");

        jLabel128.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(255, 240, 220));
        jLabel128.setText("-----------------------------------------------------------");

        jLabel129.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(255, 240, 220));
        jLabel129.setText("-----------------------------------------------------------");

        jLabel130.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(255, 240, 220));
        jLabel130.setText("-----------------------------------------------------------");

        jButton11.setBackground(new java.awt.Color(255, 240, 220));
        jButton11.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 240, 220));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/arrow-88-32.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        RoundedPanelHelper.makeRounded(jPanel27, 70);
        jPanel27.setBackground(new java.awt.Color(255, 240, 220));
        jPanel27.setForeground(new java.awt.Color(20, 22, 26));

        RoundedPanelHelper.makeRounded(jPanel28, 60);
        jPanel28.setBackground(new java.awt.Color(15, 23, 42));
        jPanel28.setForeground(new java.awt.Color(32, 36, 52));

        regineAndViceBuyTicket.setBackground(new java.awt.Color(255, 240, 220));
        regineAndViceBuyTicket.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        regineAndViceBuyTicket.setForeground(new java.awt.Color(255, 240, 220));
        regineAndViceBuyTicket.setText("BUY TICKET");
        regineAndViceBuyTicket.setBorder(null);
        regineAndViceBuyTicket.setBorderPainted(false);
        regineAndViceBuyTicket.setContentAreaFilled(false);
        regineAndViceBuyTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regineAndViceBuyTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regineAndViceBuyTicket, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regineAndViceBuyTicket, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton17.setBackground(new java.awt.Color(32, 36, 52));
        jButton17.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 240, 220));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/white-down-arrow-png-2.png"))); // NOI18N
        jButton17.setText("For More Information");
        jButton17.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-calendar-24.png"))); // NOI18N

        jLabel133.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(255, 240, 220));
        jLabel133.setText("-ALCASID & VICE GANDA");

        jLabel134.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(255, 240, 220));
        jLabel134.setText("-----------------------------------------------------------");

        jLabel135.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(255, 240, 220));
        jLabel135.setText("Upper Box                                1,500 PHP");

        jLabel136.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(255, 240, 220));
        jLabel136.setText("-----------------------------------------------------------");

        jLabel137.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(255, 240, 220));
        jLabel137.setText("Gen. Adm                                  500 PHP");

        jLabel138.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(255, 240, 220));
        jLabel138.setText("PLAN");

        jLabel139.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(244, 207, 145));
        jLabel139.setText("SEAT");

        jLabel117.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("Two icons. One dance floor.");

        jLabel118.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setText("radiating pure superstar power!");

        jLabel119.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(255, 255, 255));
        jLabel119.setText("Office Superstar Vice Ganda are stepping out of their usual lanes to take a");

        jLabel120.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(255, 255, 255));
        jLabel120.setText("dance-filled detour in a two-night show-stopping concert: “Super");

        jLabel121.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setText("Divas: The Concert”.");

        jLabel122.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(255, 255, 255));
        jLabel122.setText("Expect a refreshing spectacle of disco classics and fierce performances bursting");

        jLabel123.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setText("with energy from two of the Philippines’ best performers. The divas that they are,");

        jLabel124.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(255, 255, 255));
        jLabel124.setText("Vice and Regine will surely bring the house down, shimmering in sequins and");

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel109))
                                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel111)
                                            .addComponent(jLabel110)
                                            .addComponent(jLabel114)
                                            .addComponent(jLabel129)
                                            .addComponent(jLabel130)
                                            .addComponent(jLabel128)
                                            .addComponent(jLabel112)
                                            .addComponent(jLabel113)
                                            .addComponent(jLabel127)))
                                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel134)
                                            .addComponent(jLabel136)
                                            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel135))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel137)
                                        .addGap(87, 87, 87))
                                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel107)
                                            .addComponent(jLabel106)
                                            .addComponent(jLabel108)
                                            .addComponent(jLabel133)))
                                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jButton17))))
                            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel115)
                                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel139)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel138))
                                    .addComponent(jLabel117)
                                    .addComponent(jLabel116)
                                    .addComponent(jLabel119)
                                    .addComponent(jLabel120)
                                    .addComponent(jLabel121)
                                    .addComponent(jLabel122)
                                    .addComponent(jLabel123)
                                    .addComponent(jLabel118)
                                    .addComponent(jLabel124)))))
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(301, 301, 301)
                        .addComponent(jLabel105)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel107)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel106)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel133)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel128)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel112)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel127)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel129)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel114)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel130)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel134)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel135))
                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel136)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel137)
                        .addGap(18, 18, 18)
                        .addComponent(jButton17))
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel139)
                            .addComponent(jLabel138))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel115)
                .addGap(18, 18, 18)
                .addComponent(jLabel117)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel116)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel119)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel120)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel121)
                .addGap(18, 18, 18)
                .addComponent(jLabel122)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel123)
                .addGap(4, 4, 4)
                .addComponent(jLabel124)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel118)
                .addGap(241, 241, 241))
        );

        regineAndVicePanel.setViewportView(kGradientPanel6);

        mainPanel.add(regineAndVicePanel, "cardRV");

        regineAndViceBuy.setkEndColor(new java.awt.Color(31, 52, 96));
        regineAndViceBuy.setkGradientFocus(0);
        regineAndViceBuy.setkStartColor(new java.awt.Color(20, 22, 26));
        regineAndViceBuy.setMaximumSize(new java.awt.Dimension(1030, 720));
        regineAndViceBuy.setMinimumSize(new java.awt.Dimension(1030, 720));

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/GigHubNameWLogo1Test.png"))); // NOI18N
        jLabel125.setToolTipText("");
        jLabel125.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel125.setFocusable(false);
        jLabel125.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel125.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jPanel29.setBackground(new java.awt.Color(255, 240, 220));

        kGradientPanel7.setkEndColor(new java.awt.Color(31, 52, 96));
        kGradientPanel7.setkGradientFocus(0);
        kGradientPanel7.setkStartColor(new java.awt.Color(20, 22, 26));
        kGradientPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RoundedPanelHelper.makeRounded(jPanel30, 70);
        jPanel30.setBackground(new java.awt.Color(255, 240, 220));
        jPanel30.setForeground(new java.awt.Color(20, 22, 26));

        RoundedPanelHelper.makeRounded(jPanel31, 60);
        jPanel31.setBackground(new java.awt.Color(32, 52, 92));
        jPanel31.setForeground(new java.awt.Color(32, 52, 92));

        purchaseButton2.setEnabled(false);
        purchaseButton2.setBackground(new java.awt.Color(255, 240, 220));
        purchaseButton2.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        purchaseButton2.setForeground(new java.awt.Color(255, 240, 220));
        purchaseButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-purchase-48.png"))); // NOI18N
        purchaseButton2.setText("PURCHASE TICKET");
        purchaseButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        purchaseButton2.setBorderPainted(false);
        purchaseButton2.setContentAreaFilled(false);
        purchaseButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchaseButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchaseButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        kGradientPanel7.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, -1, -1));

        jLabel126.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(255, 240, 220));
        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/Screenshot 2025-06-24 135148.png"))); // NOI18N
        jLabel126.setText("  Buy Ticket - SUPERDIVAS: THE CONCERT");
        kGradientPanel7.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 13, -1, -1));

        jLabel145.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(255, 240, 220));
        jLabel145.setText("Smart Araneta Coliseum, Manila | August 08-09, 2025 | 8:00 PM");
        kGradientPanel7.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jLabel146.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(255, 240, 220));
        jLabel146.setText("1. Select Time:");
        kGradientPanel7.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 125, -1, -1));

        dates2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        dates2.setMaximumRowCount(3);
        dates2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Date:", "August 08 2025 - 8:00 PM", "August 09 2025 - 8:00 PM" }));
        dates2.setToolTipText("");
        dates2.setAutoscrolls(true);
        dates2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kGradientPanel7.add(dates2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 154, 240, -1));

        jLabel147.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(255, 240, 220));
        jLabel147.setText("2. Select Ticket  Type & Quantity");
        kGradientPanel7.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 213, 240, -1));

        jTextField5.selectAll();
        fullNameTextField.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        fullNameTextField.setText("Full Name (Last, First M.I.)*");
        fullNameTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fullNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fullNameTextFieldFocusGained(evt);
            }
        });
        kGradientPanel7.add(fullNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 439, 32));

        totalCostLabel2.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        totalCostLabel2.setForeground(new java.awt.Color(255, 240, 220));
        totalCostLabel2.setText("Total:   PHP 0.00");
        kGradientPanel7.add(totalCostLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));

        jTextField8.selectAll();
        jTextField14.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTextField14.setText("Contact Number (+639)*");
        jTextField14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField14FocusGained(evt);
            }
        });
        kGradientPanel7.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 439, 32));

        jTextField15.setText(email);
        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTextField15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kGradientPanel7.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 439, 32));

        jLabel148.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(255, 240, 220));
        jLabel148.setText("3. Personal Information");
        kGradientPanel7.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jLabel149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-email-32.png"))); // NOI18N
        kGradientPanel7.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-phone-32.png"))); // NOI18N
        kGradientPanel7.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-person-32.png"))); // NOI18N
        kGradientPanel7.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jComboBox3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox3.setMaximumRowCount(5);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Payment Method:", "PayMaya", "GCash", "Debit/Credit Card", "PayPal" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        kGradientPanel7.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 291, -1));

        jLabel152.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(255, 240, 220));
        jLabel152.setText("4. Payment Method");
        kGradientPanel7.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jLabel153.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(255, 240, 220));
        jLabel153.setText("Service Fee: PHP 150.00");
        kGradientPanel7.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, -1));

        jLabel154.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(255, 240, 220));
        jLabel154.setText("5. Order Summary");
        kGradientPanel7.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));

        patron1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        patron1.setForeground(new java.awt.Color(255, 240, 220));
        patron1.setText("  Patron - PHP 6,000");
        patron1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        patron1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                patron1ItemStateChanged(evt);
            }
        });
        kGradientPanel7.add(patron1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        vip1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        vip1.setForeground(new java.awt.Color(255, 240, 220));
        vip1.setText(" VIP - PHP 8,000");
        vip1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        vip1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                vip1ItemStateChanged(evt);
            }
        });
        kGradientPanel7.add(vip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 338, -1, -1));

        platinum.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        platinum.setForeground(new java.awt.Color(255, 240, 220));
        platinum.setText("  Platinum - PHP 15,000");
        platinum.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        platinum.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                platinumItemStateChanged(evt);
            }
        });
        kGradientPanel7.add(platinum, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 254, -1, -1));

        svip.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        svip.setForeground(new java.awt.Color(255, 240, 220));
        svip.setText("  SVIP - PHP 12,000");
        svip.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        svip.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                svipItemStateChanged(evt);
            }
        });
        kGradientPanel7.add(svip, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 296, -1, -1));

        upperBox1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        upperBox1.setForeground(new java.awt.Color(255, 240, 220));
        upperBox1.setText("  Upper Box - PHP 1,500");
        upperBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        upperBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                upperBox1ItemStateChanged(evt);
            }
        });
        kGradientPanel7.add(upperBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 464, -1, -1));

        generalAd1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        generalAd1.setForeground(new java.awt.Color(255, 240, 220));
        generalAd1.setText("  Gen. Adm. - PHP 500");
        generalAd1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        generalAd1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                generalAd1ItemStateChanged(evt);
            }
        });
        kGradientPanel7.add(generalAd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 506, -1, -1));

        lowerBox1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        lowerBox1.setForeground(new java.awt.Color(255, 240, 220));
        lowerBox1.setText("  Lower Box - PHP 4,000");
        lowerBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        lowerBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lowerBox1ItemStateChanged(evt);
            }
        });
        kGradientPanel7.add(lowerBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 422, -1, -1));

        qtyPlatinum.setVisible(false);
        qtyPlatinum.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyPlatinum.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyPlatinum.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        qtyPlatinum.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyPlatinum.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyPlatinum.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyPlatinum.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyPlatinumStateChanged(evt);
            }
        });
        kGradientPanel7.add(qtyPlatinum, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 254, -1, -1));
        qtyPlatinum.getAccessibleContext().setAccessibleDescription("");

        qtyVip1.setVisible(false);
        qtyVip1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyVip1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyVip1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        qtyVip1.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyVip1.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyVip1.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyVip1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyVip1StateChanged(evt);
            }
        });
        kGradientPanel7.add(qtyVip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 338, -1, -1));

        qtySvip.setVisible(false);
        qtySvip.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtySvip.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtySvip.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        qtySvip.setMaximumSize(new java.awt.Dimension(50, 20));
        qtySvip.setMinimumSize(new java.awt.Dimension(50, 20));
        qtySvip.setPreferredSize(new java.awt.Dimension(50, 20));
        qtySvip.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtySvipStateChanged(evt);
            }
        });
        kGradientPanel7.add(qtySvip, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 299, -1, -1));

        qtyPatron1.setVisible(false);
        qtyPatron1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyPatron1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyPatron1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        qtyPatron1.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyPatron1.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyPatron1.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyPatron1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyPatron1StateChanged(evt);
            }
        });
        kGradientPanel7.add(qtyPatron1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 383, -1, -1));

        qtyLowerBox1.setVisible(false);
        qtyLowerBox1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyLowerBox1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyLowerBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        qtyLowerBox1.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyLowerBox1.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyLowerBox1.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyLowerBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyLowerBox1StateChanged(evt);
            }
        });
        kGradientPanel7.add(qtyLowerBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 425, -1, -1));

        qtyUpperBox1.setVisible(false);
        qtyUpperBox1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyUpperBox1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyUpperBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        qtyUpperBox1.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyUpperBox1.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyUpperBox1.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyUpperBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyUpperBox1StateChanged(evt);
            }
        });
        kGradientPanel7.add(qtyUpperBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, -1));

        qtyGeneralAd1.setVisible(false);
        qtyGeneralAd1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyGeneralAd1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyGeneralAd1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        qtyGeneralAd1.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyGeneralAd1.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyGeneralAd1.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyGeneralAd1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyGeneralAd1StateChanged(evt);
            }
        });
        kGradientPanel7.add(qtyGeneralAd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 509, -1, -1));

        jLabel14.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 240, 220));
        jLabel14.setText("Available Tickets");
        kGradientPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, -1, -1));

        lblSVIP.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblSVIP.setForeground(new java.awt.Color(255, 240, 220));
        lblSVIP.setText("SVIP:");
        kGradientPanel7.add(lblSVIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, -1, -1));

        lblVIP1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblVIP1.setForeground(new java.awt.Color(255, 240, 220));
        lblVIP1.setText("VIP:");
        kGradientPanel7.add(lblVIP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, -1, -1));

        lblPatron1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblPatron1.setForeground(new java.awt.Color(255, 240, 220));
        lblPatron1.setText("Patron:");
        kGradientPanel7.add(lblPatron1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, -1, -1));

        lbllowerBox1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbllowerBox1.setForeground(new java.awt.Color(255, 240, 220));
        lbllowerBox1.setText("Lower Box:");
        kGradientPanel7.add(lbllowerBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, -1, -1));

        lblupperBox1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblupperBox1.setForeground(new java.awt.Color(255, 240, 220));
        lblupperBox1.setText("Upper Box:");
        kGradientPanel7.add(lblupperBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, -1, -1));

        lblGenAd1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblGenAd1.setForeground(new java.awt.Color(255, 240, 220));
        lblGenAd1.setText("Gen. Ad.:");
        kGradientPanel7.add(lblGenAd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, -1, -1));

        lblPlatinum.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblPlatinum.setForeground(new java.awt.Color(255, 240, 220));
        lblPlatinum.setText("Platinum:");
        kGradientPanel7.add(lblPlatinum, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, -1, -1));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton21.setBackground(new java.awt.Color(255, 240, 220));
        jButton21.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 240, 220));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/arrow-88-32.png"))); // NOI18N
        jButton21.setToolTipText("");
        jButton21.setBorder(null);
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout regineAndViceBuyLayout = new javax.swing.GroupLayout(regineAndViceBuy);
        regineAndViceBuy.setLayout(regineAndViceBuyLayout);
        regineAndViceBuyLayout.setHorizontalGroup(
            regineAndViceBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regineAndViceBuyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                .addComponent(jLabel125)
                .addGap(377, 377, 377))
            .addGroup(regineAndViceBuyLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        regineAndViceBuyLayout.setVerticalGroup(
            regineAndViceBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regineAndViceBuyLayout.createSequentialGroup()
                .addGroup(regineAndViceBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21))
                .addGap(12, 12, 12)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        mainPanel.add(regineAndViceBuy, "rvBUYTICKET");

        kennygPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        kennygPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        kennygPanel.setAutoscrolls(true);
        kennygPanel.setFocusCycleRoot(true);
        kennygPanel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        kennygPanel.setHorizontalScrollBar(null);
        kennygPanel.setMaximumSize(null);
        kennygPanel.setMinimumSize(null);
        kennygPanel.setPreferredSize(new java.awt.Dimension(1118, 1770));

        kGradientPanel10.setkEndColor(new java.awt.Color(31, 52, 96));
        kGradientPanel10.setkGradientFocus(0);
        kGradientPanel10.setkStartColor(new java.awt.Color(20, 22, 26));
        kGradientPanel10.setkTransparentControls(false);
        kGradientPanel10.setMaximumSize(null);
        kGradientPanel10.setName(""); // NOI18N
        kGradientPanel10.setPreferredSize(new java.awt.Dimension(1118, 1770));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/kennygportrait.jpg"))); // NOI18N

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/GigHubNameWLogo1Test.png"))); // NOI18N
        jLabel83.setToolTipText("");
        jLabel83.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel83.setFocusable(false);
        jLabel83.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel83.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel144.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(255, 240, 220));
        jLabel144.setText("KENNY G");

        jLabel162.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(244, 207, 145));
        jLabel162.setText("KENNY G LIVE TOUR 2025");

        jLabel166.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(255, 240, 220));
        jLabel166.setText("Ticket Prices");

        jLabel169.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(255, 240, 220));
        jLabel169.setText("July 15, 2025 - 8PM");

        jLabel171.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel171.setForeground(new java.awt.Color(255, 240, 220));
        jLabel171.setText("Gold/Gold Loge                12,800 PHP ");

        jLabel172.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(255, 240, 220));
        jLabel172.setText("Silver Loge/Balcony          9,000 PHP ");

        jLabel173.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel173.setForeground(new java.awt.Color(255, 240, 220));
        jLabel173.setText("Bronze Balcony                   5,870 PHP");

        jLabel182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/kennygseatplan.jpg"))); // NOI18N

        jLabel195.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel195.setForeground(new java.awt.Color(255, 240, 220));
        jLabel195.setText("-----------------------------------------------------------");

        jLabel196.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel196.setForeground(new java.awt.Color(255, 240, 220));
        jLabel196.setText("-----------------------------------------------------------");

        jButton25.setBackground(new java.awt.Color(255, 240, 220));
        jButton25.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 240, 220));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/arrow-88-32.png"))); // NOI18N
        jButton25.setBorder(null);
        jButton25.setBorderPainted(false);
        jButton25.setContentAreaFilled(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        RoundedPanelHelper.makeRounded(jPanel35, 70);
        jPanel35.setBackground(new java.awt.Color(255, 240, 220));
        jPanel35.setForeground(new java.awt.Color(20, 22, 26));

        RoundedPanelHelper.makeRounded(jPanel36, 60);
        jPanel36.setBackground(new java.awt.Color(15, 23, 42));
        jPanel36.setForeground(new java.awt.Color(20, 22, 26));

        beabadoobeeBuyTicket1.setBackground(new java.awt.Color(255, 240, 220));
        beabadoobeeBuyTicket1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        beabadoobeeBuyTicket1.setForeground(new java.awt.Color(255, 240, 220));
        beabadoobeeBuyTicket1.setText("BUY TICKET");
        beabadoobeeBuyTicket1.setBorder(null);
        beabadoobeeBuyTicket1.setBorderPainted(false);
        beabadoobeeBuyTicket1.setContentAreaFilled(false);
        beabadoobeeBuyTicket1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beabadoobeeBuyTicket1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(beabadoobeeBuyTicket1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(beabadoobeeBuyTicket1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton26.setBackground(new java.awt.Color(24, 28, 44));
        jButton26.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 240, 220));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/white-down-arrow-png-2.png"))); // NOI18N
        jButton26.setText("For More Information");
        jButton26.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jLabel199.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-calendar-24.png"))); // NOI18N

        jLabel200.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel200.setForeground(new java.awt.Color(244, 207, 145));
        jLabel200.setText("SEAT");

        jLabel201.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel201.setForeground(new java.awt.Color(255, 240, 220));
        jLabel201.setText("PLAN");

        javax.swing.GroupLayout kGradientPanel10Layout = new javax.swing.GroupLayout(kGradientPanel10);
        kGradientPanel10.setLayout(kGradientPanel10Layout);
        kGradientPanel10Layout.setHorizontalGroup(
            kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel10Layout.createSequentialGroup()
                .addGroup(kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(346, 346, 346)
                        .addComponent(jLabel83))
                    .addGroup(kGradientPanel10Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel10Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel200)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel201))
                            .addGroup(kGradientPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addGroup(kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel10Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jButton26))
                                    .addComponent(jLabel162)
                                    .addComponent(jLabel166)
                                    .addComponent(jLabel144)
                                    .addGroup(kGradientPanel10Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel169))
                                    .addGroup(kGradientPanel10Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel171)
                                            .addComponent(jLabel196)
                                            .addComponent(jLabel172)
                                            .addComponent(jLabel173)
                                            .addComponent(jLabel195)))))
                            .addComponent(jLabel182, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        kGradientPanel10Layout.setVerticalGroup(
            kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel162)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel144)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel169, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel166)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel171)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel196)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel172)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel195)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel173)
                        .addGap(130, 130, 130)
                        .addComponent(jButton26)))
                .addGap(47, 47, 47)
                .addGroup(kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel201, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel200, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel182)
                .addGap(87, 87, 87))
        );

        kennygPanel.setViewportView(kGradientPanel10);

        mainPanel.add(kennygPanel, "cardKennyG");
        kennygPanel.getAccessibleContext().setAccessibleDescription("");

        kennygBuy.setkEndColor(new java.awt.Color(31, 52, 96));
        kennygBuy.setkGradientFocus(0);
        kennygBuy.setkStartColor(new java.awt.Color(20, 22, 26));
        kennygBuy.setMaximumSize(new java.awt.Dimension(1030, 720));
        kennygBuy.setMinimumSize(new java.awt.Dimension(1030, 720));

        jLabel170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/GigHubNameWLogo1Test.png"))); // NOI18N
        jLabel170.setToolTipText("");
        jLabel170.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel170.setFocusable(false);
        jLabel170.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel170.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jPanel37.setBackground(new java.awt.Color(255, 240, 220));

        kGradientPanel11.setkEndColor(new java.awt.Color(31, 52, 96));
        kGradientPanel11.setkGradientFocus(0);
        kGradientPanel11.setkStartColor(new java.awt.Color(20, 22, 26));
        kGradientPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RoundedPanelHelper.makeRounded(jPanel38, 70);
        jPanel38.setBackground(new java.awt.Color(255, 240, 220));
        jPanel38.setForeground(new java.awt.Color(20, 22, 26));

        RoundedPanelHelper.makeRounded(jPanel39, 60);
        jPanel39.setBackground(new java.awt.Color(32, 52, 92));
        jPanel39.setForeground(new java.awt.Color(32, 52, 92));

        purchaseButton.setEnabled(false);
        purchaseButton3.setBackground(new java.awt.Color(255, 240, 220));
        purchaseButton3.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        purchaseButton3.setForeground(new java.awt.Color(255, 240, 220));
        purchaseButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-purchase-48.png"))); // NOI18N
        purchaseButton3.setText("PURCHASE TICKET");
        purchaseButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        purchaseButton3.setBorderPainted(false);
        purchaseButton3.setContentAreaFilled(false);
        purchaseButton3.setEnabled(false);
        purchaseButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchaseButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchaseButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        kGradientPanel11.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, -1, -1));

        jLabel176.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(255, 240, 220));
        jLabel176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/Screenshot 2025-06-24 135148.png"))); // NOI18N
        jLabel176.setText("  Buy Ticket - Kenny G Live Tour 2025");
        kGradientPanel11.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 13, -1, -1));

        jLabel177.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel177.setForeground(new java.awt.Color(255, 240, 220));
        jLabel177.setText("New Frontier Theater, Manila | July 15, 2025 | 8:00 PM");
        kGradientPanel11.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 56, -1, -1));

        jLabel179.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel179.setForeground(new java.awt.Color(255, 240, 220));
        jLabel179.setText("1. Select Date");
        kGradientPanel11.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 125, -1, -1));

        dates3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        dates3.setMaximumRowCount(3);
        dates3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "July 15 2025 - 8:00 PM" }));
        dates3.setToolTipText("");
        dates3.setAutoscrolls(true);
        dates3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kGradientPanel11.add(dates3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 154, 240, -1));

        jLabel183.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel183.setForeground(new java.awt.Color(255, 240, 220));
        jLabel183.setText("2. Select Ticket  Type & Quantity");
        kGradientPanel11.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 213, -1, -1));

        jTextField5.selectAll();
        jTextField13.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTextField13.setText("Full Name (Last, First M.I.)*");
        jTextField13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField13FocusGained(evt);
            }
        });
        kGradientPanel11.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 439, 32));

        totalCostLabel3.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        totalCostLabel3.setForeground(new java.awt.Color(255, 240, 220));
        totalCostLabel3.setText("Total:   PHP 0.00");
        kGradientPanel11.add(totalCostLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        jTextField8.selectAll();
        jTextField16.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTextField16.setText("Contact Number (+639)*");
        jTextField16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField16FocusGained(evt);
            }
        });
        kGradientPanel11.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 439, 32));

        jTextField17.setText(email);
        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTextField17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kGradientPanel11.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 439, 32));

        jLabel184.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel184.setForeground(new java.awt.Color(255, 240, 220));
        jLabel184.setText("3. Personal Information");
        kGradientPanel11.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jLabel186.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-email-32.png"))); // NOI18N
        kGradientPanel11.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        jLabel187.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-phone-32.png"))); // NOI18N
        kGradientPanel11.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jLabel188.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-person-32.png"))); // NOI18N
        kGradientPanel11.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        jComboBox4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox4.setMaximumRowCount(5);
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Payment Method:", "PayMaya", "GCash", "Debit/Credit Card", "PayPal" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        kGradientPanel11.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 291, -1));

        jLabel189.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel189.setForeground(new java.awt.Color(255, 240, 220));
        jLabel189.setText("4. Payment Method");
        kGradientPanel11.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jLabel190.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel190.setForeground(new java.awt.Color(255, 240, 220));
        jLabel190.setText("Service Fee: PHP 150.00");
        kGradientPanel11.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        jLabel191.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel191.setForeground(new java.awt.Color(255, 240, 220));
        jLabel191.setText("5. Order Summary");
        kGradientPanel11.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        gold.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        gold.setForeground(new java.awt.Color(255, 240, 220));
        gold.setText("  Gold/Gold Loge - PHP 12,800");
        gold.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        gold.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                goldItemStateChanged(evt);
            }
        });
        kGradientPanel11.add(gold, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 254, -1, -1));

        silver.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        silver.setForeground(new java.awt.Color(255, 240, 220));
        silver.setText("  Silver Loge/Balc. - PHP 9,000");
        silver.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        silver.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                silverItemStateChanged(evt);
            }
        });
        kGradientPanel11.add(silver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 296, -1, -1));

        bronze.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        bronze.setForeground(new java.awt.Color(255, 240, 220));
        bronze.setText("  Bronze Balc. - PHP 5,870");
        bronze.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        bronze.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bronzeItemStateChanged(evt);
            }
        });
        kGradientPanel11.add(bronze, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 338, -1, -1));

        qtySilver.setVisible(false);
        qtySilver.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtySilver.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtySilver.setBorder(null);
        qtySilver.setMaximumSize(new java.awt.Dimension(50, 20));
        qtySilver.setMinimumSize(new java.awt.Dimension(50, 20));
        qtySilver.setPreferredSize(new java.awt.Dimension(50, 20));
        qtySilver.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtySilverStateChanged(evt);
            }
        });
        kGradientPanel11.add(qtySilver, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 299, -1, -1));

        qtyGold.setVisible(false);
        qtyGold.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyGold.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyGold.setBorder(null);
        qtyGold.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyGold.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyGold.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyGold.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyGoldStateChanged(evt);
            }
        });
        kGradientPanel11.add(qtyGold, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 257, -1, -1));

        qtyBronze.setVisible(false);
        qtyBronze.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyBronze.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyBronze.setBorder(null);
        qtyBronze.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyBronze.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyBronze.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyBronze.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyBronzeStateChanged(evt);
            }
        });
        kGradientPanel11.add(qtyBronze, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 341, -1, -1));

        jLabel15.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 240, 220));
        jLabel15.setText("Available Tickets");
        kGradientPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, -1, -1));

        lblGold.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblGold.setForeground(new java.awt.Color(255, 240, 220));
        lblGold.setText("Gold:");
        kGradientPanel11.add(lblGold, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, -1, -1));

        lblBronze.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblBronze.setForeground(new java.awt.Color(255, 240, 220));
        lblBronze.setText("Bronze:");
        kGradientPanel11.add(lblBronze, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, -1, -1));

        lblSilver.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblSilver.setForeground(new java.awt.Color(255, 240, 220));
        lblSilver.setText("Silver:");
        kGradientPanel11.add(lblSilver, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, -1, -1));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton27.setBackground(new java.awt.Color(255, 240, 220));
        jButton27.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 240, 220));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/arrow-88-32.png"))); // NOI18N
        jButton27.setToolTipText("");
        jButton27.setBorder(null);
        jButton27.setBorderPainted(false);
        jButton27.setContentAreaFilled(false);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kennygBuyLayout = new javax.swing.GroupLayout(kennygBuy);
        kennygBuy.setLayout(kennygBuyLayout);
        kennygBuyLayout.setHorizontalGroup(
            kennygBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kennygBuyLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                .addComponent(jLabel170)
                .addGap(377, 377, 377))
            .addGroup(kennygBuyLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kennygBuyLayout.setVerticalGroup(
            kennygBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kennygBuyLayout.createSequentialGroup()
                .addGroup(kennygBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel170, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27))
                .addGap(12, 12, 12)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        mainPanel.add(kennygBuy, "cardKennyGBuy");

        hyeriPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        hyeriPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        hyeriPanel.setAutoscrolls(true);
        hyeriPanel.setFocusCycleRoot(true);
        hyeriPanel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        hyeriPanel.setHorizontalScrollBar(null);
        hyeriPanel.setMaximumSize(null);
        hyeriPanel.setMinimumSize(null);
        hyeriPanel.setPreferredSize(new java.awt.Dimension(1118, 2350));

        kGradientPanel12.setkEndColor(new java.awt.Color(31, 52, 96));
        kGradientPanel12.setkGradientFocus(0);
        kGradientPanel12.setkStartColor(new java.awt.Color(20, 22, 26));
        kGradientPanel12.setkTransparentControls(false);
        kGradientPanel12.setMaximumSize(null);
        kGradientPanel12.setName(""); // NOI18N
        kGradientPanel12.setPreferredSize(new java.awt.Dimension(1118, 2350));

        jLabel192.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/hyerifull.jpg"))); // NOI18N

        jLabel193.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/GigHubNameWLogo1Test.png"))); // NOI18N
        jLabel193.setToolTipText("");
        jLabel193.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel193.setFocusable(false);
        jLabel193.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel193.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel194.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel194.setForeground(new java.awt.Color(255, 240, 220));
        jLabel194.setText("HYERI");

        jLabel197.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel197.setForeground(new java.awt.Color(244, 207, 145));
        jLabel197.setText("In Manila");

        jLabel198.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel198.setForeground(new java.awt.Color(255, 240, 220));
        jLabel198.setText("Ticket Prices");

        jLabel202.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel202.setForeground(new java.awt.Color(255, 240, 220));
        jLabel202.setText("July 26, 2025 - 7PM");

        jLabel203.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel203.setForeground(new java.awt.Color(255, 240, 220));
        jLabel203.setText("VIP                                          10,900 PHP ");

        jLabel204.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel204.setForeground(new java.awt.Color(255, 240, 220));
        jLabel204.setText("Category 1                             7,800 PHP ");

        jLabel205.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel205.setForeground(new java.awt.Color(255, 240, 220));
        jLabel205.setText("Category 2                            5,800 PHP");

        jLabel206.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/Hyeri2025FMap.jpg"))); // NOI18N

        jLabel207.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel207.setForeground(new java.awt.Color(255, 240, 220));
        jLabel207.setText("-----------------------------------------------------------");

        jLabel208.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel208.setForeground(new java.awt.Color(255, 240, 220));
        jLabel208.setText("-----------------------------------------------------------");

        jButton28.setBackground(new java.awt.Color(255, 240, 220));
        jButton28.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 240, 220));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/arrow-88-32.png"))); // NOI18N
        jButton28.setBorder(null);
        jButton28.setBorderPainted(false);
        jButton28.setContentAreaFilled(false);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        RoundedPanelHelper.makeRounded(jPanel40, 70);
        jPanel40.setBackground(new java.awt.Color(255, 240, 220));
        jPanel40.setForeground(new java.awt.Color(20, 22, 26));

        RoundedPanelHelper.makeRounded(jPanel41, 60);
        jPanel41.setBackground(new java.awt.Color(15, 23, 42));
        jPanel41.setForeground(new java.awt.Color(20, 22, 26));

        beabadoobeeBuyTicket2.setBackground(new java.awt.Color(255, 240, 220));
        beabadoobeeBuyTicket2.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        beabadoobeeBuyTicket2.setForeground(new java.awt.Color(255, 240, 220));
        beabadoobeeBuyTicket2.setText("BUY TICKET");
        beabadoobeeBuyTicket2.setBorder(null);
        beabadoobeeBuyTicket2.setBorderPainted(false);
        beabadoobeeBuyTicket2.setContentAreaFilled(false);
        beabadoobeeBuyTicket2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beabadoobeeBuyTicket2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(beabadoobeeBuyTicket2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(beabadoobeeBuyTicket2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton29.setBackground(new java.awt.Color(24, 28, 44));
        jButton29.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 240, 220));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/white-down-arrow-png-2.png"))); // NOI18N
        jButton29.setText("For More Information");
        jButton29.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jLabel209.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-calendar-24.png"))); // NOI18N

        jLabel210.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel210.setForeground(new java.awt.Color(244, 207, 145));
        jLabel210.setText("SEAT");

        jLabel211.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel211.setForeground(new java.awt.Color(255, 240, 220));
        jLabel211.setText("PLAN");

        jLabel212.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel212.setForeground(new java.awt.Color(244, 207, 145));
        jLabel212.setText("2025 HYERI FANMEETING TOUR");

        jLabel213.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel213.setForeground(new java.awt.Color(244, 207, 145));
        jLabel213.setText("-Welcome to HYERI's STUDIO- ");

        jLabel214.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel214.setForeground(new java.awt.Color(255, 240, 220));
        jLabel214.setText("Category 3                            3,900 PHP");

        jLabel215.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel215.setForeground(new java.awt.Color(255, 240, 220));
        jLabel215.setText("-----------------------------------------------------------");

        jLabel216.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel216.setForeground(new java.awt.Color(255, 255, 255));
        jLabel216.setText("to HYERI’s STUDIO-. Catch her live on July 26, 2025, at 7:00 PM, at the New Frontier Theater.");

        jLabel217.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel217.setForeground(new java.awt.Color(255, 255, 255));
        jLabel217.setText("LEE HYERI SET TO MEET FANS IN MANILA THIS JULY FOR HER FIRST-EVER ");

        jLabel218.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel218.setForeground(new java.awt.Color(255, 255, 255));
        jLabel218.setText("FAN MEETING TOUR!");

        jLabel219.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel219.setForeground(new java.awt.Color(255, 255, 255));
        jLabel219.setText("Korean actress Lee Hyeri, best known for her roles in Reply 1988, My Roommate is a Gumiho, ");

        jLabel220.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel220.setForeground(new java.awt.Color(255, 255, 255));
        jLabel220.setText("and Friendly Rivalry is finally heading to Manila for the 2025 HYERI FANMEETING TOUR -Welcome");

        javax.swing.GroupLayout kGradientPanel12Layout = new javax.swing.GroupLayout(kGradientPanel12);
        kGradientPanel12.setLayout(kGradientPanel12Layout);
        kGradientPanel12Layout.setHorizontalGroup(
            kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel12Layout.createSequentialGroup()
                .addGroup(kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(346, 346, 346)
                        .addComponent(jLabel193))
                    .addGroup(kGradientPanel12Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel12Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(189, 189, 189)
                                .addComponent(jButton29))
                            .addGroup(kGradientPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel210)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel211))
                            .addGroup(kGradientPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel192)
                                .addGap(47, 47, 47)
                                .addGroup(kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel12Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel209, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel202))
                                    .addComponent(jLabel197)
                                    .addComponent(jLabel198)
                                    .addComponent(jLabel194)
                                    .addGroup(kGradientPanel12Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel203)
                                            .addComponent(jLabel208)
                                            .addComponent(jLabel204)
                                            .addComponent(jLabel205)
                                            .addComponent(jLabel207)
                                            .addComponent(jLabel214)
                                            .addComponent(jLabel215)))
                                    .addComponent(jLabel212)
                                    .addComponent(jLabel213)))
                            .addComponent(jLabel217)
                            .addComponent(jLabel218)
                            .addComponent(jLabel219)
                            .addComponent(jLabel220)
                            .addComponent(jLabel216)
                            .addComponent(jLabel206, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        kGradientPanel12Layout.setVerticalGroup(
            kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel193, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel12Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel12Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel212)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel213)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel197)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel194)
                        .addGap(0, 0, 0)
                        .addGroup(kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel202, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel209, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel198)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel203)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel208)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel204)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel207)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel205)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel215)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel214)))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton29)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel211, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel210, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel206)
                .addGap(18, 18, 18)
                .addComponent(jLabel217, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel218, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel219, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel220, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel216, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        hyeriPanel.setViewportView(kGradientPanel12);

        mainPanel.add(hyeriPanel, "cardHyeri");

        hyeriPanelBuy.setkEndColor(new java.awt.Color(31, 52, 96));
        hyeriPanelBuy.setkGradientFocus(0);
        hyeriPanelBuy.setkStartColor(new java.awt.Color(20, 22, 26));
        hyeriPanelBuy.setMaximumSize(new java.awt.Dimension(1030, 720));
        hyeriPanelBuy.setMinimumSize(new java.awt.Dimension(1030, 720));

        jLabel221.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/GigHubNameWLogo1Test.png"))); // NOI18N
        jLabel221.setToolTipText("");
        jLabel221.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel221.setFocusable(false);
        jLabel221.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel221.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jPanel42.setBackground(new java.awt.Color(255, 240, 220));

        kGradientPanel13.setkEndColor(new java.awt.Color(31, 52, 96));
        kGradientPanel13.setkGradientFocus(0);
        kGradientPanel13.setkStartColor(new java.awt.Color(20, 22, 26));
        kGradientPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RoundedPanelHelper.makeRounded(jPanel43, 70);
        jPanel43.setBackground(new java.awt.Color(255, 240, 220));
        jPanel43.setForeground(new java.awt.Color(20, 22, 26));

        RoundedPanelHelper.makeRounded(jPanel44, 60);
        jPanel44.setBackground(new java.awt.Color(32, 52, 92));
        jPanel44.setForeground(new java.awt.Color(32, 52, 92));

        purchaseButton4.setEnabled(false);
        purchaseButton4.setBackground(new java.awt.Color(255, 240, 220));
        purchaseButton4.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        purchaseButton4.setForeground(new java.awt.Color(255, 240, 220));
        purchaseButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-purchase-48.png"))); // NOI18N
        purchaseButton4.setText("PURCHASE TICKET");
        purchaseButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        purchaseButton4.setBorderPainted(false);
        purchaseButton4.setContentAreaFilled(false);
        purchaseButton4.setEnabled(false);
        purchaseButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchaseButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchaseButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        kGradientPanel13.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, -1));

        jLabel222.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel222.setForeground(new java.awt.Color(255, 240, 220));
        jLabel222.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/Screenshot 2025-06-24 135148.png"))); // NOI18N
        jLabel222.setText("  Buy Ticket - Hyeri Fan Meeting Tour 2025");
        kGradientPanel13.add(jLabel222, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 13, -1, -1));

        jLabel223.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel223.setForeground(new java.awt.Color(255, 240, 220));
        jLabel223.setText("New Frontier Theater, Manila | July 26, 2025 | 7:00 PM");
        kGradientPanel13.add(jLabel223, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 56, -1, -1));

        jLabel224.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel224.setForeground(new java.awt.Color(255, 240, 220));
        jLabel224.setText("1. Select Date");
        kGradientPanel13.add(jLabel224, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 125, 250, -1));

        dates4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        dates4.setMaximumRowCount(3);
        dates4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "July 26 2025 - 7:00 PM" }));
        dates4.setToolTipText("");
        dates4.setAutoscrolls(true);
        dates4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kGradientPanel13.add(dates4, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 154, 240, -1));

        jLabel225.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel225.setForeground(new java.awt.Color(255, 240, 220));
        jLabel225.setText("2. Select Ticket  Type & Quantity");
        kGradientPanel13.add(jLabel225, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 213, 250, -1));

        jTextField5.selectAll();
        jTextField18.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTextField18.setText("Full Name (Last, First M.I.)*");
        jTextField18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField18FocusGained(evt);
            }
        });
        kGradientPanel13.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 439, 32));

        totalCostLabel4.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        totalCostLabel4.setForeground(new java.awt.Color(255, 240, 220));
        totalCostLabel4.setText("Total:   PHP 0.00");
        kGradientPanel13.add(totalCostLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, -1));

        jTextField8.selectAll();
        jTextField19.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTextField19.setText("Contact Number (+639)*");
        jTextField19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField19.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField19FocusGained(evt);
            }
        });
        kGradientPanel13.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 439, 32));

        jTextField20.setText(email);
        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTextField20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kGradientPanel13.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 439, 32));

        jLabel226.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel226.setForeground(new java.awt.Color(255, 240, 220));
        jLabel226.setText("3. Personal Information");
        kGradientPanel13.add(jLabel226, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        jLabel227.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-email-32.png"))); // NOI18N
        kGradientPanel13.add(jLabel227, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jLabel228.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-phone-32.png"))); // NOI18N
        kGradientPanel13.add(jLabel228, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        jLabel229.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-person-32.png"))); // NOI18N
        kGradientPanel13.add(jLabel229, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jComboBox5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox5.setMaximumRowCount(5);
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Payment Method:", "PayMaya", "GCash", "Debit/Credit Card", "PayPal" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 291, -1));

        jLabel230.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel230.setForeground(new java.awt.Color(255, 240, 220));
        jLabel230.setText("4. Payment Method");
        kGradientPanel13.add(jLabel230, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jLabel231.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel231.setForeground(new java.awt.Color(255, 240, 220));
        jLabel231.setText("Service Fee: PHP 150.00");
        kGradientPanel13.add(jLabel231, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        jLabel232.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel232.setForeground(new java.awt.Color(255, 240, 220));
        jLabel232.setText("5. Order Summary");
        kGradientPanel13.add(jLabel232, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        vip3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        vip3.setForeground(new java.awt.Color(255, 240, 220));
        vip3.setText("  VIP - PHP 10,900");
        vip3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        vip3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                vip3ItemStateChanged(evt);
            }
        });
        kGradientPanel13.add(vip3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 254, -1, -1));

        cat1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        cat1.setForeground(new java.awt.Color(255, 240, 220));
        cat1.setText("   Category 1 - PHP 7,800");
        cat1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        cat1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cat1ItemStateChanged(evt);
            }
        });
        kGradientPanel13.add(cat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 296, -1, -1));

        cat2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        cat2.setForeground(new java.awt.Color(255, 240, 220));
        cat2.setText("  Category 2 - PHP 5,800");
        cat2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        cat2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cat2ItemStateChanged(evt);
            }
        });
        kGradientPanel13.add(cat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 338, -1, -1));

        qtyCat1.setVisible(false);
        qtyCat1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyCat1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyCat1.setBorder(null);
        qtyCat1.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyCat1.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyCat1.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyCat1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyCat1StateChanged(evt);
            }
        });
        kGradientPanel13.add(qtyCat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 299, -1, -1));

        qtyVip3.setVisible(false);
        qtyVip3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyVip3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyVip3.setBorder(null);
        qtyVip3.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyVip3.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyVip3.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyVip3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyVip3StateChanged(evt);
            }
        });
        kGradientPanel13.add(qtyVip3, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 257, -1, -1));

        qtyCat2.setVisible(false);
        qtyCat2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyCat2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyCat2.setBorder(null);
        qtyCat2.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyCat2.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyCat2.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyCat2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyCat2StateChanged(evt);
            }
        });
        kGradientPanel13.add(qtyCat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 341, -1, -1));

        cat3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        cat3.setForeground(new java.awt.Color(255, 240, 220));
        cat3.setText("  Category 3 - PHP 3,900");
        cat3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        cat3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cat3ItemStateChanged(evt);
            }
        });
        kGradientPanel13.add(cat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        qtyCat3.setVisible(false);
        qtyCat3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        qtyCat3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        qtyCat3.setBorder(null);
        qtyCat3.setMaximumSize(new java.awt.Dimension(50, 20));
        qtyCat3.setMinimumSize(new java.awt.Dimension(50, 20));
        qtyCat3.setPreferredSize(new java.awt.Dimension(50, 20));
        qtyCat3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyCat3StateChanged(evt);
            }
        });
        kGradientPanel13.add(qtyCat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 383, -1, -1));

        jLabel16.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 240, 220));
        jLabel16.setText("Available Tickets");
        kGradientPanel13.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, -1, -1));

        lblVIP3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblVIP3.setForeground(new java.awt.Color(255, 240, 220));
        lblVIP3.setText("VIP:");
        kGradientPanel13.add(lblVIP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, -1, -1));

        lblCat1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblCat1.setForeground(new java.awt.Color(255, 240, 220));
        lblCat1.setText("Cat. 1:");
        kGradientPanel13.add(lblCat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, -1, -1));

        lblCat3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblCat3.setForeground(new java.awt.Color(255, 240, 220));
        lblCat3.setText("Cat. 3:");
        kGradientPanel13.add(lblCat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, -1, -1));

        lblCat2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblCat2.setForeground(new java.awt.Color(255, 240, 220));
        lblCat2.setText("Cat. 2:");
        kGradientPanel13.add(lblCat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, -1, -1));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton30.setBackground(new java.awt.Color(255, 240, 220));
        jButton30.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 240, 220));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/arrow-88-32.png"))); // NOI18N
        jButton30.setToolTipText("");
        jButton30.setBorder(null);
        jButton30.setBorderPainted(false);
        jButton30.setContentAreaFilled(false);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hyeriPanelBuyLayout = new javax.swing.GroupLayout(hyeriPanelBuy);
        hyeriPanelBuy.setLayout(hyeriPanelBuyLayout);
        hyeriPanelBuyLayout.setHorizontalGroup(
            hyeriPanelBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hyeriPanelBuyLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                .addComponent(jLabel221)
                .addGap(377, 377, 377))
            .addGroup(hyeriPanelBuyLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hyeriPanelBuyLayout.setVerticalGroup(
            hyeriPanelBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hyeriPanelBuyLayout.createSequentialGroup()
                .addGroup(hyeriPanelBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel221, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30))
                .addGap(12, 12, 12)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        mainPanel.add(hyeriPanelBuy, "cardHyeriBuy");

        infoCustomer.setkEndColor(new java.awt.Color(31, 52, 96));
        infoCustomer.setkGradientFocus(0);
        infoCustomer.setkStartColor(new java.awt.Color(20, 22, 26));
        infoCustomer.setMaximumSize(new java.awt.Dimension(1030, 720));
        infoCustomer.setMinimumSize(new java.awt.Dimension(1030, 720));
        infoCustomer.setPreferredSize(new java.awt.Dimension(1030, 720));

        RoundedPanelHelper.makeRounded(jPanel15, 30);
        jPanel15.setBackground(new java.awt.Color(255, 240, 220));

        jLabel23.setFont(new java.awt.Font("Poppins", 1, 42)); // NOI18N
        jLabel23.setText("INFORMATION & CUSTOMER");

        jLabel24.setFont(new java.awt.Font("Poppins", 1, 42)); // NOI18N
        jLabel24.setText("SERVICE CONCERNS");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel24)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/GigHubNameWLogo1Test.png"))); // NOI18N

        RoundedPanelHelper.makeRounded(jPanel16, 30);
        jPanel16.setBackground(iThinkBeige);

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jTextArea6.setRows(2);
        jTextArea6.setText("Unit 5C, Aurora Tower, Katipunan Avenue,\nQuezon City, Metro Manila, Philippines");

        jTextArea7.setEditable(false);
        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jTextArea7.setRows(1);
        jTextArea7.setText("support@gighub.ph");

        jTextArea8.setEditable(false);
        jTextArea8.setColumns(20);
        jTextArea8.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jTextArea8.setRows(2);
        jTextArea8.setText("+63 917 825 4391");

        jTextArea9.setEditable(false);
        jTextArea9.setColumns(20);
        jTextArea9.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jTextArea9.setRows(1);
        jTextArea9.setText("Phone");

        jTextArea10.setEditable(false);
        jTextArea10.setColumns(20);
        jTextArea10.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jTextArea10.setRows(1);
        jTextArea10.setText("Address:");

        jTextArea11.setEditable(false);
        jTextArea11.setColumns(20);
        jTextArea11.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jTextArea11.setRows(1);
        jTextArea11.setText("Email");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/address1.png"))); // NOI18N

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/mail1.png"))); // NOI18N

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/pc.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel27)))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jTextArea9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextArea8, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jTextArea11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextArea7, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jTextArea10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextArea6, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jTextArea6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextArea7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextArea11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25)
                            .addComponent(jTextArea10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel26)))
                .addGap(49, 49, 49)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextArea8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextArea9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel27))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout infoCustomerLayout = new javax.swing.GroupLayout(infoCustomer);
        infoCustomer.setLayout(infoCustomerLayout);
        infoCustomerLayout.setHorizontalGroup(
            infoCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoCustomerLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(infoCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoCustomerLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(390, 390, 390))
                    .addGroup(infoCustomerLayout.createSequentialGroup()
                        .addGroup(infoCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(108, 108, 108))))
        );
        infoCustomerLayout.setVerticalGroup(
            infoCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoCustomerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(infoCustomer, "card5");

        profilePanel.setkEndColor(new java.awt.Color(31, 52, 96));
        profilePanel.setkGradientFocus(0);
        profilePanel.setkStartColor(new java.awt.Color(20, 22, 26));
        profilePanel.setMaximumSize(new java.awt.Dimension(1030, 720));
        profilePanel.setMinimumSize(new java.awt.Dimension(1030, 720));
        profilePanel.setName(""); // NOI18N

        jPanel33.setBackground(new java.awt.Color(255, 240, 220));

        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/profile-user.png"))); // NOI18N

        kGradientPanel8.setkEndColor(new java.awt.Color(31, 52, 96));
        kGradientPanel8.setkGradientFocus(0);
        kGradientPanel8.setkStartColor(new java.awt.Color(20, 22, 26));
        kGradientPanel8.setPreferredSize(new java.awt.Dimension(600, 400));

        jButton8.setBackground(new java.awt.Color(28, 44, 84));
        jButton8.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 240, 220));
        jButton8.setText("BOOKING HISTORY");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 240, 220), 5, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel155.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(255, 240, 220));
        jLabel155.setText("Username:");

        jLabel160.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel160.setForeground(new java.awt.Color(255, 240, 220));
        jLabel160.setText("Gender:");

        jLabel161.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(255, 240, 220));
        jLabel161.setText("Age:");

        jLabel163.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel163.setForeground(new java.awt.Color(255, 240, 220));
        jLabel163.setText("Email:");

        jLabel164.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(255, 240, 220));
        jLabel164.setText("Birthdate:");

        lblEmail.setOpaque(false);
        lblEmail.setBackground(new Color(0, 0, 0, 0));
        lblEmail.setBorder(null);
        lblEmail.setEditable(false);
        lblEmail.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 240, 220));
        lblEmail.setText("INFO");
        lblEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 240, 220)));

        lblName.setOpaque(false);
        lblName.setBackground(new Color(0, 0, 0, 0));
        lblName.setBorder(null);
        lblName.setEditable(false);
        lblName.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 240, 220));
        lblName.setText("INFO");
        lblName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 240, 220)));

        lblGender.setOpaque(false);
        lblGender.setBackground(new Color(0, 0, 0, 0));
        lblGender.setBorder(null);
        lblGender.setEditable(false);
        lblGender.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 240, 220));
        lblGender.setText("INFO");
        lblGender.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 240, 220)));

        lblBirthdate.setOpaque(false);
        lblBirthdate.setBackground(new Color(0, 0, 0, 0));
        lblBirthdate.setBorder(null);
        lblBirthdate.setEditable(false);
        lblBirthdate.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lblBirthdate.setForeground(new java.awt.Color(255, 240, 220));
        lblBirthdate.setText("INFO");
        lblBirthdate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 240, 220)));

        lblAge.setOpaque(false);
        lblAge.setBackground(new Color(0, 0, 0, 0));
        lblAge.setBorder(null);
        lblAge.setEditable(false);
        lblAge.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(255, 240, 220));
        lblAge.setText("INFO");
        lblAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 240, 220)));

        editSaveButton.setBackground(new java.awt.Color(28, 44, 84));
        editSaveButton.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        editSaveButton.setForeground(new java.awt.Color(255, 240, 220));
        editSaveButton.setText("EDIT PROFILE");
        editSaveButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 240, 220), 5, true));
        editSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSaveButtonActionPerformed(evt);
            }
        });

        jLabel165.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(255, 240, 220));
        jLabel165.setText("Password:");

        lblPassword.setOpaque(false);
        lblPassword.setBackground(new Color(0, 0, 0, 0));
        lblPassword.setBorder(null);
        lblPassword.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 240, 220));
        lblPassword.setText("Password");
        lblPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 240, 220)));

        showPasswordCheckBoxProfilePage.setOpaque(false);
        showPasswordCheckBoxProfilePage.setContentAreaFilled(false);
        showPasswordCheckBoxProfilePage.setBorderPainted(false);
        showPasswordCheckBoxProfilePage.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        showPasswordCheckBoxProfilePage.setForeground(new java.awt.Color(255, 240, 220));
        showPasswordCheckBoxProfilePage.setText("Show Password");
        showPasswordCheckBoxProfilePage.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        showPasswordCheckBoxProfilePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCheckBoxProfilePageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel8Layout = new javax.swing.GroupLayout(kGradientPanel8);
        kGradientPanel8.setLayout(kGradientPanel8Layout);
        kGradientPanel8Layout.setHorizontalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel164)
                            .addComponent(jLabel163)
                            .addComponent(jLabel165)
                            .addComponent(jLabel155)
                            .addComponent(jLabel160)
                            .addComponent(jLabel161))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showPasswordCheckBoxProfilePage)
                            .addComponent(lblPassword)
                            .addComponent(lblEmail)
                            .addComponent(lblBirthdate)
                            .addComponent(lblAge)
                            .addComponent(lblGender)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        kGradientPanel8Layout.setVerticalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel155)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel160)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel161))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel164)
                    .addComponent(lblBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel163)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel165)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPasswordCheckBoxProfilePage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jLabel159.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel159.setText("MY PROFILE");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel156)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel33Layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(jLabel159)
                    .addContainerGap(551, Short.MAX_VALUE)))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel156, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel33Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel159, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(463, 463, 463)))
        );

        jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/GigHubNameWLogo1Test.png"))); // NOI18N

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jLabel167))
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        mainPanel.add(profilePanel, "profileCard");

        bookingHistoryPanel.setkEndColor(new java.awt.Color(31, 52, 96));
        bookingHistoryPanel.setkGradientFocus(0);
        bookingHistoryPanel.setkStartColor(new java.awt.Color(20, 22, 26));
        bookingHistoryPanel.setMaximumSize(new java.awt.Dimension(1030, 720));
        bookingHistoryPanel.setMinimumSize(new java.awt.Dimension(1030, 720));
        bookingHistoryPanel.setName(""); // NOI18N

        jPanel34.setBackground(new java.awt.Color(255, 240, 220));

        jLabel157.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel157.setText("BOOKING HISTORY");

        jLabel158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/ticket.png"))); // NOI18N

        kGradientPanel9.setkEndColor(new java.awt.Color(31, 52, 96));
        kGradientPanel9.setkGradientFocus(0);
        kGradientPanel9.setkStartColor(new java.awt.Color(20, 22, 26));

        tblBookingHistory.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        tblBookingHistory.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        tblBookingHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ticket ID", "Concert Name", "Ticket Price", "Ticket Quantity", "Total Amount", "Purchase Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBookingHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookingHistoryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBookingHistory);

        javax.swing.GroupLayout kGradientPanel9Layout = new javax.swing.GroupLayout(kGradientPanel9);
        kGradientPanel9.setLayout(kGradientPanel9Layout);
        kGradientPanel9Layout.setHorizontalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel9Layout.setVerticalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel158)
                .addGap(18, 18, 18)
                .addComponent(jLabel157)
                .addContainerGap(389, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel158, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/GigHubNameWLogo1Test.png"))); // NOI18N

        jButton22.setBackground(new java.awt.Color(255, 240, 220));
        jButton22.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 240, 220));
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/arrow-88-32.png"))); // NOI18N
        jButton22.setBorder(null);
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookingHistoryPanelLayout = new javax.swing.GroupLayout(bookingHistoryPanel);
        bookingHistoryPanel.setLayout(bookingHistoryPanelLayout);
        bookingHistoryPanelLayout.setHorizontalGroup(
            bookingHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingHistoryPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(bookingHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookingHistoryPanelLayout.createSequentialGroup()
                        .addComponent(jButton22)
                        .addGap(306, 306, 306)
                        .addComponent(jLabel168))
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        bookingHistoryPanelLayout.setVerticalGroup(
            bookingHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingHistoryPanelLayout.createSequentialGroup()
                .addGroup(bookingHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookingHistoryPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookingHistoryPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton22)
                        .addGap(42, 42, 42)))
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        mainPanel.add(bookingHistoryPanel, "bookingHistoryCard");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addComponent(sideMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        kGradientPanel3.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void compMods(){
        jLabel9.setForeground(transparent);
        jLabel10.setForeground(transparent);
        jLabel11.setForeground(transparent);
        jLabel12.setForeground(transparent);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "cardHomePanel");
        isSetVisible = false;
        setToDefualt();
        
        jButton4.setVisible(isSetVisible);
        jButton5.setVisible(isSetVisible);
        jButton6.setVisible(isSetVisible);
        
        jPanel1.setBackground(new Color(0xf4cf91)); //[255,240,220]
        jPanel2.setBackground(new Color(255,240,220));
        jPanel32.setBackground(new Color(255,240,220));
        jPanel3.setBackground(blackk);
        jPanel4.setBackground(blackk);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "card3");
        isSetVisible = false;
        setToDefualt();
        
        jButton4.setVisible(isSetVisible);
        jButton5.setVisible(isSetVisible);
        jButton6.setVisible(isSetVisible);
        
        jPanel32.setBackground(cream);
        jPanel1.setBackground(new Color(255,240,220)); 
        jPanel2.setBackground(new Color(0xf4cf91));
        jPanel3.setBackground(blackk);
        jPanel4.setBackground(blackk);
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "card4");
        isSetVisible = true;
        setToDefualt();
        
        txtFirstName.setText("First Name*");
        txtLastName.setText("Last Name*");
        txtMI.setText("M.I.*");
        txtSubjectEvent.setText("Subject Event*");
        txtContactNumber.setText("Contact Number*");
        String email = UserSession.getEmail();
        txtEmailAddress.setText(email);
        txtMessage.setText("Message*");
            
        jPanel32.setBackground(new Color(255,240,220));
        jButton4.setVisible(isSetVisible);
        jButton5.setVisible(isSetVisible);
        jButton6.setVisible(isSetVisible);
        
        jButton4ActionPerformed(evt);
    }//GEN-LAST:event_jButton3ActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "card4");
        setToDefualt();
        
        txtFirstName.setText("First Name*");
        txtLastName.setText("Last Name*");
        txtMI.setText("M.I.*");
        txtSubjectEvent.setText("Subject Event*");
        txtContactNumber.setText("Contact Number*");
        String email = UserSession.getEmail();
        txtEmailAddress.setText(email);
        txtMessage.setText("Message*");
        
        jPanel1.setBackground(new Color(255,240,220)); 
        jPanel2.setBackground(new Color(255,240,220));
        jPanel3.setBackground(iThinkBeige);
        jPanel4.setBackground(blackk);
    }//GEN-LAST:event_jButton4ActionPerformed
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "card5");
        setToDefualt();
        
        jPanel1.setBackground(new Color(255,240,220)); 
        jPanel2.setBackground(new Color(255,240,220));
        jPanel3.setBackground(blackk);
        jPanel4.setBackground(iThinkBeige);
    }//GEN-LAST:event_jButton5ActionPerformed
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton5ActionPerformed(evt);
    }//GEN-LAST:event_jButton6ActionPerformed
    private void txtMessageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMessageFocusGained
        txtMessage.selectAll();
    }//GEN-LAST:event_txtMessageFocusGained
    private void txtFirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstNameFocusGained
        txtFirstName.selectAll();
    }//GEN-LAST:event_txtFirstNameFocusGained
    private void txtLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusGained
        txtLastName.selectAll();
    }//GEN-LAST:event_txtLastNameFocusGained
    private void txtMIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMIFocusGained
        txtMI.selectAll();
    }//GEN-LAST:event_txtMIFocusGained
    private void txtSubjectEventFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSubjectEventFocusGained
        txtSubjectEvent.selectAll();
    }//GEN-LAST:event_txtSubjectEventFocusGained
    private void txtContactNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactNumberFocusGained
        txtContactNumber.selectAll();
    }//GEN-LAST:event_txtContactNumberFocusGained
    private void txtEmailAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailAddressFocusGained
        txtEmailAddress.selectAll();
    }//GEN-LAST:event_txtEmailAddressFocusGained
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "cardBea");
        setToDefualt();
    }//GEN-LAST:event_jButton14ActionPerformed
    private void jTextField8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusGained
        jTextField8.selectAll();
        
    }//GEN-LAST:event_jTextField8FocusGained
    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        jTextField5.selectAll();
        
    }//GEN-LAST:event_jTextField5FocusGained
    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        String concertName = "beabadoobee";
        boolean atLeastOneBooked = false; // track if anything was selected
        double grandTotal = 0;

        TicketService ts = new TicketService();
        
        // Validate Credentials
        String fullName = jTextField5.getText().trim();
        String contactNum = jTextField8.getText().trim();
        
        String namePattern = "^[A-Z][a-z]+(?: [A-Z][a-z]+)*, [A-Z][a-z]+(?: [A-Z][a-z]+)* [A-Z]$";
        String contactPattern = "^\\+639\\d{9}$";

        if (!fullName.matches(namePattern)) {
            JOptionPane.showMessageDialog(this, "Wrong name format.\nUse: Last, Firstname M", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!contactNum.matches(contactPattern)) {
            JOptionPane.showMessageDialog(this, "Invalid contact number format.\nUse: +639XXXXXXXXX", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (floorA.isSelected()) {
            int qty = (int) qtyFloorA.getValue();
            if (qty > 0) {
                double price = 5550;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        if (floorB.isSelected()) {
            int qty = (int) qtyFloorB.getValue();
            if (qty > 0) {
                double price = 4550;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        if (loge.isSelected()) {
            int qty = (int) qtyLoge.getValue();
            if (qty > 0) {
                double price = 3750;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        if (balcony1.isSelected()) {
            int qty = (int) qtyBalcony1.getValue();
            if (qty > 0) {
                double price = 2750;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        if (balcony2.isSelected()) {
            int qty = (int) qtyBalcony2.getValue();
            if (qty > 0) {
                double price = 1750;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        // Handle success/failure messages
        if (atLeastOneBooked) {
            totalCostLabel.setText(String.format("Total: PHP %.2f", grandTotal));
            PurchasePopupMenu popup = new PurchasePopupMenu(this, true);
            popup.setLocationRelativeTo(null);
            popup.setVisible(true);
            
            //Set to Default
            floorA.setSelected(false);
            floorB.setSelected(false);
            loge.setSelected(false);
            balcony1.setSelected(false);
            balcony2.setSelected(false);
            
            qtyFloorA.setValue(0);
            qtyFloorB.setValue(0);
            qtyLoge.setValue(0);
            qtyBalcony1.setValue(0);
            qtyBalcony2.setValue(0);
            
            jTextField5.setText("Full Name (Last, First M.I.)*");
            jTextField8.setText("Contact Number (+63)*");
            dates.setSelectedIndex(0);
            jComboBox1.setSelectedIndex(0);
            purchaseButton.setEnabled(false);

            loadBookingHistory();
            loadAvailableTickets("beabadoobee");
        } else {
            JOptionPane.showMessageDialog(this, "❌ No valid ticket selected. Make sure quantity is at least 1.");
        }

    }//GEN-LAST:event_purchaseButtonActionPerformed
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        purchaseButton.setEnabled(true);
    }//GEN-LAST:event_jComboBox1ActionPerformed
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to Exit?", 
        "Exit Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        JScrollBar verticalBar = parkSeoJunPanel.getVerticalScrollBar();
        verticalBar.setValue(verticalBar.getMaximum());
    }//GEN-LAST:event_jButton18ActionPerformed
    private void psjBuyTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psjBuyTicketActionPerformed
        loadAvailableTickets("Park Seo Jun: FIT FOR ANY ROLE");
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "psjBUYTICKET");
    }//GEN-LAST:event_psjBuyTicketActionPerformed
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "cardHomePanel");
    }//GEN-LAST:event_jButton16ActionPerformed
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String mi = txtMI.getText();
        String subject = txtSubjectEvent.getText();
        String contact = txtContactNumber.getText();
        String emailDisplay = txtEmailAddress.getText();
        String message = txtMessage.getText();
        
        if (firstName.isEmpty() || lastName.isEmpty() || mi.isEmpty() ||
        subject.isEmpty() || contact.isEmpty() || emailDisplay.isEmpty() || message.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill out all fields.");
        return;
    }
        
        // Validate each field
        if (!FieldValidator.isValidFirstName(firstName)) {
            JOptionPane.showMessageDialog(this, "Invalid First Name (Start with capital, letters/spaces/hyphens only).", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!FieldValidator.isValidLastName(lastName)) {
            JOptionPane.showMessageDialog(this, "Invalid Last Name.", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!FieldValidator.isValidMiddleInitial(mi)) {
            JOptionPane.showMessageDialog(this, "Middle Initial must be a SINGLE capital letter and NO PERIOD.", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!FieldValidator.isValidSubject(subject)) {
            JOptionPane.showMessageDialog(this, "Invalid Subject/Event.", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!FieldValidator.isValidContactNumber(contact)) {
            JOptionPane.showMessageDialog(this, "Invalid Contact Number (Must start with +639 and be 11 digits).", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!FieldValidator.isValidEmail(emailDisplay)) {
            JOptionPane.showMessageDialog(this, "Invalid Email Address.", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!FieldValidator.isValidMessage(message)) {
            JOptionPane.showMessageDialog(this, "Invalid Message content.", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try (Connection conn = DatabaseConnection.connectDB()) {
            String sql = "INSERT INTO inquiries (first_name, last_name, middle_initial, subject_event, contact_number, email_address, message) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, mi);
            stmt.setString(4, subject);
            stmt.setString(5, contact);
            stmt.setString(6, emailDisplay);
            stmt.setString(7, message);
        
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Inquiry submitted successfully!");
            
            txtFirstName.setText("First Name*");
            txtLastName.setText("Last Name*");
            txtMI.setText("M.I.*");
            txtSubjectEvent.setText("Subject Event*");
            txtContactNumber.setText("Contact Number*");
            String email = UserSession.getEmail();
            txtEmailAddress.setText(email);
            txtMessage.setText("Message*");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
        
    }//GEN-LAST:event_submitButtonActionPerformed
    private void purchaseButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButton1ActionPerformed
        String concertName = "Park Seo Jun: FIT FOR ANY ROLE";
        boolean atLeastOneBooked = false; // track if anything was selected
        double grandTotal = 0;

        TicketService ts = new TicketService();

        // Validate Credentials
        String fullName = jTextField10.getText().trim();
        String contactNum = jTextField11.getText().trim();
        
        String namePattern = "^[A-Z][a-z]+(?: [A-Z][a-z]+)*, [A-Z][a-z]+(?: [A-Z][a-z]+)* [A-Z]$";
        String contactPattern = "^\\+639\\d{9}$";

        if (!fullName.matches(namePattern)) {
            JOptionPane.showMessageDialog(this, "Wrong name format.\nUse: Last, Firstname M", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!contactNum.matches(contactPattern)) {
            JOptionPane.showMessageDialog(this, "Invalid contact number format.\nUse: +639XXXXXXXXX", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
            
        if (vvip.isSelected()) {
            int qty = (int) qtyVvip.getValue();
            if (qty > 0) {
                double price = 12000;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        if (vip.isSelected()) {
            int qty = (int) qtyVip.getValue();
            if (qty > 0) {
                double price = 10000;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        if (patron.isSelected()) {
            int qty = (int) qtyPatron.getValue();
            if (qty > 0) {
                double price = 8500;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        if (lowerBox.isSelected()) {
            int qty = (int) qtyLowerBox.getValue();
            if (qty > 0) {
                double price = 6500;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        if (upperBox.isSelected()) {
            int qty = (int) qtyUpperBox.getValue();
            if (qty > 0) {
                double price = 2750;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }
        
        if (generalAd.isSelected()) {
            int qty = (int) qtyGeneralAd.getValue();
            if (qty > 0) {
                double price = 1750;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        // Handle success/failure messages
        if (atLeastOneBooked) {
            totalCostLabel1.setText(String.format("Total: PHP %.2f", grandTotal));
            PurchasePopupMenu popup = new PurchasePopupMenu(this, true);
            popup.setLocationRelativeTo(null);
            popup.setVisible(true);
            
            //Set to Default
            vvip.setSelected(false);
            vip.setSelected(false);
            patron.setSelected(false);
            lowerBox.setSelected(false);
            upperBox.setSelected(false);
            generalAd.setSelected(false);
            
            qtyVvip.setValue(0);
            qtyVip.setValue(0);
            qtyPatron.setValue(0);
            qtyLowerBox.setValue(0);
            qtyUpperBox.setValue(0);
            qtyGeneralAd.setValue(0);
            
            jTextField10.setText("Full Name (Last, First M.I.)*");
            jTextField11.setText("Contact Number (+63)*");
            dates1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            purchaseButton1.setEnabled(false);
            
            loadBookingHistory();
            loadAvailableTickets("Park Seo Jun: FIT FOR ANY ROLE");
        } else {
            JOptionPane.showMessageDialog(this, "❌ Failed to Book Ticket, Please Try Again.");
        }

    }//GEN-LAST:event_purchaseButton1ActionPerformed
    private void jTextField10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusGained
        jTextField10.selectAll();
       
    }//GEN-LAST:event_jTextField10FocusGained
    private void jTextField11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusGained
        jTextField11.selectAll();
        
    }//GEN-LAST:event_jTextField11FocusGained
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        purchaseButton1.setEnabled(true);
    }//GEN-LAST:event_jComboBox2ActionPerformed
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "cardPSJ");
        setToDefualt();
    }//GEN-LAST:event_jButton20ActionPerformed
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "cardHomePanel");
    }//GEN-LAST:event_jButton11ActionPerformed
    private void regineAndViceBuyTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regineAndViceBuyTicketActionPerformed
        loadAvailableTickets("SUPERDIVAS: The Concert");
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "rvBUYTICKET");
    }//GEN-LAST:event_regineAndViceBuyTicketActionPerformed
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        JScrollBar verticalBar = regineAndVicePanel.getVerticalScrollBar();
        verticalBar.setValue(verticalBar.getMaximum());
    }//GEN-LAST:event_jButton17ActionPerformed
    private void purchaseButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButton2ActionPerformed
        String concertName = "SUPERDIVAS: The Concert";
        boolean atLeastOneBooked = false; // track if anything was selected
        double grandTotal = 0;

        TicketService ts = new TicketService();
        
        // Validate Credentials
        String fullName = fullNameTextField.getText().trim();
        String contactNum = jTextField14.getText().trim();
        
        String namePattern = "^[A-Z][a-z]+(?: [A-Z][a-z]+)*, [A-Z][a-z]+(?: [A-Z][a-z]+)* [A-Z]$";
        String contactPattern = "^\\+639\\d{9}$";

        if (!fullName.matches(namePattern)) {
            JOptionPane.showMessageDialog(this, "Wrong name format.\nUse: Last, Firstname M", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!contactNum.matches(contactPattern)) {
            JOptionPane.showMessageDialog(this, "Invalid contact number format.\nUse: +639XXXXXXXXX", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (platinum.isSelected()) {
            int qty = (int) qtyPlatinum.getValue();
            if (qty > 0) {
                double price = 15000;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }
      
        if (svip.isSelected()) {
            int qty = (int) qtySvip.getValue();
            if (qty > 0) {
                double price = 12000;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        if (vip1.isSelected()) {
            int qty = (int) qtyVip1.getValue();
            if (qty > 0) {
                double price = 8000;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        if (patron1.isSelected()) {
            int qty = (int) qtyPatron1.getValue();
            if (qty > 0) {
                double price = 6000;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        if (lowerBox1.isSelected()) {
            int qty = (int) qtyLowerBox1.getValue();
            if (qty > 0) {
                double price = 4000;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        if (upperBox1.isSelected()) {
            int qty = (int) qtyUpperBox1.getValue();
            if (qty > 0) {
                double price = 1500;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }
        
        if (generalAd1.isSelected()) {
            int qty = (int) qtyGeneralAd1.getValue();
            if (qty > 0) {
                double price = 500;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        // Handle success/failure messages
        if (atLeastOneBooked) {
            totalCostLabel2.setText(String.format("Total: PHP %.2f", grandTotal));
            PurchasePopupMenu popup = new PurchasePopupMenu(this, true);
            popup.setLocationRelativeTo(null);
            popup.setVisible(true);
            
            //Set to Default
            platinum.setSelected(false);
            svip.setSelected(false);
            vip1.setSelected(false);
            patron1.setSelected(false);
            lowerBox1.setSelected(false);
            upperBox1.setSelected(false);
            generalAd1.setSelected(false);
            
            qtyPlatinum.setValue(0);
            qtySvip.setValue(0);
            qtyVip1.setValue(0);
            qtyPatron1.setValue(0);
            qtyLowerBox1.setValue(0);
            qtyUpperBox1.setValue(0);
            qtyGeneralAd1.setValue(0);
            
            fullNameTextField.setText("Full Name (Last, First M.I.)*");
            jTextField14.setText("Contact Number (+63)*");
            dates2.setSelectedIndex(0);
            jComboBox3.setSelectedIndex(0);
            purchaseButton2.setEnabled(false);
            
            loadBookingHistory();
            loadAvailableTickets("SUPERDIVAS: The Concert");
        } else {
            JOptionPane.showMessageDialog(this, "❌ No valid ticket selected. Make sure quantity is at least 1.");
        }

    }//GEN-LAST:event_purchaseButton2ActionPerformed
    private void fullNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullNameTextFieldFocusGained
        fullNameTextField.selectAll();
        
    }//GEN-LAST:event_fullNameTextFieldFocusGained
    private void jTextField14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusGained
        jTextField14.selectAll();
       
    }//GEN-LAST:event_jTextField14FocusGained
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        purchaseButton2.setEnabled(true);
    }//GEN-LAST:event_jComboBox3ActionPerformed
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "cardRV");
        setToDefualt();
    }//GEN-LAST:event_jButton21ActionPerformed
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "profileCard");
        isSetVisible = false;
        
        jButton4.setVisible(isSetVisible);
        jButton5.setVisible(isSetVisible);
        jButton6.setVisible(isSetVisible);
        
        jPanel32.setBackground(new Color(0xf4cf91)); //[255,240,220]
        jPanel2.setBackground(new Color(255,240,220));
        jPanel1.setBackground(new Color(255,240,220));
        jPanel3.setBackground(blackk);
        jPanel4.setBackground(blackk);
        setToDefualt();
        
        
    }//GEN-LAST:event_jButton7ActionPerformed
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "bookingHistoryCard");
    }//GEN-LAST:event_jButton8ActionPerformed
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "profileCard");
    }//GEN-LAST:event_jButton22ActionPerformed
    private void tblBookingHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookingHistoryMouseClicked
       int selectedRow = tblBookingHistory.getSelectedRow();
        if (selectedRow == -1) return;

        int confirm = JOptionPane.showConfirmDialog(null,
            "Are you sure you want to delete this booking?",
            "Delete Confirmation",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                // Make sure ticket_id is column 0
                int ticketId = Integer.parseInt(tblBookingHistory.getValueAt(selectedRow, 0).toString());

                TicketService ticketService = new TicketService();
                boolean deleted = ticketService.deleteTicket(ticketId);

                if (deleted) {
                    JOptionPane.showMessageDialog(null, "Booking deleted.");
                    loadBookingHistory(); // Refresh the table
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to delete booking.");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_tblBookingHistoryMouseClicked
    private void floorAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_floorAItemStateChanged
        updateTotalCost1();
        if (floorA.isSelected()) {
            qtyFloorA.setVisible(true);
        } else {
            qtyFloorA.setVisible(false);
            qtyFloorA.setValue(0); 
        }
    }//GEN-LAST:event_floorAItemStateChanged
    private void floorBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_floorBItemStateChanged
        updateTotalCost1();
        if (floorB.isSelected()) {
            qtyFloorB.setVisible(true);
        } else {
            qtyFloorB.setVisible(false);
            qtyFloorB.setValue(0);
        }
    }//GEN-LAST:event_floorBItemStateChanged
    private void logeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_logeItemStateChanged
        updateTotalCost1();
        if (loge.isSelected()) {
            qtyLoge.setVisible(true);
        } else {
            qtyLoge.setVisible(false);
            qtyLoge.setValue(0);
        }
    }//GEN-LAST:event_logeItemStateChanged
    private void balcony1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_balcony1ItemStateChanged
        updateTotalCost1();
        if (balcony1.isSelected()) {
            qtyBalcony1.setVisible(true);
        } else {
            qtyBalcony1.setVisible(false);
            qtyBalcony1.setValue(0);
        }
    }//GEN-LAST:event_balcony1ItemStateChanged
    private void balcony2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_balcony2ItemStateChanged
        updateTotalCost1();
        if (balcony2.isSelected()) {
            qtyBalcony2.setVisible(true);
        } else {
            qtyBalcony2.setVisible(false);
            qtyBalcony2.setValue(0);
        }
    }//GEN-LAST:event_balcony2ItemStateChanged
    private void qtyFloorAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyFloorAStateChanged
        updateTotalCost1();
    }//GEN-LAST:event_qtyFloorAStateChanged
    private void qtyFloorBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyFloorBStateChanged
        updateTotalCost1();
    }//GEN-LAST:event_qtyFloorBStateChanged
    private void qtyLogeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyLogeStateChanged
        updateTotalCost1();
    }//GEN-LAST:event_qtyLogeStateChanged
    private void qtyBalcony1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyBalcony1StateChanged
        updateTotalCost1();
    }//GEN-LAST:event_qtyBalcony1StateChanged
    private void qtyBalcony2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyBalcony2StateChanged
        updateTotalCost1();
    }//GEN-LAST:event_qtyBalcony2StateChanged
    private void vvipItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_vvipItemStateChanged
        updateTotalCost2();
        if (vvip.isSelected()) {
            qtyVvip.setVisible(true);
        } else {
            qtyVvip.setVisible(false);
            qtyVvip.setValue(0); 
        }
    }//GEN-LAST:event_vvipItemStateChanged
    private void vipItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_vipItemStateChanged
        updateTotalCost2();
        if (vip.isSelected()) {
            qtyVip.setVisible(true);
        } else {
            qtyVip.setVisible(false);
            qtyVip.setValue(0); 
        }
    }//GEN-LAST:event_vipItemStateChanged
    private void patronItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_patronItemStateChanged
        updateTotalCost2();
        if (patron.isSelected()) {
            qtyPatron.setVisible(true);
        } else {
            qtyPatron.setVisible(false);
            qtyPatron.setValue(0); 
        }
    }//GEN-LAST:event_patronItemStateChanged
    private void lowerBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lowerBoxItemStateChanged
        updateTotalCost2();
        if (lowerBox.isSelected()) {
            qtyLowerBox.setVisible(true);
        } else {
            qtyLowerBox.setVisible(false);
            qtyLowerBox.setValue(0); 
        }
    }//GEN-LAST:event_lowerBoxItemStateChanged
    private void upperBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_upperBoxItemStateChanged
        updateTotalCost2();
        if (upperBox.isSelected()) {
            qtyUpperBox.setVisible(true);
        } else {
            qtyUpperBox.setVisible(false);
            qtyUpperBox.setValue(0); 
        }
    }//GEN-LAST:event_upperBoxItemStateChanged
    private void generalAdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_generalAdItemStateChanged
        updateTotalCost2();
        if (generalAd.isSelected()) {
            qtyGeneralAd.setVisible(true);
        } else {
            qtyGeneralAd.setVisible(false);
            qtyGeneralAd.setValue(0); 
        }
    }//GEN-LAST:event_generalAdItemStateChanged
    private void qtyVvipStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyVvipStateChanged
       updateTotalCost2();
    }//GEN-LAST:event_qtyVvipStateChanged
    private void qtyVipStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyVipStateChanged
        updateTotalCost2();
    }//GEN-LAST:event_qtyVipStateChanged
    private void qtyPatronStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyPatronStateChanged
        updateTotalCost2();
    }//GEN-LAST:event_qtyPatronStateChanged
    private void qtyLowerBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyLowerBoxStateChanged
        updateTotalCost2();
    }//GEN-LAST:event_qtyLowerBoxStateChanged
    private void qtyUpperBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyUpperBoxStateChanged
        updateTotalCost2();
    }//GEN-LAST:event_qtyUpperBoxStateChanged
    private void qtyGeneralAdStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyGeneralAdStateChanged
        updateTotalCost2();
    }//GEN-LAST:event_qtyGeneralAdStateChanged
    private void platinumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_platinumItemStateChanged
        updateTotalCost3();
        if (platinum.isSelected()) {
            qtyPlatinum.setVisible(true);
        } else {
            qtyPlatinum.setVisible(false);
            qtyPlatinum.setValue(0); 
        }
    }//GEN-LAST:event_platinumItemStateChanged
    private void svipItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_svipItemStateChanged
        updateTotalCost3();
        if (svip.isSelected()) {
            qtySvip.setVisible(true);
        } else {
            qtySvip.setVisible(false);
            qtySvip.setValue(0); 
        }
    }//GEN-LAST:event_svipItemStateChanged
    private void vip1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_vip1ItemStateChanged
        updateTotalCost3();
        if (vip1.isSelected()) {
            qtyVip1.setVisible(true);
        } else {
            qtyVip1.setVisible(false);
            qtyVip1.setValue(0); 
        }
    }//GEN-LAST:event_vip1ItemStateChanged
    private void patron1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_patron1ItemStateChanged
        updateTotalCost3();
        if (patron1.isSelected()) {
            qtyPatron1.setVisible(true);
        } else {
            qtyPatron1.setVisible(false);
            qtyPatron1.setValue(0); 
        }
    }//GEN-LAST:event_patron1ItemStateChanged
    private void lowerBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lowerBox1ItemStateChanged
        updateTotalCost3();
        if (lowerBox1.isSelected()) {
            qtyLowerBox1.setVisible(true);
        } else {
            qtyLowerBox1.setVisible(false);
            qtyLowerBox1.setValue(0); 
        }
    }//GEN-LAST:event_lowerBox1ItemStateChanged
    private void upperBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_upperBox1ItemStateChanged
        updateTotalCost3();
        if (upperBox1.isSelected()) {
            qtyUpperBox1.setVisible(true);
        } else {
            qtyUpperBox1.setVisible(false);
            qtyUpperBox1.setValue(0); 
        }
    }//GEN-LAST:event_upperBox1ItemStateChanged
    private void generalAd1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_generalAd1ItemStateChanged
        updateTotalCost3();
        if (generalAd1.isSelected()) {
            qtyGeneralAd1.setVisible(true);
        } else {
            qtyGeneralAd1.setVisible(false);
            qtyGeneralAd1.setValue(0); 
        }
    }//GEN-LAST:event_generalAd1ItemStateChanged
    private void qtyPlatinumStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyPlatinumStateChanged
        updateTotalCost3();
    }//GEN-LAST:event_qtyPlatinumStateChanged
    private void qtySvipStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtySvipStateChanged
        updateTotalCost3();
    }//GEN-LAST:event_qtySvipStateChanged
    private void qtyVip1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyVip1StateChanged
        updateTotalCost3();
    }//GEN-LAST:event_qtyVip1StateChanged
    private void qtyPatron1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyPatron1StateChanged
        updateTotalCost3();
    }//GEN-LAST:event_qtyPatron1StateChanged
    private void qtyLowerBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyLowerBox1StateChanged
        updateTotalCost3();
    }//GEN-LAST:event_qtyLowerBox1StateChanged
    private void qtyUpperBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyUpperBox1StateChanged
        updateTotalCost3();
    }//GEN-LAST:event_qtyUpperBox1StateChanged
    private void qtyGeneralAd1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyGeneralAd1StateChanged
        updateTotalCost3();
    }//GEN-LAST:event_qtyGeneralAd1StateChanged
    private void editSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSaveButtonActionPerformed
            if (!isEditing) {
            setFieldsEditable(true);
            editSaveButton.setText("Save");
            isEditing = true;
            
            lblName.setForeground(iThinkBeige);
            lblEmail.setForeground(iThinkBeige);
            lblAge.setForeground(iThinkBeige);
            lblBirthdate.setForeground(iThinkBeige);
            lblGender.setForeground(iThinkBeige);
            lblPassword.setForeground(iThinkBeige);
            
            } else {
                String name = lblName.getText().trim();
                String email = lblEmail.getText().trim();
                String ageText = lblAge.getText().trim();
                String birthdate = lblBirthdate.getText().trim();
                String gender = lblGender.getText().trim();
                String password = new String(lblPassword.getPassword()).trim();

                //Check if Fields are Empty
                if (name.isEmpty() || email.isEmpty()
                        || ageText.isEmpty() || birthdate.isEmpty() || gender.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please fill in all fields.");
                    return;
                }
                // Check if the email looks valid
                String emailPattern = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
                if (!Pattern.matches(emailPattern, email)) {
                JOptionPane.showMessageDialog(this,
                    "Please enter a valid email address (e.g., someone@domain.com)",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
                }
                // Check if Gender is Valid
                String genderPattern = "^(male|Male|MALE|female|Female|FEMALE)$";
                if(!Pattern.matches(genderPattern, gender)) {
                JOptionPane.showMessageDialog(this,
                        "Please Enter only Male or Female.",
                        "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
                }
                
                // Check if Password is Valid
                if (password.length() < 8) {
                    JOptionPane.showMessageDialog(this, 
                            "Password must be 8 characters and above.", "Input Error", 
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
        
            int age;
            try {
                age = Integer.parseInt(ageText);
                if (age < 0) throw new NumberFormatException();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid age.");
                return;
            }

            UserService userService = new UserService();
            boolean success = userService.updateUserProfile(userId, name, email, age, birthdate, gender, password);

            if (success) {
                JOptionPane.showMessageDialog(this, "Profile updated.");
                setFieldsEditable(false);
                editSaveButton.setText("Edit Profile");
                isEditing = false;
                
                lblName.setForeground(new Color(255,240,220));
                lblEmail.setForeground(new Color(255,240,220));
                lblAge.setForeground(new Color(255,240,220));
                lblBirthdate.setForeground(new Color(255,240,220));
                lblGender.setForeground(new Color(255,240,220));
                lblPassword.setForeground(new Color(255,240,220));
            } else {
                JOptionPane.showMessageDialog(this, "Update failed.");
            }
        }
    }//GEN-LAST:event_editSaveButtonActionPerformed
    private void showPasswordCheckBoxProfilePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordCheckBoxProfilePageActionPerformed
        if (showPasswordCheckBoxProfilePage.isSelected()) {
            lblPassword.setEchoChar((char) 0);
        } else {
            lblPassword.setEchoChar('•');
        }
    }//GEN-LAST:event_showPasswordCheckBoxProfilePageActionPerformed
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "cardHomePanel");
    }//GEN-LAST:event_jButton25ActionPerformed
    private void beabadoobeeBuyTicket1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beabadoobeeBuyTicket1ActionPerformed
        loadAvailableTickets("Kenny G Live Tour 2025");
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "cardKennyGBuy");
    }//GEN-LAST:event_beabadoobeeBuyTicket1ActionPerformed
    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        JScrollBar verticalBar = kennygPanel.getVerticalScrollBar();
        verticalBar.setValue(verticalBar.getMaximum());
    }//GEN-LAST:event_jButton26ActionPerformed
    private void purchaseButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButton3ActionPerformed
        String concertName = "Kenny G Live Tour 2025";
        boolean atLeastOneBooked = false; // track if anything was selected
        double grandTotal = 0;

        TicketService ts = new TicketService();
        
        // Validate Credentials
        String fullName = jTextField13.getText().trim();
        String contactNum = jTextField16.getText().trim();
        
        String namePattern = "^[A-Z][a-z]+(?: [A-Z][a-z]+)*, [A-Z][a-z]+(?: [A-Z][a-z]+)* [A-Z]$";
        String contactPattern = "^\\+639\\d{9}$";

        if (!fullName.matches(namePattern)) {
            JOptionPane.showMessageDialog(this, "Wrong name format.\nUse: Last, Firstname M", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!contactNum.matches(contactPattern)) {
            JOptionPane.showMessageDialog(this, "Invalid contact number format.\nUse: +639XXXXXXXXX", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (gold.isSelected()) {
            int qty = (int) qtyGold.getValue();
            if (qty > 0) {
                double price = 12800;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }
      
        if (silver.isSelected()) {
            int qty = (int) qtySilver.getValue();
            if (qty > 0) {
                double price = 9000;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        if (bronze.isSelected()) {
            int qty = (int) qtyBronze.getValue();
            if (qty > 0) {
                double price = 5870;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        // Handle success/failure messages
        if (atLeastOneBooked) {
            totalCostLabel3.setText(String.format("Total: PHP %.2f", grandTotal));
            PurchasePopupMenu popup = new PurchasePopupMenu(this, true);
            popup.setLocationRelativeTo(null);
            popup.setVisible(true);
            
            //Set to Default
            gold.setSelected(false);
            silver.setSelected(false);
            bronze.setSelected(false);
            
            qtyGold.setValue(0);
            qtySilver.setValue(0);
            qtyBronze.setValue(0);
            
            jTextField13.setText("Full Name (Last, First M.I.)*");
            jTextField16.setText("Contact Number (+63)*");
            dates3.setSelectedIndex(0);
            jComboBox4.setSelectedIndex(0);
            purchaseButton3.setEnabled(false);
            
            loadBookingHistory();
            loadAvailableTickets("Kenny G Live Tour 2025");
        } else {
            JOptionPane.showMessageDialog(this, "❌ No valid ticket selected. Make sure quantity is at least 1.");
        }

    }//GEN-LAST:event_purchaseButton3ActionPerformed
    private void jTextField13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusGained
        jTextField13.selectAll();
        
    }//GEN-LAST:event_jTextField13FocusGained
    private void jTextField16FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField16FocusGained
        jTextField16.selectAll();
        
    }//GEN-LAST:event_jTextField16FocusGained
    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        purchaseButton3.setEnabled(true);
    }//GEN-LAST:event_jComboBox4ActionPerformed
    private void goldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_goldItemStateChanged
        updateTotalCost4();
        if (gold.isSelected()) {
            qtyGold.setVisible(true);
        } else {
            qtyGold.setVisible(false);
            qtyGold.setValue(0); 
        }
    }//GEN-LAST:event_goldItemStateChanged
    private void silverItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_silverItemStateChanged
        updateTotalCost4();
        if (silver.isSelected()) {
            qtySilver.setVisible(true);
        } else {
            qtySilver.setVisible(false);
            qtySilver.setValue(0); 
        }
    }//GEN-LAST:event_silverItemStateChanged
    private void bronzeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bronzeItemStateChanged
        updateTotalCost4();
        if (bronze.isSelected()) {
            qtyBronze.setVisible(true);
        } else {
            qtyBronze.setVisible(false);
            qtyBronze.setValue(0); 
        }
    }//GEN-LAST:event_bronzeItemStateChanged
    private void qtySilverStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtySilverStateChanged
        updateTotalCost4();
    }//GEN-LAST:event_qtySilverStateChanged
    private void qtyGoldStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyGoldStateChanged
        updateTotalCost4();
    }//GEN-LAST:event_qtyGoldStateChanged
    private void qtyBronzeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyBronzeStateChanged
        updateTotalCost4();
    }//GEN-LAST:event_qtyBronzeStateChanged
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "cardKennyG");
        setToDefualt();
    }//GEN-LAST:event_jButton27ActionPerformed
    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "cardHomePanel");
    }//GEN-LAST:event_jButton28ActionPerformed
    private void beabadoobeeBuyTicket2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beabadoobeeBuyTicket2ActionPerformed
        loadAvailableTickets("Hyeri Fan Meeting Tour 2025");
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "cardHyeriBuy");
    }//GEN-LAST:event_beabadoobeeBuyTicket2ActionPerformed
    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        JScrollBar verticalBar = hyeriPanel.getVerticalScrollBar();
        verticalBar.setValue(verticalBar.getMaximum());
    }//GEN-LAST:event_jButton29ActionPerformed
    private void purchaseButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButton4ActionPerformed
        String concertName = "Hyeri Fan Meeting Tour 2025";
        boolean atLeastOneBooked = false; // track if anything was selected
        double grandTotal = 0;

        TicketService ts = new TicketService();
        
        // Validate Credentials
        String fullName = jTextField18.getText().trim();
        String contactNum = jTextField19.getText().trim();
        
        String namePattern = "^[A-Z][a-z]+(?: [A-Z][a-z]+)*, [A-Z][a-z]+(?: [A-Z][a-z]+)* [A-Z]$";
        String contactPattern = "^\\+639\\d{9}$";
        
        if (!fullName.matches(namePattern)) {
            JOptionPane.showMessageDialog(this, "Wrong name format.\nUse: Last, Firstname M", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!contactNum.matches(contactPattern)) {
            JOptionPane.showMessageDialog(this, "Invalid contact number format.\nUse: +639XXXXXXXXX", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (vip3.isSelected()) {
            int qty = (int) qtyVip3.getValue();
            if (qty > 0) {
                double price = 10900;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }
      
        if (cat1.isSelected()) {
            int qty = (int) qtyCat1.getValue();
            if (qty > 0) {
                double price = 7800;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        if (cat2.isSelected()) {
            int qty = (int) qtyCat2.getValue();
            if (qty > 0) {
                double price = 5800;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }
        
        if (cat3.isSelected()) {
            int qty = (int) qtyCat3.getValue();
            if (qty > 0) {
                double price = 3900;
                double total = price * qty + 150;
                boolean success = ts.bookTicket(userId, concertName, price, qty, total);
                atLeastOneBooked |= success;
                grandTotal += total;
            }
        }

        // Handle success/failure messages
        if (atLeastOneBooked) {
            totalCostLabel4.setText(String.format("Total: PHP %.2f", grandTotal));
            PurchasePopupMenu popup = new PurchasePopupMenu(this, true);
            popup.setLocationRelativeTo(null);
            popup.setVisible(true);
            
            //Set to Default
            vip3.setSelected(false);
            cat1.setSelected(false);
            cat2.setSelected(false);
            cat3.setSelected(false);
            
            qtyVip3.setValue(0);
            qtyCat1.setValue(0);
            qtyCat2.setValue(0);
            qtyCat3.setValue(0);
            
            jTextField18.setText("Full Name (Last, First M.I.)*");
            jTextField19.setText("Contact Number (+63)*");
            dates4.setSelectedIndex(0);
            jComboBox5.setSelectedIndex(0);
            purchaseButton4.setEnabled(false);
            
            loadBookingHistory();
            loadAvailableTickets("Hyeri Fan Meeting Tour 2025");
        } else {
            JOptionPane.showMessageDialog(this, "❌ No valid ticket selected. Make sure quantity is at least 1.");
        }

    }//GEN-LAST:event_purchaseButton4ActionPerformed
    private void jTextField18FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField18FocusGained
        jTextField18.selectAll();
       
    }//GEN-LAST:event_jTextField18FocusGained
    private void jTextField19FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField19FocusGained
        jTextField19.selectAll();
     
    }//GEN-LAST:event_jTextField19FocusGained
    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        purchaseButton4.setEnabled(true);
    }//GEN-LAST:event_jComboBox5ActionPerformed
    private void vip3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_vip3ItemStateChanged
        updateTotalCost5();
        if (vip3.isSelected()) {
            qtyVip3.setVisible(true);
        } else {
            qtyVip3.setVisible(false);
            qtyVip3.setValue(0); 
        }
    }//GEN-LAST:event_vip3ItemStateChanged
    private void cat1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cat1ItemStateChanged
        updateTotalCost5();
        if (cat1.isSelected()) {
            qtyCat1.setVisible(true);
        } else {
            qtyCat1.setVisible(false);
            qtyCat1.setValue(0); 
        }
    }//GEN-LAST:event_cat1ItemStateChanged
    private void cat2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cat2ItemStateChanged
        updateTotalCost5();
        if (cat2.isSelected()) {
            qtyCat2.setVisible(true);
        } else {
            qtyCat2.setVisible(false);
            qtyCat2.setValue(0); 
        }
    }//GEN-LAST:event_cat2ItemStateChanged
    private void qtyCat1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyCat1StateChanged
        updateTotalCost5();
    }//GEN-LAST:event_qtyCat1StateChanged
    private void qtyVip3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyVip3StateChanged
        updateTotalCost5();
    }//GEN-LAST:event_qtyVip3StateChanged
    private void qtyCat2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyCat2StateChanged
        updateTotalCost5();
    }//GEN-LAST:event_qtyCat2StateChanged
    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "cardHyeri");
        setToDefualt();
    }//GEN-LAST:event_jButton30ActionPerformed
    private void cat3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cat3ItemStateChanged
        if (cat3.isSelected()) {
            qtyCat3.setVisible(true);
        } else {
            qtyCat3.setVisible(false);
            qtyCat3.setValue(0); 
        }
    }//GEN-LAST:event_cat3ItemStateChanged
    private void qtyCat3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyCat3StateChanged
        updateTotalCost5();
    }//GEN-LAST:event_qtyCat3StateChanged
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", 
        "Logout Confirmation", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            // Open Login Frame
            new LoginPage().setVisible(true);
            // Close Main Frame
            this.dispose();  // or this.setVisible(false);
        }
    }//GEN-LAST:event_logoutButtonActionPerformed
    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (jCheckBox1.isSelected()) {
            submitButton.setEnabled(true);
        } else {
            submitButton.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        CardLayout c1 = (CardLayout)(mainPanel.getLayout());
        c1.show(mainPanel, "cardHomePanel");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void beabadoobeeBuyTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beabadoobeeBuyTicketActionPerformed
        loadAvailableTickets("beabadoobee");
        CardLayout c1 = (CardLayout)(mainPanel.getLayout());
        c1.show(mainPanel, "cardBeaBuy");
    }//GEN-LAST:event_beabadoobeeBuyTicketActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        JScrollBar verticalBar = beabadoobeePanel.getVerticalScrollBar();
        verticalBar.setValue(verticalBar.getMaximum());
    }//GEN-LAST:event_jButton15ActionPerformed

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        if (num >= 1){
            num--;
            concertButton1.setIcon(icons[num]);
            concertButton2.setIcon(icons[num + 1]);
            concertButton3.setIcon(icons[num + 2]);
            captionLabel1.setText(captionLabel[num]);
            captionLabel2.setText(captionLabel[num + 1]);
            captionLabel3.setText(captionLabel[num + 2]);
            dateLabel1.setText(dateLabel[num]);
            dateLabel2.setText(dateLabel[num + 1]);
            dateLabel3.setText(dateLabel[num + 2]);
        } else {
        }
    }//GEN-LAST:event_btnLeftActionPerformed

    private void concertButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concertButton1ActionPerformed
        if(num == 0){
            CardLayout cl = (CardLayout)(mainPanel.getLayout());
            cl.show(mainPanel, "cardBea");
            SwingUtilities.invokeLater(() -> {
                beabadoobeePanel.getVerticalScrollBar().setValue(0);
            });
        } else if (num == 1){
            CardLayout cl = (CardLayout)(mainPanel.getLayout());
            cl.show(mainPanel, "cardPSJ");
        } else if (num == 2){
            CardLayout cl = (CardLayout)(mainPanel.getLayout());
            cl.show(mainPanel, "cardRV");
        }
    }//GEN-LAST:event_concertButton1ActionPerformed

    private void concertButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concertButton2ActionPerformed
        if(num == 0){
            CardLayout cl = (CardLayout)(mainPanel.getLayout());
            cl.show(mainPanel, "cardPSJ");
        } else if (num == 1){
            CardLayout cl = (CardLayout)(mainPanel.getLayout());
            cl.show(mainPanel, "cardRV");
        } else if (num == 2){
            CardLayout cl = (CardLayout)(mainPanel.getLayout());
            cl.show(mainPanel, "cardKennyG");
        }
    }//GEN-LAST:event_concertButton2ActionPerformed

    private void concertButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concertButton3ActionPerformed
        if(num == 0){
            CardLayout cl = (CardLayout)(mainPanel.getLayout());
            cl.show(mainPanel, "cardRV");
        } else if (num == 1){
            CardLayout cl = (CardLayout)(mainPanel.getLayout());
            cl.show(mainPanel, "cardKennyG");
        } else if (num == 2){
            CardLayout cl = (CardLayout)(mainPanel.getLayout());
            cl.show(mainPanel, "cardHyeri");
        }
    }//GEN-LAST:event_concertButton3ActionPerformed

    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        if (num <= 1){
            num++;
            concertButton1.setIcon(icons[num]);
            concertButton2.setIcon(icons[num + 1]);
            concertButton3.setIcon(icons[num + 2]);
            captionLabel1.setText(captionLabel[num]);
            captionLabel2.setText(captionLabel[num + 1]);
            captionLabel3.setText(captionLabel[num + 2]);
            dateLabel1.setText(dateLabel[num]);
            dateLabel2.setText(dateLabel[num + 1]);
            dateLabel3.setText(dateLabel[num + 2]);
        } else {
        }
    }//GEN-LAST:event_btnRightActionPerformed

   
   public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
        SplashScreen splash = new SplashScreen();
        splash.setVisible(true);

        // Thread for splash timeout
        new Thread(() -> {
            try {
                Thread.sleep(10000); // 10-second splash screen
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            java.awt.EventQueue.invokeLater(() -> {
                splash.dispose(); // Close splash screen

                // Show login page
                LoginPage loginPage = new LoginPage();
                loginPage.setVisible(true);
            });
        }).start();
    });
}   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel aboutUs;
    private javax.swing.JCheckBox balcony1;
    private javax.swing.JCheckBox balcony2;
    public keeptoo.KGradientPanel beabadoobeeBuy;
    private javax.swing.JButton beabadoobeeBuyTicket;
    private javax.swing.JButton beabadoobeeBuyTicket1;
    private javax.swing.JButton beabadoobeeBuyTicket2;
    public javax.swing.JScrollPane beabadoobeePanel;
    private keeptoo.KGradientPanel bookingHistoryPanel;
    private javax.swing.JCheckBox bronze;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnRight;
    private javax.swing.JLabel captionLabel1;
    private javax.swing.JLabel captionLabel2;
    private javax.swing.JLabel captionLabel3;
    private javax.swing.JCheckBox cat1;
    private javax.swing.JCheckBox cat2;
    private javax.swing.JCheckBox cat3;
    private javax.swing.JButton concertButton1;
    private javax.swing.JButton concertButton2;
    private javax.swing.JButton concertButton3;
    private javax.swing.JLabel dateLabel1;
    private javax.swing.JLabel dateLabel2;
    private javax.swing.JLabel dateLabel3;
    private javax.swing.JComboBox<String> dates;
    private javax.swing.JComboBox<String> dates1;
    private javax.swing.JComboBox<String> dates2;
    private javax.swing.JComboBox<String> dates3;
    private javax.swing.JComboBox<String> dates4;
    private javax.swing.JButton editSaveButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JCheckBox floorA;
    private javax.swing.JCheckBox floorB;
    private javax.swing.JTextField fullNameTextField;
    private javax.swing.JCheckBox generalAd;
    private javax.swing.JCheckBox generalAd1;
    private keeptoo.KGradientPanel generalInquiry;
    private javax.swing.JCheckBox gold;
    private keeptoo.KGradientPanel homePanel;
    private javax.swing.JScrollPane hyeriPanel;
    private keeptoo.KGradientPanel hyeriPanelBuy;
    private keeptoo.KGradientPanel infoCustomer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel10;
    private keeptoo.KGradientPanel kGradientPanel11;
    private keeptoo.KGradientPanel kGradientPanel12;
    private keeptoo.KGradientPanel kGradientPanel13;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private keeptoo.KGradientPanel kGradientPanel9;
    private keeptoo.KGradientPanel kennygBuy;
    private javax.swing.JScrollPane kennygPanel;
    private javax.swing.JTextField lblAge;
    private javax.swing.JLabel lblBalcony1;
    private javax.swing.JLabel lblBalcony2;
    private javax.swing.JTextField lblBirthdate;
    private javax.swing.JLabel lblBronze;
    private javax.swing.JLabel lblCat1;
    private javax.swing.JLabel lblCat2;
    private javax.swing.JLabel lblCat3;
    private javax.swing.JTextField lblEmail;
    private javax.swing.JLabel lblFloorA;
    private javax.swing.JLabel lblFloorB;
    private javax.swing.JLabel lblGenAd;
    private javax.swing.JLabel lblGenAd1;
    private javax.swing.JTextField lblGender;
    private javax.swing.JLabel lblGold;
    private javax.swing.JLabel lblLoge;
    private javax.swing.JTextField lblName;
    private javax.swing.JPasswordField lblPassword;
    private javax.swing.JLabel lblPatron;
    private javax.swing.JLabel lblPatron1;
    private javax.swing.JLabel lblPlatinum;
    private javax.swing.JLabel lblSVIP;
    private javax.swing.JLabel lblSilver;
    private javax.swing.JLabel lblVIP;
    private javax.swing.JLabel lblVIP1;
    private javax.swing.JLabel lblVIP3;
    private javax.swing.JLabel lblVVIP;
    private javax.swing.JLabel lbllowerBox;
    private javax.swing.JLabel lbllowerBox1;
    private javax.swing.JLabel lblupperBox;
    private javax.swing.JLabel lblupperBox1;
    private javax.swing.JCheckBox loge;
    private javax.swing.JButton logoutButton;
    private javax.swing.JCheckBox lowerBox;
    private javax.swing.JCheckBox lowerBox1;
    private keeptoo.KGradientPanel mainPanel;
    private keeptoo.KGradientPanel parkSeoJunBuy;
    public javax.swing.JScrollPane parkSeoJunPanel;
    private javax.swing.JCheckBox patron;
    private javax.swing.JCheckBox patron1;
    private javax.swing.JCheckBox platinum;
    private keeptoo.KGradientPanel profilePanel;
    private javax.swing.JButton psjBuyTicket;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JButton purchaseButton1;
    private javax.swing.JButton purchaseButton2;
    private javax.swing.JButton purchaseButton3;
    private javax.swing.JButton purchaseButton4;
    private javax.swing.JSpinner qtyBalcony1;
    private javax.swing.JSpinner qtyBalcony2;
    private javax.swing.JSpinner qtyBronze;
    private javax.swing.JSpinner qtyCat1;
    private javax.swing.JSpinner qtyCat2;
    private javax.swing.JSpinner qtyCat3;
    private javax.swing.JSpinner qtyFloorA;
    private javax.swing.JSpinner qtyFloorB;
    private javax.swing.JSpinner qtyGeneralAd;
    private javax.swing.JSpinner qtyGeneralAd1;
    private javax.swing.JSpinner qtyGold;
    private javax.swing.JSpinner qtyLoge;
    private javax.swing.JSpinner qtyLowerBox;
    private javax.swing.JSpinner qtyLowerBox1;
    private javax.swing.JSpinner qtyPatron;
    private javax.swing.JSpinner qtyPatron1;
    private javax.swing.JSpinner qtyPlatinum;
    private javax.swing.JSpinner qtySilver;
    private javax.swing.JSpinner qtySvip;
    private javax.swing.JSpinner qtyUpperBox;
    private javax.swing.JSpinner qtyUpperBox1;
    private javax.swing.JSpinner qtyVip;
    private javax.swing.JSpinner qtyVip1;
    private javax.swing.JSpinner qtyVip3;
    private javax.swing.JSpinner qtyVvip;
    private keeptoo.KGradientPanel regineAndViceBuy;
    private javax.swing.JButton regineAndViceBuyTicket;
    private javax.swing.JScrollPane regineAndVicePanel;
    private javax.swing.JCheckBox showPasswordCheckBoxProfilePage;
    private keeptoo.KGradientPanel sideMainPanel;
    private javax.swing.JCheckBox silver;
    private javax.swing.JButton submitButton;
    private javax.swing.JCheckBox svip;
    private javax.swing.JTable tblBookingHistory;
    private javax.swing.ButtonGroup ticketGroup;
    private javax.swing.ButtonGroup ticketGroup2;
    private javax.swing.ButtonGroup ticketGroup3;
    private javax.swing.JLabel totalCostLabel;
    private javax.swing.JLabel totalCostLabel1;
    private javax.swing.JLabel totalCostLabel2;
    private javax.swing.JLabel totalCostLabel3;
    private javax.swing.JLabel totalCostLabel4;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMI;
    private javax.swing.JTextArea txtMessage;
    private javax.swing.JTextField txtSubjectEvent;
    private javax.swing.JCheckBox upperBox;
    private javax.swing.JCheckBox upperBox1;
    private javax.swing.JCheckBox vip;
    private javax.swing.JCheckBox vip1;
    private javax.swing.JCheckBox vip3;
    private javax.swing.JCheckBox vvip;
    // End of variables declaration//GEN-END:variables

    private String getText(JTextField jTextField5) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
