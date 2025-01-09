
package com.mycompany.proyecto_java_inicial;

import java.util.Scanner;

public class Ejercicio_matriz_uf_for_2 {
    public static void main(String[] args) { 
        double matriz [][]= new double [4][4];
        double suma = 0.0;
        
        System.out.println("Ingrese las notas de cada alumno en orden.");
        Scanner teclado = new Scanner (System.in);
        for (int f = 0; f < 4; f++){
            for (int c = 0; c < 3; c++){               
                
                System.out.println("Ingrese la nota del alumno "+ f);
                matriz[f][c]= teclado.nextDouble();
                suma = suma + matriz[f][c];
            }
            matriz[f][3] = suma / 3;
            suma = 0.0;
        }
        for (int f = 0; f < 4; f++){
            System.out.println("Las notas del alumno " + f + " son: ");
            for (int c = 0; c < 3; c++){ 
                System.out.println("Nota N°: " + c +" "+ matriz[f][c]);
            }
            System.out.println("El promedio de las notas es: " + matriz[f][3]);
        }
    }
}
