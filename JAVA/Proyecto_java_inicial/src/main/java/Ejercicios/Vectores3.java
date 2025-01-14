package Ejercicios;

import java.util.Scanner;

public class Vectores3 {

    public static void main(String[] args) {
        /*
         Llevar a cabo un programa que permite cargar completamente con numeros 5 una matriz de 4x5 
         (4 filas, 5 columnas).
         */

        System.out.println("Ingrese la cantidad de filas: ");
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        System.out.println("Ingrese la cantiadd de filas; ");
        Scanner teclado2 = new Scanner(System.in);
        int b = teclado2.nextInt();
        int matriz[][] = new int[a][b];
        System.out.println("Por favor ingrese el numero que quiere en la matriz: ");
        Scanner teclado3 = new Scanner(System.in);
        int d = teclado3.nextInt();

        for (int f = 0; f < a; f++) {
            for (int c = 0; c < b; c++) {
                matriz[f][c] = d;
                System.out.println(matriz[f][c]);
            }
        }
    }
}
