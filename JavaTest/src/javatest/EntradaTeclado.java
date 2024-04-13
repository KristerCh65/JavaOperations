/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatest;

import java.util.Scanner;

/**
 *
 * @author Krister
 */
public class EntradaTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Comienza el programa...");
        System.out.println("Escribe tu nombre:");
        String nombre = "";
        Scanner entradaTeclado = new Scanner(System.in);
        nombre = entradaTeclado.nextLine();
        System.out.println("Tu nombre es " + nombre);
    }
    
}
