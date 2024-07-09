import javax.swing.JFrame;
import javax.swing.JPanel;

import Stages.TheDeadPool;
import Stages.ThePit;

import java.awt.BorderLayout;
import java.awt.Image;

public class JavaKombat extends JFrame {
    private Image background;
    private JPanel currentStage;

    public JavaKombat() {
        setTitle("Java Kombat");
        setSize(800, 600);
        setLayout(new BorderLayout());
        setResizable(false);

        this.currentStage = new TheDeadPool();
        add(currentStage, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JavaKombat();
    }
}