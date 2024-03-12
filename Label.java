import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel {
    private static final long serialVersionUID = 1L;
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
        g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);
        // g.drawImage(Var.ihai, Var.x, Var.y, 150, 210, null);
        if (Var.flammeanimation == 0 && Var.movedown == false && Var.moveleft == false) {
            g.drawImage(Var.iflamme1, Var.x + 40, Var.y + 180, 50, 50, null);
        } else if (Var.flammeanimation == 1 && Var.movedown == false && Var.moveleft == false) {
            g.drawImage(Var.iflamme2, Var.x + 40, Var.y + 180, 50, 50, null);
        }
        
        if (Var.moveup == true) {
            g.drawImage(Var.ihai, Var.x, Var.y, 150, 210, null);
        } else if (Var.moveleft == true) {
            if (Var.flammeanimation == 0 && Var.movedown == false) {
                g.drawImage(Var.iflamme1, Var.x + 60, Var.y + 180, 50, 50, null);
            } else if (Var.flammeanimation == 1 && Var.movedown == false) {
                g.drawImage(Var.iflamme2, Var.x + 60, Var.y + 180, 50, 50, null);
            }
                g.drawImage(Var.ihailinks, Var.x, Var.y, 150, 210, null);
        } else if (Var.moveright == true) {
                g.drawImage(Var.ihai, Var.x, Var.y, 150, 210, null);
        } else if (Var.movedown == true) {
                if (Var.flammeanimation == 0) {
                    g.drawImage(Var.iflamme1, Var.x + 40, Var.y - 30, 50, 50, null);
                } else if (Var.flammeanimation == 1) {
                    g.drawImage(Var.iflamme2, Var.x + 40, Var.y - 30, 50, 50, null);
                }
                g.drawImage(Var.ihaiunter, Var.x, Var.y, 150, 210, null);
    } else {
        g.drawImage(Var.ihai, Var.x, Var.y, 150, 210, null);
    }
    for(int i = 0; i < 5 ;i++) {
    g.drawImage(Var.igegner1, Var.gegnerx[i], Var.gegnery[i], 125, 146, null);
    }
        repaint();
    }
}