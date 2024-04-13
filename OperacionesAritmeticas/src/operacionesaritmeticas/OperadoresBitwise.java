/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacionesaritmeticas;

/**
 *Los operadores bitwise trabajan a nivel de bits
 * & | << <<< >> >>>
 * @author Krister
 */
public class OperadoresBitwise {
    public static void main(String[] args) {
        //(0101) | 
        //(0011)
        //------
        //0111 en decimal es 7
        int comparacion = 5 | 3;
        System.out.println("El resultado de la comparacion es: " + comparacion);
        
        //(0101) & 
        //(0011)
        //------
        //0001 en decimal es 1
        
        int comparacionAnd = 5 & 3;
        System.out.println("El resultado de la comparacion & es: " + comparacionAnd);
        
        boolean b1=true; //1 en binario
        boolean b2=false; //0 en binario
        
        //1 & 
        //0
        //------
        //0 en booleano es false
        boolean resultado = b1 & b2;
        System.out.println("El resultado & es: " + resultado);
        
        //1  |
        //0
        //------
        //1 en booleano es true
        boolean resultadOr = b1 | b2;
        System.out.println("El resultado Or es: " + resultadOr);
        
    }
    
}
