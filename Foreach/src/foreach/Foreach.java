/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foreach;

/**
 *
 * @author Krister
 */
public class Foreach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arreglo = {87,64,94,100,83,78,85,91,76,87};
        int total = 0;
        
        for(int numero : arreglo){
            total += numero;
        }
        
        System.out.println("El valor de la suma es: " + total);
    }
    
}
