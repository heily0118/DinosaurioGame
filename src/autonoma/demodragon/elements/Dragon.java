package autonoma.demodragon.elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Dragon extends Sprite {

    public static final int STEP = 10;
    public static final int EAT_SIZE = 10;
    private int caveWidth;
    private int caveHeight;
    private Image dragonImage; 

    public Dragon(int x, int y, int width, int height, int caveWidth, int caveHeight) {
        super(x, y, width, height, Color.ORANGE);
        this.caveWidth = caveWidth;
        this.caveHeight = caveHeight;

        
        dragonImage = new ImageIcon(getClass().getResource("/autonoma/demodragon/images/dragon.png")).getImage();
    }

    @Override
    public void draw(Graphics g) {
       
        g.drawImage(dragonImage, x, y, width, height, null);
    }

    public void grow() {
        width += EAT_SIZE;
        height += EAT_SIZE;
    }

    public void shrink() {
        width = Math.max(10, width - EAT_SIZE);
        height = Math.max(10, height - EAT_SIZE);
    }

    public void handleKey(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                if (y - STEP >= 0) {
                    y -= STEP;
                }
                break;
            case KeyEvent.VK_DOWN:
                if (y + height + STEP <= caveHeight) {
                    y += STEP;
                }
                break;
            case KeyEvent.VK_LEFT:
                if (x - STEP >= 0) {
                    x -= STEP;
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (x + width + STEP <= caveWidth) {
                    x += STEP;
                }
                break;
        }
    }
}
