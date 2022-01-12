/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package ejercicio9;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rosi-PC
 */
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese una frase");
        String frase = scan.next();
        int longitud = frase.length();
        if (longitud == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
