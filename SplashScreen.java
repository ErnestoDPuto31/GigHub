package githubmainapp;


import javax.swing.ImageIcon;


public class SplashScreen extends javax.swing.JFrame {
    public SplashScreen() {
        // ✅ These must come before setVisible
        setUndecorated(true);
        setAlwaysOnTop(true);
        
        initComponents();
        
        setTitle("GigHub");
        ImageIcon appIcon = new ImageIcon(getClass().getResource("/githubmainapp/Images/GigHub IconLogo.png"));
        this.setIconImage(appIcon.getImage());
        
        setLocationRelativeTo(null);
        setVisible(true); // ✅ Safe to call now

        loading(); // ✅ Start progress bar and open LoginPage after
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(0, 0, 550, 550));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(31, 52, 96));

        jLabel1.setForeground(new java.awt.Color(27, 27, 27));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/githubmainapp/Images/SPLASH2.gif"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loading() {
        new Thread(() -> {
            try {
                for (int i = 0; i <= 100; i++) {
                    
                    Thread.sleep(50); // ~5 seconds total
                }

                // After loading, open LoginPage and close splash
                java.awt.EventQueue.invokeLater(() -> {
                    new LoginPage().setVisible(true);
                    dispose();
                });

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new SplashScreen().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
    
}
