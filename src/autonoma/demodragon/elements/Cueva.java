package autonoma.demodragon.elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;


/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 */

public class Cueva extends Sprite {
    private Dragon dragon;
    private ArrayList<Oro> oros = new ArrayList<>();
    private ArrayList<Piedra> piedras = new ArrayList<>();
    
    public Cueva(int x, int y, int width, int height) {
        super(x, y, width, height, new Color(34, 139, 34)); 
        dragon = new Dragon(100, 100, 50, 50, width, height); 
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
        
        dragon.draw(g);
        
        for(Oro orito : oros)
            orito.draw(g);
        
        for(Piedra piedrita : piedras)
            piedrita.draw(g);
    }
    
    public void handleKey(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_RIGHT:
                dragon.handleKey(e);
                checkForOrosEaten();
                checkForPiedrasEaten();
                break;
                
            case KeyEvent.VK_A:
                addOro();
                break;
                
            case KeyEvent.VK_O:
                addPiedra();
                break;
        }    
    }
    
    private void checkForOrosEaten() {
        for(int i = 0; i < oros.size(); i++) {
            Oro orito = oros.get(i);
            if(dragon.hit(orito)) {
                oros.remove(orito);
                i--;
                dragon.grow(); 
            }
        }
    }
    
    private void checkForPiedrasEaten() {
        for(int i = 0; i < piedras.size(); i++) {
            Piedra piedrita = piedras.get(i);
            if(dragon.hit(piedrita)) {
                piedras.remove(piedrita);
                i--;
                dragon.shrink(); 
            }
        }
    }
    
    private void addOro() {
        int x = (int)(Math.random() * width);
        int y = (int)(Math.random() * height);
        
        Oro orito = new Oro(x, y, 25, 25);
        oros.add(orito);
    }
    
    private void addPiedra() {
        int x = (int)(Math.random() * width);
        int y = (int)(Math.random() * height);
        
        Piedra piedrita = new Piedra(x, y, 25, 25);
        piedras.add(piedrita);
    }
}
