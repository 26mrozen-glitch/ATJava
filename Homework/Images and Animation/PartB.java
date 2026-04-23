import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;

public class PartB extends JPanel implements ActionListener {

    private Image myImage;

    private double x = 0;
    private double y = 0;

    private double angle = 0;

    private Timer timer = new Timer(25, this);

    public PartB() {
        setPreferredSize(new Dimension(720, 720));
        setBackground(Color.CYAN);

        ImageIcon icon = new ImageIcon("media/Andy.png");
        myImage = icon.getImage();

        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        int imageWidth = myImage.getWidth(this);
        int imageHeight = myImage.getHeight(this);

        AffineTransform at = new AffineTransform();
        at.translate(x, y);
        at.rotate(angle);
        at.translate(-imageWidth / 2.0, -imageHeight / 2.0);

        g2d.drawImage(myImage, at, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x = x + 1;
        y = y + 1;

        angle += Math.toRadians(5);

        if (x > getWidth()) {
            x = 0;
        }

        if (y > getHeight()) {
            y = 0;
        }

        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Andy Animation");
        PartB panel = new PartB();

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}