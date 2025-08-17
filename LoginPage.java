package githubmainapp;

import java.awt.CardLayout;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.*;

public class LoginPage extends javax.swing.JFrame {
    public LoginPage() {
        initComponents();
        setTitle("GigHub");
        ImageIcon appIcon = new ImageIcon(getClass().getResource("/githubmainapp/Images/GigHub IconLogo.png"));
        this.setIconImage(appIcon.getImage());
        pack();
        setLocationRelativeTo(null);
        
        getRootPane().setDefaultButton(btnLogin);
        txtEmailLogin.addActionListener(e -> txtPasswordLogin.requestFocusInWindow());   
        SwingUtilities.invokeLater(() -> 
            {txtEmailLogin.requestFocusInWindow();
         });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        theMainPanel = new keeptoo.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        mainPanel = new keeptoo.KGradientPanel();
        loginPanel = new keeptoo.KGradientPanel();
        txtEmailLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtPasswordLogin = new javax.swing.JPasswordField();
        showPasswordCheckBox = new javax.swing.JCheckBox();
        registerPanel = new keeptoo.KGradientPanel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtGender = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtAge = new javax.swing.JSpinner();
        txtBirthdate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        theMainPanel.setkEndColor(new java.awt.Color(31, 52, 96));
        theMainPanel.setkGradientFocus(0);
        theMainPanel.setkStartColor(new java.awt.Color(20, 22, 26));
        theMainPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        theMainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 240, 220));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setkEndColor(new java.awt.Color(31, 52, 96));
        mainPanel.setkGradientFocus(0);
        mainPanel.setkStartColor(new java.awt.Color(20, 22, 26));
        mainPanel.setLayout(new java.awt.CardLayout());

        loginPanel.setBorder(new javax.swing.border.MatteBorder(null));
        loginPanel.setkEndColor(new java.awt.Color(31, 52, 96));
        loginPanel.setkGradientFocus(0);
        loginPanel.setkStartColor(new java.awt.Color(20, 22, 26));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmailLogin.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtEmailLogin.setToolTipText("");
        txtEmailLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        txtEmailLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmailLogin.setOpaque(true);
        txtEmailLogin.setPreferredSize(new java.awt.Dimension(260, 45));
        txtEmailLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailLoginActionPerformed(evt);
            }
        });
        loginPanel.add(txtEmailLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 240, 220));
        jLabel2.setText("LOGIN");
        loginPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 240, 220));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-lock-24.png"))); // NOI18N
        loginPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 240, 220));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/icons8-email-24.png"))); // NOI18N
        jLabel5.setText("  Email Address");
        loginPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        btnLogin.setBackground(new java.awt.Color(32, 44, 76));
        btnLogin.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 240, 220));
        btnLogin.setText("LOGIN");
        btnLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 240, 220), 3, true));
        btnLogin.setFocusable(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });
        loginPanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 260, 75));

        jLabel1.setBackground(new java.awt.Color(255, 240, 220));
        jLabel1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 240, 220));
        jLabel1.setText("Dont Have an Account?");
        loginPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        jButton2.setBackground(new java.awt.Color(32, 44, 76));
        jButton2.setForeground(new java.awt.Color(244, 207, 145));
        jButton2.setText("Register");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        loginPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 240, 220));
        jLabel7.setText("Password");
        loginPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        txtPasswordLogin.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        loginPanel.add(txtPasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 260, 45));

        showPasswordCheckBox.setContentAreaFilled(false);
        showPasswordCheckBox.setOpaque(false);
        showPasswordCheckBox.setBorderPainted(false);
        showPasswordCheckBox.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        showPasswordCheckBox.setForeground(new java.awt.Color(255, 240, 220));
        showPasswordCheckBox.setText(" Show Password");
        showPasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCheckBoxActionPerformed(evt);
            }
        });
        loginPanel.add(showPasswordCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        mainPanel.add(loginPanel, "loginCard");

        registerPanel.setBorder(new javax.swing.border.MatteBorder(null));
        registerPanel.setkEndColor(new java.awt.Color(31, 52, 96));
        registerPanel.setkGradientFocus(0);
        registerPanel.setkStartColor(new java.awt.Color(20, 22, 26));

        txtEmail.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtEmail.setToolTipText("");
        txtEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.setOpaque(true);
        txtEmail.setPreferredSize(new java.awt.Dimension(260, 45));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 240, 220));
        jLabel6.setText("REGISTER");

        registerButton.setBackground(new java.awt.Color(32, 44, 76));
        registerButton.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 240, 220));
        registerButton.setText("REGISTER");
        registerButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 240, 220), 3, true));
        registerButton.setFocusable(false);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(32, 44, 76));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(244, 207, 145));
        jButton3.setText("Back To Login Page");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtName.setToolTipText("");
        txtName.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtName.setOpaque(true);
        txtName.setPreferredSize(new java.awt.Dimension(260, 45));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 240, 220));
        jLabel11.setText("  Gender/Sex");

        txtGender.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtGender.setMaximumRowCount(3);
        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender:", "Male", "Female" }));
        txtGender.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 240, 220));
        jLabel12.setText("  Username");

        jLabel13.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 240, 220));
        jLabel13.setText("  Age");

        txtAge.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtAge.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        txtAge.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        txtBirthdate.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtBirthdate.setText("YYYY-MM-DD");
        txtBirthdate.setToolTipText("");
        txtBirthdate.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        txtBirthdate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBirthdate.setOpaque(true);
        txtBirthdate.setPreferredSize(new java.awt.Dimension(260, 45));
        txtBirthdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthdateActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 240, 220));
        jLabel14.setText("  Birthdate");

        lblPassword.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 240, 220));
        lblPassword.setText("  Password");

        lblEmail.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 240, 220));
        lblEmail.setText(" Email Address");

        txtPassword.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        txtPassword.setMinimumSize(new java.awt.Dimension(64, 24));
        txtPassword.setPreferredSize(new java.awt.Dimension(64, 24));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                .addGap(38, 130, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(121, 121, 121))
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton3))
                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel12)
                        .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addComponent(txtGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(txtBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lblEmail)
                        .addComponent(lblPassword)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(4, 4, 4)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblPassword)
                .addGap(2, 2, 2)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        mainPanel.add(registerPanel, "registerCard");

        jPanel3.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 468));

        theMainPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 430, 480));

        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 240, 220));
        jButton1.setText("X");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        theMainPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(theMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(theMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailLoginActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtBirthdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthdateActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String email = txtEmailLogin.getText().trim();
        String password = new String(txtPasswordLogin.getPassword()).trim();

        int userId = UserService.loginUser(email, password);
        
        // Check if the email looks valid
	String emailPattern = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
	if (!Pattern.matches(emailPattern, email)) {
    	JOptionPane.showMessageDialog(this,
        	"Please enter a valid email address (e.g., someone@domain.com)",
        	"Input Error",
        	JOptionPane.ERROR_MESSAGE);
    	return;
	}
        
        // Check if Password is Valid
        if (password.length() < 8) {
            JOptionPane.showMessageDialog(this, 
                    "Password must be 8 characters and above.", "Input Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }


        if (userId != -1) {
            // ✅ Store email and userId in session
            UserSession.setUserSession(userId, email);
            JOptionPane.showMessageDialog(this, "Login successful. Welcome!");
    
            MainFrame main = new MainFrame(userId);
            main.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Login failed. Check your Credentials.");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
       String email = txtEmail.getText().trim();
        String password = new String(txtPassword.getPassword()).trim();
        String name = txtName.getText().trim();
        int age = (int) txtAge.getValue();
        String gender = txtGender.getSelectedItem().toString();
        String birthdateText = txtBirthdate.getText().trim();
        
        // Check if Password is Valid
        if (password.length() < 8) {
            JOptionPane.showMessageDialog(this, 
                    "Password must be 8 characters and above.", "Input Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
         // Check if the email looks valid
	String emailPattern = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";

	if (!Pattern.matches(emailPattern, email)) {
    	JOptionPane.showMessageDialog(this,
        	"Please enter a valid email address (e.g., someone@domain.com)",
        	"Input Error",
        	JOptionPane.ERROR_MESSAGE);
    	return;
	}
        
        // Convert to java.sql.Date
        java.sql.Date birthdate = null;
        try {
            birthdate = java.sql.Date.valueOf(birthdateText); // must be yyyy-MM-dd
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "❌ Invalid birthdate format. Use YYYY-MM-DD");
            return;
        }

        boolean registered = UserService.registerUser(email, password, name, age, gender, birthdate);

        if (registered) {
            JOptionPane.showMessageDialog(this, "✅ Registration successful!");
            CardLayout cl = (CardLayout)(mainPanel.getLayout());
            cl.show(mainPanel, "loginCard");
        } else {
            JOptionPane.showMessageDialog(this, "❌ Registration failed.");
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "registerCard");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "loginCard");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void showPasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordCheckBoxActionPerformed
        if (showPasswordCheckBox.isSelected()) {
            txtPasswordLogin.setEchoChar((char) 0);
        } else {
            txtPasswordLogin.setEchoChar('•');
        }
    }//GEN-LAST:event_showPasswordCheckBoxActionPerformed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private keeptoo.KGradientPanel loginPanel;
    private keeptoo.KGradientPanel mainPanel;
    private javax.swing.JButton registerButton;
    private keeptoo.KGradientPanel registerPanel;
    private javax.swing.JCheckBox showPasswordCheckBox;
    private keeptoo.KGradientPanel theMainPanel;
    private javax.swing.JSpinner txtAge;
    private javax.swing.JTextField txtBirthdate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailLogin;
    private javax.swing.JComboBox<String> txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordLogin;
    // End of variables declaration//GEN-END:variables
}
