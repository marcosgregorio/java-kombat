import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import java.awt.Graphics;
import java.awt.Image;

public class JavaKombat extends JFrame {
    private Image background;

    public JavaKombat() {
        try {
            this.background = ImageIO.read(new File("assets/thepit.gif"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        setTitle("Java Kombat");
        setSize(800, 600);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    
        g.drawImage(background, 200, 200, this);
    }

    public static void main(String[] args) {
        new JavaKombat();
        // JFrame frame = new JFrame();
        // frame.setSize(800, 600);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setVisible(true);
    }
}