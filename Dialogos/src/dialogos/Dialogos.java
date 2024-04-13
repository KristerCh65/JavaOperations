/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dialogos;

import javax.swing.JOptionPane;

/**
 *
 * @author Krister
 */
public class Dialogos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Operacion realizada correctamente");
        JOptionPane.showMessageDialog(null, "Operacion realizada correctamente", "Titulo Ventana", JOptionPane.WARNING_MESSAGE);
        
        
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        JOptionPane.showMessageDialog(null, "Hola " + nombre);
        
    }
    
}
