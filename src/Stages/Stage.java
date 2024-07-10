package Stages;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Stage extends JPanel{
    private Image background;

    public Stage(String stageSelected) {
        try {
            this.background = new ImageIcon(stageSelected).getImage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.scale(5.0, 5.0);
        if (background != null) {
            g2d.drawImage(background, -100, -50, this);
        }
    }
}
