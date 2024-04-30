/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arreglos;

/**
 *
 * @author Krister
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] arreglo1 =  new String[5];
        int [] arreglo2 = {52,51,46,1,2};
        
        arreglo1[0] = "uno";
        arreglo1[1] = "dos";
        arreglo1[2] = "tres";
        arreglo1[3] = "cuatro";
        arreglo1[4] = "cinco";
        
        for (String arreglo11 : arreglo1) {
            System.out.println("valor " + arreglo11);
        }
        
        for(int z=0; z<arreglo2.length; z++){
            System.out.println("valor " + arreglo2[z]);
        }
        
    }
    
}
