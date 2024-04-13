/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author Krister
 */
public class Operaciones {
    int numero1;
    int numero2;
    int sumar;
    int restar;
    int multiplicar;
    int dividir;
    
    public void LeerNumeros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer numero");
        numero1 =  sc.nextInt();
        System.out.println("Escribe el segundo numero");
        numero2 = sc.nextInt();
    }
    
    public void sumar(){
        sumar = numero1 + numero2;
    }
    
    public void restar(){
        restar = numero1 - numero2;
    }
    
    public void multiplicar(){
        multiplicar = numero1 * numero2;
    }
    
    public void dividir(){
        dividir = numero1 / numero2; 
    }
    
    public void ImprimeResultados(){
        System.out.println("La suma es " + sumar);        
        System.out.println("La resta es " + restar);
        System.out.println("La multiplicacion es " + multiplicar);        
        System.out.println("La division es " + dividir);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones operations = new Operaciones();
        operations.LeerNumeros();
        operations.sumar();
        operations.restar();
        operations.multiplicar();
        operations.dividir();
        operations.ImprimeResultados();
    }
    
}
