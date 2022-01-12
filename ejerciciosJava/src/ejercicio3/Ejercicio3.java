/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */
package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rosi-PC
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner frase = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("ingrese una frase");
        String unaFrase= frase.next();
        System.out.println(unaFrase.toUpperCase());
        System.out.println(unaFrase.toLowerCase());
        
    }
    
}
