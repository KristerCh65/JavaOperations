/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasIF;

import javax.swing.JOptionPane;

/**
 *
 * @author Krister
 */
public class EstructurasDecisiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        String nacionalidad = JOptionPane.showInputDialog("Escribe tu nacionalidad");
        String altura = JOptionPane.showInputDialog("Escribe tu altura:");
        String edad = JOptionPane.showInputDialog("Escribe tu edad");
        
        double alt = Double.parseDouble(altura);
        int edadP = Integer.parseInt(edad);
        
        Persona persona = new Persona();
        
        persona.setAltura(alt);
        persona.setEdad(edadP);
        persona.setNacionalidad(nacionalidad);
        persona.setNombre(nombre);
        
        JOptionPane.showMessageDialog(null, "Nombre: " + persona.getNombre());
        JOptionPane.showMessageDialog(null, "Nacionalidad: " + persona.getNacionalidad());
        JOptionPane.showMessageDialog(null, "Altura: " + persona.getAltura());
        JOptionPane.showMessageDialog(null, "Edad: " + persona.getEdad());
    }
    
}
