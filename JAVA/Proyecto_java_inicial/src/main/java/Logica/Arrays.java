
package Logica;

import java.util.Scanner;

/**
 *
 * @author TIRESIA
 */
public class Arrays {
    public static void main(String[] args) {
        int vector[] = new int[4];
        
        Scanner teclado = new Scanner (System.in);    
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un numero para el vector");
            vector[i] = teclado.nextInt();
         }
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el indice: " + i);
            System.out.println("Tengo guardado un " + vector[i]);
            System.out.println("---------------------------------");
        }
    }
}
