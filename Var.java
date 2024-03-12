import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Var {
    static JFrame jf1;
    static int screenwidth = 800, screenheight = 600;
    static int backgroundY1 = 0, backgroundY2 = -600, backgroundspeed = 9;
    static int x = 350, y = 350;
    static int speedup = 9, speeddown = 8, speedleft = 8, speedright = 8; 
    static int flammeanimation;

    static int gegnerx[] = new int[5], gegnery[] = new int[5];
    static int gegnerspeed[] = new int [5];
    
    static boolean moveup = false, movedown = false, moveleft = false, moveright = false;
    static Label lbl1;

    static BufferedImage ib1, ib2;
    static BufferedImage ihai, ihailinks, ihailinksunter, ihaiunter, iflamme1, iflamme2;
    static BufferedImage igegner1;
    public Var() {
        try {
            // Background
            ib1 = ImageIO.read(new File("rsc/b1.png"));
            ib2 = ImageIO.read(new File("rsc/b1.png"));
            //Hai
            ihai = ImageIO.read(new File("rsc/hai.png"));
            ihailinks = ImageIO.read(new File("rsc/hailinks.png"));
            ihailinksunter = ImageIO.read(new File("rsc/hailinksunter.png"));
            ihaiunter = ImageIO.read(new File("rsc/haiunter.png"));
            //Flamme
            iflamme1 = ImageIO.read(new File("rsc/flamme1.1.png"));
            iflamme2 = ImageIO.read(new File("rsc/flamme1.2.png"));
            //Gegner
            igegner1 = ImageIO.read(new File("rsc/delfine.png")); 

        } catch(IOException e) {
            e.printStackTrace();
            System.out.println("Bilder konnten nicht geladen werden");
        }

        gegnerspeed[0] = 3;
        gegnerspeed[1] = 4;
        gegnerspeed[2] = 3;
        gegnerspeed[3] = 4;
        gegnerspeed[4] = 3;
    }
}