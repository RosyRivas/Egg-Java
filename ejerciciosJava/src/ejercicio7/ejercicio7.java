/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rosi-PC
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("ingrese una nro");
        int nro = scan.nextInt();
        if (nro % 2 == 0) {
            System.out.println("El número es par ");
        } else {
            System.out.println("El número es impar ");
        }
    }

}
