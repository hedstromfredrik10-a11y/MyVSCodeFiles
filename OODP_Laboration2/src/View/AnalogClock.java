package View;

import javax.swing.*;

import controller.Controller;

import java.awt.*;
// import java.time.LocalTime;

public class AnalogClock extends JPanel {
    private Controller controller;

    public AnalogClock(Controller controller) {
        this.controller = controller;
        setPreferredSize(new Dimension(500, 500));
        setBackground(new Color(30, 30, 30)); // Mörk bakgrund
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();

        // Aktivera anti-aliasing för mjuka linjer
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int radius = Math.min(width, height) / 2 - 40;
        int centerX = width / 2;
        int centerY = height / 2;

        // Rita yttre ram
        g2.setColor(new Color(220, 220, 220));
        g2.setStroke(new BasicStroke(4));
        g2.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);

        // Rita timmarkeringar
        g2.setStroke(new BasicStroke(3));
        for (int i = 0; i < 12; i++) {
            double angle = Math.toRadians(i * 30 - 90);
            int x1 = (int) (centerX + Math.cos(angle) * (radius - 10));
            int y1 = (int) (centerY + Math.sin(angle) * (radius - 10));
            int x2 = (int) (centerX + Math.cos(angle) * (radius - 25));
            int y2 = (int) (centerY + Math.sin(angle) * (radius - 25));
            g2.drawLine(x1, y1, x2, y2);
        }

        // Rita minutmarkeringar
        g2.setStroke(new BasicStroke(1));
        g2.setColor(new Color(180, 180, 180));
        for (int i = 0; i < 60; i++) {
            double angle = Math.toRadians(i * 6 - 90);
            int x1 = (int) (centerX + Math.cos(angle) * (radius - 10));
            int y1 = (int) (centerY + Math.sin(angle) * (radius - 10));
            int x2 = (int) (centerX + Math.cos(angle) * (radius - 15));
            int y2 = (int) (centerY + Math.sin(angle) * (radius - 15));
            g2.drawLine(x1, y1, x2, y2);
        }

        // Hämta tid från controllern
        int hour = controller.getHour();
        int minute = controller.getMinute();
        int second = controller.getSecond();

        // Rita visare
        drawHand(g2, centerX, centerY, radius * 0.5,
                (hour % 12 + minute / 60.0) * 30, 6, new Color(240, 240, 240)); // timvisare

        drawHand(g2, centerX, centerY, radius * 0.7,
                (minute + second / 60.0) * 6, 4, new Color(200, 200, 200)); // minutvisare

        drawHand(g2, centerX, centerY, radius * 0.85,
                second * 6, 2, Color.RED); // sekundvisare

    }

    private void drawHand(Graphics2D g2, int x, int y, double length, double angleDeg, int thickness, Color color) {
        g2.setColor(color);
        g2.setStroke(new BasicStroke(thickness, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        double angleRad = Math.toRadians(angleDeg - 90);
        int x2 = (int) (x + length * Math.cos(angleRad));
        int y2 = (int) (y + length * Math.sin(angleRad));
        g2.drawLine(x, y, x2, y2);
    }
}
