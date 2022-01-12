/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Rosi-PC
 */
public class ejercicio4 {

    
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       double grado;
       double f;
       System.out.println("ingrese el grado en centimetro");
       grado= scan.nextDouble();
       f=32+(9* grado/5);
       System.out.println("el grado en centimetro a Fahrenheit: "+f);
    }
    
}
