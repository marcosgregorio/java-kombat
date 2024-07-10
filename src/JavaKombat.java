import Stages.ThePit;

import javax.swing.*;
import java.awt.*;

public class JavaKombat extends JFrame {
    private final JPanel currentStage;
    private Image background;

    public JavaKombat() {
        setTitle("Java Kombat");
        setSize(800, 600);
        setLayout(new BorderLayout());
        setResizable(true);

        this.currentStage = new ThePit();

        add(currentStage, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JavaKombat();
    }
}