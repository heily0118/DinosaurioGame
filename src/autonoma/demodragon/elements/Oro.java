/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.demodragon.elements;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author educacion
 */
public class Oro extends Sprite {

    public Oro(int x, int y, int width, int height) {
        super(x, y, width, height, new Color(212, 175, 55));
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
}
