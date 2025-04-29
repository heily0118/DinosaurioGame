package autonoma.demodragon.elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 */
public class Piedra extends Sprite {

    private Image piedraImage; 

    public Piedra(int x, int y, int width, int height) {
        super(x, y, width, height, Color.GRAY);

        
        piedraImage = new ImageIcon(getClass().getResource("/autonoma/demodragon/images/roca.png")).getImage();
    }

    @Override
    public void draw(Graphics g) {
     
        g.drawImage(piedraImage, x, y, width, height, null);
    }
}
