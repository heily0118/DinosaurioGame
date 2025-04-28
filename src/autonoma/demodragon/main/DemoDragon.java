/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.demodragon.main;

import autonoma.demodragon.elements.Cueva;
import autonoma.demodragon.gui.GameDragon;

/**
 *
 * @author USUARIO
 */
public class DemoDragon {

   
    public static void main(String[] args) {
        GameDragon window = new GameDragon();
        
        Cueva cueva = new Cueva(0, 0, window.getWidth(), window.getHeight());
        
        window.setCueva(cueva);
        
        window.setVisible(true);
    }
    
}
