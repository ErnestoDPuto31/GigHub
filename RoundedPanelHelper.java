package githubmainapp;

import javax.swing.*;
import java.awt.*;

public class RoundedPanelHelper {
    
    // Method to apply rounded corners to any JPanel
    public static void makeRounded(JPanel panel, int radius) {
        panel.setOpaque(false);
        panel.setBorder(BorderFactory.createEmptyBorder()); // Optional, remove default borders

        panel.setUI(new javax.swing.plaf.PanelUI() {
            @Override
            public void update(Graphics g, JComponent c) {
                paint(g, c);
            }

            @Override
            public void paint(Graphics g, JComponent c) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                g2.setColor(c.getBackground());
                g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), radius, radius);

                g2.dispose();
            }
        });
    }
}

