package autonoma.demodragon.elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 */
public class Oro extends Sprite {

    private Image oroImage; 

    public Oro(int x, int y, int width, int height) {
        super(x, y, width, height, new Color(212, 175, 55));

       
        oroImage = new ImageIcon(getClass().getResource("/autonoma/demodragon/images/oro.png")).getImage();
    }
    
    @Override
    public void draw(Graphics g) {
       
        g.drawImage(oroImage, x, y, width, height, null);
    }
}
