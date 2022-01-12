/*
 Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla
 */
package ejercicio6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rosi-PC
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
      System.out.print("ingrese una nro");
      int nro1= scan.nextInt();
      System.out.print("ingrese otro  nro");
      int nro2= scan.nextInt();
        if (nro1< nro2) {
           System.out.print("el nro mayor es "+nro2);
        }else{
               System.out.print("el nro mayor es "+nro1);
        }
            
    }
    
}
