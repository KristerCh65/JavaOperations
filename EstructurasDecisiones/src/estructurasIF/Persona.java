/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasIF;

import javax.swing.JOptionPane;

/**
 *
 * @author Krister
 */
public class Persona {
    
    private String nombre;
    private String nacionalidad;
    private double altura;
    private int edad;
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String name){
        nombre = name;
    }
    
    public String getNacionalidad(){
        return nacionalidad;
    }
    
    public void setNacionalidad(String nac){
        nacionalidad = nac;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double alt){
        if(alt > 3){
            JOptionPane.showMessageDialog(null, "Altura Invalida");
        }else{
            altura = alt;
        }

    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int ed){
        if(ed <0 || ed > 130){
            JOptionPane.showConfirmDialog(null, "Edad Invalida");
        }else{
           edad = ed;
        }
    }
    
}
