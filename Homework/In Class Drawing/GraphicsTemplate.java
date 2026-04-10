// I tried to draw a tennis racket and did the best that I could. I used chat gpt to help me with some parts of the code but I mainly relied on playing around with adjusting the template we were given.

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class GraphicsTemplate {
    /*
     * Change the following method to customize
     * what is drawn in the JFrame.
     */
    public static void draw(Graphics g) {
        // background
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 400, 400);

        // RACKET HEAD (oval)
        g.setColor(Color.BLACK);
        g.drawOval(150, 50, 100, 140);

        // HANDLE
        g.drawLine(200, 190, 200, 300);

        // STRINGS (vertical)
        for (int x = 160; x <= 240; x += 10) {
            g.drawLine(x, 60, x, 180);
        }

        // STRINGS (horizontal)
        for (int y = 70; y <= 170; y += 10) {
            g.drawLine(160, y, 240, y);
        }
    }

    public static enum OS {
        WIN, MAC, LINUX, OTHER
    }

    public static OS checkOS() {
        OS val;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) {
            val = OS.WIN;
        } else if (name.indexOf("mac") >= 0) {
            val = OS.MAC;
        } else if (name.indexOf("nux") >= 0) {
            val = OS.LINUX;
        } else {
            val = OS.OTHER;
        }

        return val;
    }

    // Do not modify the code in the main method.
    public static void main(String[] args) {
        final int CONTENT_WIDTH = 400;
        final int CONTENT_HEIGHT = 400;

        int border_width = 0;
        int bar_height = 0;
        OS os = checkOS();
        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            case LINUX:
                break;
            case OTHER:
                break;
        }

        int frame_width = CONTENT_WIDTH + 2 * border_width;
        int frame_height = CONTENT_HEIGHT + bar_height + border_width;
        JFrame frame = new JFrame();
        frame.setSize(frame_width, frame_height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setTitle("Graphics Template");

        JComponent component = new JComponent() {
            public void paintComponent(Graphics graph) {
                draw(graph);
            }
        };

        frame.add(component);
        frame.setVisible(true);

        System.out.println("Frame Size   : " + frame.getSize());
        System.out.println("Frame Insets : " + frame.getInsets());
        System.out.println("Content Size : " + frame.getContentPane().getSize());
    }
}