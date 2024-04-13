/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estaticos;

/**
 *
 * @author Krister
 */
public class Estaticos {
    
    static String attrib = "Atributo";
    
    public static int sumar(int x, int y){
        int suma = x + y;
        return suma;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estaticos est1 = new Estaticos();
        Estaticos est2 = new Estaticos();
        
        est1.attrib = "Atributo Cambiado";
        est2.attrib = "Valor estatico";
        
        
        Estaticos est3 = new Estaticos();
        est3.attrib = "Otro Cambiado";
        
        System.out.println("Variable 1 es: " + est1.attrib);
        System.out.println("Variable 2 es: " + est2.attrib);
        System.out.println("El resultado de la suma es: " + Estaticos.sumar(5, 10));
        
    }
    
}
