/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rosi-PC
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese una frase");
        String frase = scan.next();
        String pal = "Eureka";
        if (frase.equals(pal)) {
            System.out.println("Correcto");
        }else{
             System.out.println("Incorrecto");
        }
    }
    
}
