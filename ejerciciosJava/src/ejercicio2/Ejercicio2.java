/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        String nombre;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Introduzca su nombre: ");
        nombre = ingreso.nextLine();
        System.out.println("¡Hola " + nombre + "!");
    }

}
