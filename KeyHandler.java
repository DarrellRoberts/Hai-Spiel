import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Var.moveup = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Var.movedown = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Var.moveleft = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Var.moveright = true;
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Var.moveup = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Var.movedown = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Var.moveleft = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Var.moveright = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }
}