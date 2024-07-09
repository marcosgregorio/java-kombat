package Stages;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

final public class ThePit extends Stage {

    public ThePit() {
        super("assets/the-pit/bridge-background.gif");
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // g.drawImage(this.background, 200, 200, this.imageObserver);
    }
}
