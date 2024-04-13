/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulamiento;

/**
 *
 * @author Krister
 */

public class Encapsulamiento{
    private int tipo;
    private int edad;
    
    public void setTipo(int t){
        tipo = t;
    }
    
    public int getTipo(){
        return tipo;
    }
    
    public void setEdad(int e){
        edad = e;
    }
    
    public int getEdad(){
        return edad;
    }
}

class AccsesoIndirecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Encapsulamiento en = new Encapsulamiento();
        en.setTipo(4);
        System.out.println("El tipo es: " + en.getTipo());
    }
    
}
