/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arcoiris;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Krister
 */
public class Arcoiris extends JPanel {

    /**
     * @param args the command line arguments
     */
    
    private final static Color VIOLETA = new Color(128,0,128);
    private final static Color INDIGO = new Color(75,0,130);
    
    //colores para usar en el arcoiris 
    private Color[] colores = {Color.WHITE, Color.WHITE, VIOLETA, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
    
    public Arcoiris(){
        setBackground(Color.WHITE);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int radio = 20;
        int centroX = getWidth()/2;
        int centroY = getHeight()-10;
        
        for(int contador = colores.length; contador > 0; contador--){
            //establecer color para el arco
            g.setColor(colores[contador-1]);
            
            //rellenar el arco desde 0 hasta 180 grado
            int valorX = centroX - contador * radio;
            int valorY = centroY - contador * radio;
            int ancho = contador * radio *2;
            int alto = contador * radio *2;
            
            g.fillArc(valorX, valorY, ancho, alto, 0, 180);
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Arcoiris panel = new Arcoiris();
        JFrame aplicacion = new JFrame();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(400,250);
        aplicacion.setVisible(true);
    }
    
}
