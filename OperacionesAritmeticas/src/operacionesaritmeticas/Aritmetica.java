/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesaritmeticas;

import java.util.Scanner;

/**
 *  Esta clase realiza operaciones aritmeticas
 * @author Krister
 */
public class Aritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;
        int suma;
        int resta;
        int multi;
        int division;
        int modulo;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese otro numero");
        num2 = teclado.nextInt();
        
        System.out.println("El primer numero es: " + num1);
        System.out.println("El segundo numero es: " + num2);
        
        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        division = num1 / num2;
        modulo =  num1 % num2;
        
        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicacion es " + multi);
        System.out.println("El resultado de la division es " + division);
        System.out.println("El resultado de la operación modulo es " + modulo);
        
    }
    
}
