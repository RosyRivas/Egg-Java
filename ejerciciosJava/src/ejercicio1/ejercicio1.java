/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Rosi-PC
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner nro = new Scanner(System.in);
        int nro1;
        int nro2;
        int suma;
        System.out.println("Introduce el primer  número:");
        nro1 = nro.nextInt();
        System.out.println("Introduce el segundo  número:");
        nro2 = nro.nextInt();
        suma= nro1+nro2;
        System.out.println("La suma es " + nro1 + " + " + nro2 + " = " + suma);
    }
    
}
