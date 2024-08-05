package Fighters;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Fighter {
    private Image fighter;

    public Fighter(String fighterSelected) {
        try {
            this.fighter = new ImageIcon(fighterSelected).getImage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
