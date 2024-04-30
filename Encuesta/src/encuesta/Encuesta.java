/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encuesta;

import javax.swing.JOptionPane;

/**
 *
 * @author Krister
 */
public class Encuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //arreglo de respuestas de estudiantes
        int [] respuestas = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
        
        //arreglo de contadores de frecuencia
        int [] frecuencia = new int[6];
        
        for(int respuesta = 0; respuesta < respuestas.length; respuesta++){
            try{
                frecuencia[respuestas[respuesta]] += 1;
            }catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "Valor incorrecto " + respuestas[respuesta]);
            }
        }
        
        System.out.printf("%s %10s\n", "Calificacion", "Frecuencia");
        
        for(int calificacion =1; calificacion < frecuencia.length; calificacion++){
            System.out.printf("%6d %10d\n", calificacion, frecuencia[calificacion]);
        }
        
    }
    
}
