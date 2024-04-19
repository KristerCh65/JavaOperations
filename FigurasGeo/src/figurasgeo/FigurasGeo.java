/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurasgeo;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Krister
 */
public class FigurasGeo extends JPanel {
    
    /**
     * @param args the command line arguments
     */
    
    private final int option;
    
    public FigurasGeo(int optionUser) {
        option = optionUser;
    }// Constructor de figuras 
    
    @Override
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        
        for(int i=0; i<10; i++){
            switch(option){
                case 1: //dibuja rectangulos
                    int xRec= 10+i*10;
                    int yRec= 10+i*10;
                    int anchoRec = 50+i*10;
                    int altoRec = 50+i*10;
                    g.drawRect(xRec, yRec, anchoRec, altoRec);
                    break;
                case 2: //dibuja ovalos
                    int xOval = 10+i*10;
                    int yOval = 10+i*10;
                    int anchoOval = 50+i*10;
                    int altoOval = 50+i*10;
                    g.drawOval(xOval, yOval, anchoOval, altoOval);
                    break;
            }
        }
    }

    
}
