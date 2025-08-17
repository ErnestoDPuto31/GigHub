package githubmainapp;

import javax.swing.*;
import java.awt.*;

public class RoundedLabelHelper {

    // Method to apply rounded corners to any JLabel
    public static void makeRounded(JLabel label, int radius) {
        label.setOpaque(false);

        label.setUI(new javax.swing.plaf.basic.BasicLabelUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                g2.setColor(c.getBackground());
                g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), radius, radius);

                super.paint(g, c);
                g2.dispose();
            }
        });
    }
}
