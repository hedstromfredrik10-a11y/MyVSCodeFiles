import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class KochStepByStep extends JPanel {

    enum BaseShape {
        LINE, TRIANGLE
    }

    private int currentOrder = 0;
    private final int maxOrder = 7;
    private boolean running = false;
    private BaseShape baseShape = BaseShape.TRIANGLE;

    private final int signForLine = -1;
    private final int signForTriangle = +1;

    private final Timer timer;
    private final JButton startPauseBtn = new JButton("Start");
    private final JButton nextBtn = new JButton("Nästa steg");
    private final JButton resetBtn = new JButton("Reset");
    private final JSlider speedSlider = new JSlider(100, 2000, 800);
    private final JLabel infoLabel = new JLabel();

    private final JRadioButton lineBtn = new JRadioButton("Linje", false);
    private final JRadioButton triBtn = new JRadioButton("Triangel", true);

    public KochStepByStep() {
        setBackground(Color.WHITE);
        setLayout(new BorderLayout());

        JPanel canvas = new DrawingCanvas();
        canvas.setBackground(Color.WHITE);
        add(canvas, BorderLayout.CENTER);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.LEFT));

        ButtonGroup group = new ButtonGroup();
        group.add(lineBtn);
        group.add(triBtn);

        controls.add(new JLabel("Utgå från:"));
        controls.add(lineBtn);
        controls.add(triBtn);

        controls.add(startPauseBtn);
        controls.add(nextBtn);
        controls.add(resetBtn);

        controls.add(new JLabel("Hastighet (ms/step):"));
        speedSlider.setMajorTickSpacing(500);
        speedSlider.setPaintTicks(true);
        controls.add(speedSlider);

        controls.add(infoLabel);
        add(controls, BorderLayout.SOUTH);

        updateInfoLabel();

        timer = new Timer(speedSlider.getValue(), e -> stepForward());

        startPauseBtn.addActionListener(e -> toggleRunning());
        nextBtn.addActionListener(e -> {
            if (running)
                toggleRunning();
            stepForward();
        });
        resetBtn.addActionListener(e -> {
            if (running)
                toggleRunning();
            currentOrder = 0;
            updateInfoLabel();
            repaint();
        });

        speedSlider.addChangeListener(e -> timer.setDelay(speedSlider.getValue()));

        lineBtn.addActionListener(e -> {
            baseShape = BaseShape.LINE;
            updateInfoLabel();
            repaint();
        });

        triBtn.addActionListener(e -> {
            baseShape = BaseShape.TRIANGLE;
            updateInfoLabel();
            repaint();
        });
    }

    private void toggleRunning() {
        running = !running;
        if (running) {
            startPauseBtn.setText("Paus");
            timer.start();
        } else {
            startPauseBtn.setText("Start");
            timer.stop();
        }
    }

    private void stepForward() {
        if (currentOrder < maxOrder) {
            currentOrder++;
        } else {
            if (running)
                toggleRunning();
        }
        updateInfoLabel();
        repaint();
    }

    private void updateInfoLabel() {
        String mode = (baseShape == BaseShape.LINE) ? "Linje" : "Triangel";
        infoLabel.setText("  Bas: " + mode + "   Nivå: " + currentOrder + " / " + maxOrder + "   ");
    }

    private class DrawingCanvas extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int w = getWidth();
            int h = getHeight();

            Path2D path = buildPath(currentOrder, baseShape);

            Rectangle2D bounds = path.getBounds2D();

            double margin = 20.0;
            double availW = Math.max(1, w - 2 * margin);
            double availH = Math.max(1, h - 2 * margin);

            double scaleX = availW / bounds.getWidth();
            double scaleY = availH / bounds.getHeight();
            double scale = Math.min(scaleX, scaleY);

            double tx = (w - scale * bounds.getWidth()) / 2.0 - scale * bounds.getX();
            double ty = (h - scale * bounds.getHeight()) / 2.0 - scale * bounds.getY();

            AffineTransform at = new AffineTransform();
            at.translate(tx, ty);
            at.scale(scale, scale);
            Shape fitted = at.createTransformedShape(path);

            g2.draw(fitted);
            g2.dispose();
        }
    }

    private Path2D buildPath(int order, BaseShape shape) {
        Path2D.Double path = new Path2D.Double();

        if (shape == BaseShape.LINE) {
            int sign = signForLine;

            path.moveTo(0, 0);
            PointD end = kochToPath(path, order, 0, 0, 0.0, 1.0, sign);

        } else {
            int sign = signForTriangle;

            double len = 1.0;

            double ax = 0, ay = 0;
            path.moveTo(ax, ay);

            PointD b = kochToPath(path, order, ax, ay, 0.0, len, sign);

            PointD c = kochToPath(path, order, b.x, b.y, -2.0 * Math.PI / 3.0, len, sign);

            PointD a2 = kochToPath(path, order, c.x, c.y, 2.0 * Math.PI / 3.0, len, sign);

            path.closePath();
        }

        return path;
    }

    private PointD kochToPath(Path2D.Double path, int n,
            double x, double y,
            double angleRad, double len,
            int turnSign) {
        if (n == 0) {
            double x2 = x + len * Math.cos(angleRad);
            double y2 = y + len * Math.sin(angleRad);
            path.lineTo(x2, y2);
            return new PointD(x2, y2);
        }

        len /= 3.0;

        PointD p1 = kochToPath(path, n - 1, x, y, angleRad, len, turnSign);
        PointD p2 = kochToPath(path, n - 1, p1.x, p1.y, angleRad + turnSign * Math.PI / 3.0, len, turnSign);
        PointD p3 = kochToPath(path, n - 1, p2.x, p2.y, angleRad - turnSign * Math.PI / 3.0, len, turnSign);
        return kochToPath(path, n - 1, p3.x, p3.y, angleRad, len, turnSign);
    }

    private static class PointD {
        final double x, y;

        PointD(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Koch – steg för steg (linje eller triangel) – fit to window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1100, 700);
            frame.setLocationRelativeTo(null);
            frame.setContentPane(new KochStepByStep());
            frame.setVisible(true);
        });
    }
}