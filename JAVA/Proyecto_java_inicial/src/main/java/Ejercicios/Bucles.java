
package Ejercicios;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        //declarar la altura del arbol
        System.out.println("Seleccione la altura maxima del arbol: ");
        Scanner sc = new Scanner(System.in);
        int altura = sc.nextInt();
        
        //bucle para recorrer todas las filas (altura)
        for  (int fila = 0; fila < altura; fila++){
            //bucle para los espacio
            for (int espacio = 0; espacio < (altura-fila-1);espacio++){
                System.out.print(" ");
            }
            //buble para los asteriscos
            for (int asterisco = 0; asterisco < (fila * 2)+ 1; asterisco++){
                System.out.print("*");
            }
            System.out.println(" "); 
        }     
        //tronco
        int largoTronco = 1;
        for ( int base = 0; base < largoTronco; base++){
            //espacios en blanco
            for (int espacio = 0; espacio < (altura - 2); espacio++){
                System.out.print(" ");
            }
            //barritas de tronco
            for(int tronco = 0; tronco <3; tronco++){
                System.out.print("|");
            }

            System.out.println();
        }

        /*
        largoTronco: Determina cuántas veces se ejecutará el bucle externo. En este caso, se ejecuta una sola vez.
        Primer Bucle Interno (for con espacio): Imprime espacios en blanco. La cantidad de espacios impresos es altura - 2.
        Segundo Bucle Interno (for con tronco): Imprime tres caracteres de barra vertical (|), representando el tronco.
        System.out.println(): Imprime una nueva línea después de los espacios y las barritas de tronco.
        */ 

    }
}
