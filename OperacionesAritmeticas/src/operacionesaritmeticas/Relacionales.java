/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacionesaritmeticas;

/**
 *
 * @author Krister
 */
public class Relacionales {
    public static void main(String[] args){
        int i = -3;
        byte b = 5;
        short s = 16;
        double d = 3.14;
        
        boolean b1 = i > i; //False
        boolean b2 = i < b; // true
        boolean b3 = b <= s; // true
        boolean b4 = s >= d; // true
        boolean b5 = d != b; // true
        boolean b6 = i == s; // false
        
        System.out.println("El resultado de comparar i > i es: " + b1);
        System.out.println("El resultado de comparar i < b es: " + b2);
        System.out.println("El resultado de comparar b <= S es: " + b3);
        System.out.println("El resultado de comparar s >= d es: " + b4);
        System.out.println("El resultado de comparar d != b es: " + b5);
        System.out.println("El resultado de comparar i == s es: " + b6);
        
    }
    
}
