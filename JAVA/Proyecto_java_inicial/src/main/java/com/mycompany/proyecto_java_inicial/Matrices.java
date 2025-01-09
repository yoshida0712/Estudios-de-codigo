
package com.mycompany.proyecto_java_inicial;

import java.util.Scanner;


public class Matrices {
    public static void main(String[] args) { 
        int matriz [][] = new int [3][3];
               /*fila la que va para de izquierda a derecha o viceversa
        matriz  [0] [0] = 1;
                     columna la que va arriba a abajo o viceversa*/
                    
        Scanner teclado = new Scanner (System.in);
        /*nota, este loop lo que hace es conseguir que tome el primer numero, entre al segund loop, y lo tome para convertirse en la 
        posicion [0][0], continua el segundo loop pasando a [0][1] y termina en [0][2], cuando termina el segundo loop vuelve al primero
        pasa a la siguiente fila [1]y asi pasa al siguiente loop y continua como en la primera fila, asi hasta terminar ambos loop.*/ 
        for (int f=0; f<3; f++) {
            for (int c=0; c<3; c++){
                System.out.println("Ingrese el valor de la posicion f: " + f + " c: " + c);
                matriz[f][c]= teclado.nextInt();
            }
        }
        
        for (int f=0; f<3; f++) {
            for (int c=0; c<3; c++){
                System.out.println("Eñ valor de la posicion f: " + f + "c: " + c);
                System.out.println("Es de: " + matriz[f][c]);
            }
        }
    }
}
