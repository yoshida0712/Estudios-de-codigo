package Ejercicio_Trainee;

import java.util.Scanner;

public class Ejercicio_Practico {

    public static void main(String[] args) {

        System.out.println("Bienvenido, a continuacion la lista de puestos disponibles: ");

        int a = 3;
        char matriz[][] = new char[a][a];
        for (int f = 0; f < a; f++) {
            for (int c = 0; c < a; c++) {
                matriz[f][c] = 'L';
                System.out.print(" [ " + matriz[f][c] + " ] ");
            }
            System.out.println("\n");
        }

        boolean reserva = false;
        Scanner teclado = new Scanner(System.in);
        String respuesta;

        while (!reserva) {
            System.out.println("Desea ver los asientos disponibles ?");
            dibujarMapa(asientos);
            
            System.out.println("Ingrese a continuacion la fila y puesto a reservar: ");
            System.out.println("Fila (entre 1 a 10): ");
            int F = teclado.nextInt();
            System.out.println("Puesto (entre 1 a 10): ");
            int P = teclado.nextInt();

            F = F - 1;
            P = P - 1;

            if (matriz[F][P] == 'X') {
                System.out.println("Lo sentimos, el puesto que desea revervar ya se encuentra ocupado.");
            } else {
                matriz[F][P] = 'X';
                System.out.println("El puesto a sido reservado exitosamente.");
            }
            
            // Preguntar al usuario si desea realizar otra reserva
            System.out.println("Desea realizar otra reserva? (S/N): ");
            respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("N")) {
                reserva = true; // Cambiar reserva a true para salir del bucle
            }
            
            System.out.println(reserva);
            System.out.println("Lista de puestos: ");
            for (int f = 0; f < a; f++) {
                for (int c = 0; c < a; c++) {
                    System.out.print(" [ " + matriz[f][c] + " ] ");
                }
                System.out.println("\n");
            }
            System.out.println("___________________________________________________________________");
        }
    }
    
    public static void dibujarMapa(char asientos[][]){
        int a = 3;
        for (int f = 0; f < a; f++) {
            for (int c = 0; c < a; c++) {
                System.out.println("asientos");
            }
            System.out.println("\n");
        }
    }
    
}
