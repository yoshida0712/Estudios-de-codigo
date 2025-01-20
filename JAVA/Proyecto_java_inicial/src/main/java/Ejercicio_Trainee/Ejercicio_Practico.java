package Ejercicio_Trainee;

import java.util.Scanner;

public class Ejercicio_Practico {

    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema de reserva de asientos.");

        int a = 10;
        char matriz[][] = new char[a][a];

        for (int f = 0; f < a; f++) {
            for (int c = 0; c < a; c++) {
                matriz[f][c] = 'L';
            }
        }

        boolean reserva = false;
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        String asientos;

        while (!reserva) {
            System.out.println("Desea ver los asientos disponibles ?(S/N)");
            asientos = teclado.next();

            System.out.println("---------------------------------------");

            if (asientos.equalsIgnoreCase("S")) {
                dibujarMapa(matriz);
            }

            int F = 0;
            int P = 0;

            System.out.println("---------------------------------------");

            boolean ingreso = false;
            while (!ingreso) {
                System.out.println("Ingrese a continuacion la fila y puesto a reservar: ");
                System.out.println("Fila (entre 1 a 10): ");
                F = teclado.nextInt();
                System.out.println("Puesto (entre 1 a 10): ");
                P = teclado.nextInt();

                if (F <= 10 && F >= 1) {
                    if (P <= 10 && P >= 1) {
                        ingreso = true;
                    } else {
                        System.out.println("El puesto ingresado es incorrecto");
                    }
                } else {
                    System.out.println("La fila ingresada es incorrecta");
                }
            }
            F = F - 1;
            P = P - 1;

            if (matriz[F][P] == 'X') {
                System.out.println("Lo sentimos, el puesto que desea revervar ya se encuentra ocupado.");
            } else {
                matriz[F][P] = 'X';
                System.out.println("El puesto a sido reservado exitosamente.");
            }

            System.out.println("---------------------------------------");

            // Preguntar al usuario si desea realizar otra reserva
            System.out.println("Desea realizar otra reserva? (S/N): ");
            respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("N")) {
                reserva = true; // Cambiar reserva a true para salir del bucle
            }
        }
    }

    static void dibujarMapa(char matriz[][]) {
        int a = 10;
        for (int f = 0; f < a; f++) {
            int x = f + 1;
            System.out.print(x + " ");
            for (int c = 0; c < a; c++) {
                System.out.print(" [ " + matriz[f][c] + " ] ");
            }
            System.out.println("\n");
        }
    }
}
