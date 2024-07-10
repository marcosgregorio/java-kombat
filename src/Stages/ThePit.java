package Stages;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

final public class ThePit extends Stage {

    public ThePit() {
        super("assets/the-pit/bridge-background.gif");
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        Image forGroundBridge;
        g2d.scale(2.25, 2.25);
        try {
            forGroundBridge = ImageIO.read(new File("assets//the-pit/bridge-forground.gif"));
            g2d.drawImage(forGroundBridge, 0, 150, this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
