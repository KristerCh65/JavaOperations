/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeo;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Krister
 */
public class Figuras {
                
    public static void main(String[] args) {
        // TODO code application logic here
        String entrada = JOptionPane.showInputDialog("Escriba 1 para dibujar rectangulos \n Escriba 2 para dibujar ovalos");
        int opcion = Integer.parseInt(entrada);
        FigurasGeo fig = new FigurasGeo(opcion);
        
        JFrame ventana = new JFrame();
        
        ventana.add(fig);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 300);
        ventana.setVisible(true);
    }
    
}
