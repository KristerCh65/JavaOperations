/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Colecciones;

import java.util.ArrayList;
/**
 *
 * @author Krister
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> array = new ArrayList<>();
        
        array.add("rojo");
        array.add("azul");
        array.add("verde");
        

        
        for(String elemento: array){
            System.out.println("Valor: " + elemento);
        }
        
        if(array.contains("verde")){
            System.out.println("si hay verde");
        }
        
        if(array.contains("verde")){
            System.out.println("hay amarillo");
        }else{
            System.out.println("sin amarillo");
        }
        
        System.out.println("el array esta vacio? " + array.isEmpty());
        
        array.clear();
        
        System.out.println("el array esta vacio? " + array.isEmpty());
    }
    
}
