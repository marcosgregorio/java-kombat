package Stages;

import java.awt.Graphics;

final public class TheDeadPool extends Stage{
    public TheDeadPool() {
        super("assets/the-dead-pool/thedeadpool.gif");
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // g.drawImage(this.background, 200, 200, this.imageObserver);
    }
}
