/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg33;

import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio33 {

    /**
     * Dada una cadena, extraer la cuarta y quinta letra usando el método substring.
     */
    public static void main(String[] args) {
        
        Scanner Teclado = new Scanner(System.in);
        String palabra;
        System.out.println("Digite una palabra de más de 5 letras: ");
        palabra = Teclado.nextLine();
       
        
       System.out.println("4ta letra: "+palabra.substring(3,4)+" "+" 5ta letra: "+palabra.substring(4, 5));//he  
        
    }
    
}
