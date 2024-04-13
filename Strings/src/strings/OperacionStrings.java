/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings;

/**
 * Demuestra algunas operaciones con strings
 * @author Krister
 */
public class OperacionStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena1 = "Hola";
        String cadena2 = "Mundo!";
        int entero = 20;
        
        //Concatenar
        String textoConNum = cadena1 + (entero + 40);
        String mensaje = cadena1 + " " + cadena2;
        System.out.println(mensaje);
        System.out.println(textoConNum);
        
        String pruebaConcat = "to".concat("get").concat("her");
        System.out.println(pruebaConcat);
        
        //contar caracteres
        int cantidadCaracteres = "Krister Munguia".length();
        System.out.println(cantidadCaracteres);
        
        //extraer cadena 
        String lenguajeFavorito = "Mi lenguaje favorito es C#";
        String lenguaje = lenguajeFavorito.substring(24, 26);
        System.out.println(lenguaje);
        
        //cadena igual a otra con equals
        boolean esIgual = cadena1.equals(cadena2);
        System.out.println(esIgual);
        
        //devolver el indice de alguna letra en un string
        int indice = "Argentina".indexOf("e");
        System.out.println(indice);
        
        String opinion = "Uno de los paises mas bonitos es Japon. Ademas Japon es uno de los mas seguros";
        int indiceJapon = opinion.indexOf("Japon");
        System.out.println("Japon esta en el indice " + indiceJapon);
        
        //extraer char a partir de indice 
        char letraExtraida = "Argentina".charAt(3);
        System.out.println("La letra del indice 3 es " + letraExtraida);
        
        //Determinar si una cadena tiene porcion de otra
        boolean mensaje2 = mensaje.contains("Mundo");
        System.out.println("contiene la palabra mundo? " + mensaje2);
        
        //empieza con un valor determinado
        String favorito = "Lasagna es mi pasta favorita";
        boolean esFav =  favorito.startsWith("Lasagna");
        System.out.println("Lasagna es pasta favorita? " + esFav);
        
        //Determinar si termina con un valor especificado
        String optimo = "Uno de los lenguajes mas optimos es C++";
        boolean esOptimo = optimo.endsWith("C++");
        System.out.println("Termina con c++? "+ esOptimo);
        
        //la cadena esta vacia
        System.out.println("La cadena esta vacia? " + "".isEmpty());
        
        //reemplaza el contenido de una cadena en otra
        String cadenaReemplazar = "  La ley de la relatividad fue publicada por Pascal   ";
        String cadenaReemplazada = cadenaReemplazar.replace("Pascal", "Einstein");
        System.out.println(cadenaReemplazada);
        
        //remover espacios en blanco a los lados con strip()
        System.out.println(cadenaReemplazar.strip());
        
        //convertir caracteres en minuscula
        System.out.println(cadenaReemplazar.toLowerCase());
        
        //convertir caracteres en MAYUSCULA
        System.out.println(cadenaReemplazada.toUpperCase());
        
        //usar valueOf(long) convertir diferentes valores numericos a string
        int numero = 103;
        String numeroString = String.valueOf(numero);
        System.out.println("El numero convertido es: " + numeroString + 10);
    }
    
}
