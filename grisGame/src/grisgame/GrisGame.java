/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grisgame;
/**
 *
 * @author William Pfaffe
 */
public class GrisGame {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("Welcome to Gris Game. In need of assistance, "
                + "type help in the console");
        
        grisEngine grisGameEngine = new grisEngine();
        grisGameEngine.gameEngine();
        
    
    
    }
}
