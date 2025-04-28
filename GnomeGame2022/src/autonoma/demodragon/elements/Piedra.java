/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.demodragon.elements;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author USUARIO
 */
public class Piedra extends Sprite {

    public Piedra(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color.GRAY);
    }

    @Override
   public void draw(Graphics g) {
    g.setColor(color);  
    g.fillOval(x, y, width, height);
   }
    
}
