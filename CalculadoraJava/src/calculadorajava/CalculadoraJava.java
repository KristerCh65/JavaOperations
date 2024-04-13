/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorajava;

import javax.swing.JOptionPane;

/**
 *
 * @author Krister
 */
public class CalculadoraJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n1 = JOptionPane.showInputDialog("Introdusca un numero");
        String n2 = JOptionPane.showInputDialog("Introdusca otro numero");
        
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        
        Operaciones op = new Operaciones();
        
        JOptionPane.showMessageDialog(null, "Suma: " + op.sumar(num1, num2));
        JOptionPane.showMessageDialog(null, "Resta: " +  op.restar(num1, num2));
        JOptionPane.showMessageDialog(null, "Multiplicacion: " + op.multiplicar(num1, num2));
        JOptionPane.showMessageDialog(null, "Division: " + op.division(num1, num2));
    }
    
}
