
package Logica;

import java.util.Scanner;

public class Ejercicio_matriz_uf_for_1 {
    public static void main(String[] args) { 
        int array []= new int [15];
        Scanner teclado = new Scanner (System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese un numero para el vector");
            array[i] = teclado.nextInt();
        }
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 3){
                cont = cont+1;
                
            }
        }
        System.out.println("Cantidad de numero 3: " + cont);
    }
}
