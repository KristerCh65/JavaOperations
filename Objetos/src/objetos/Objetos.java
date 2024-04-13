/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetos;

/**
 *
 * @author Krister
 */
public class Objetos {
    String nombre;
    String color;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Objetos objeto1 = new Objetos();
        Objetos objeto2 = new Objetos();
        
        objeto1.nombre = "atributo 1";
        objeto2.nombre = "atributo 2";
        objeto1.color = "Azul";
        objeto2.color = "rojo";
        
        System.out.println("nombre objeto 1 " + objeto1.nombre);
        System.out.println("nombre objeto 2 " + objeto2.nombre);
        System.out.println("color objeto 1 " + objeto1.color);
        System.out.println("color objeto 2 " + objeto2.color);
    }
    
}
