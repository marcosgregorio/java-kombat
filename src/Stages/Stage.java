package Stages;

import java.awt.Graphics;
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

        if (background != null) {
            g.drawImage(background, 200, 200, this);
        }
    }
}
