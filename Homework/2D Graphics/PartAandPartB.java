import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PartAandPartB extends JFrame {

    public PartAandPartB() {
        add(new Board());
        setTitle("My App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    class Board extends JPanel {

        public Board() {
            setPreferredSize(new Dimension(350, 350));
            setBackground(Color.CYAN);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;

            Rectangle2D rect = new Rectangle2D.Double(0, 0, 150, 150);

            double centerX = getWidth() / 2.0;
            double centerY = getHeight() / 2.0;

            AffineTransform at = new AffineTransform();

            at.translate(centerX - 75, centerY - 75);

            at.rotate(Math.toRadians(22.5), 75, 75);

            g2d.setColor(Color.MAGENTA);
            g2d.fill(at.createTransformedShape(rect));

            g2d.setColor(Color.BLUE);
            g2d.drawString("Hello, world!", 20, 20);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new PartAandPartB();
        frame.setVisible(true);
    }
}