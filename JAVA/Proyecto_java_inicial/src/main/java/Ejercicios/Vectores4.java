
package Ejercicios;

import java.util.Scanner;

public class Vectores4 {
    public static void main(String[] args) {
    /*
        una compañoa de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diaramente, uno por la
        mañana, otro al mediodia y otro por la noche. Para administra estos datos, utiliza una matriz,
        donde cada fila es un destino y en cada columna se guarda la cantidad de asientos disponibles.
        
        1. se necesita un programa que permita la carga de la matriz con la cantidad de asientos para 
        cada vuelo.
        2. al mismo tiempo, el programa debe permitir a un usuario ingresar el numero de destino a que 
        quiere dirigirse, el numero de vuelo ( dependiendo si quiere viajar a la mañana, al medoidia o
        a la noche) y la cantidad de pasajes que necesita.
        3. a partir de la solicitud del usuario, el programa debe controlar si hay la cantidad 
        suficiente de asientos para la cantidad de pasajes que se requiere. En caso de que sea asi, se
        debe mostrar un cartel por pantalla que diga "su reserva fue realizada con exito" y se debe 
        descontar del total de asientos los solicitados por el usuario. En caso de no haber mas 
        asientos disponibles, se debe informar otro cartel que diga "disculpe, no se pudo completar su
        operacion dado que no hay asientos disponibles".
        
    */
        
        System.out.println("Ingrese el numero de rutas de vuelo disponibles: ");
        Scanner teclado =  new Scanner(System.in);
        int f = teclado.nextInt();
        int matriz [][] = new int [f][3];        
        int Fila = 0;
        int Columna;        
        while (Fila < f){            
            Columna = 0;
            while(Columna < 3){                      
                
                int fila2 = Fila + 1;
                int columna2 = Columna + 1;
                System.out.print("Ingrese el numero de puestos disponibles para el vuelo " + fila2 +
                        " en el horario " + columna2 + " : ");         
                int ff = teclado.nextInt();
                matriz [Fila][Columna] = ff;                
                Columna= Columna+1;
                
            }            
            Fila= Fila+1;
            System.out.println("\n");
        }                 
        for (int f1 = 0; f1 < f; f1++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(matriz[f1][c] + " ");
            }
            System.out.println("\n");
        }
        
        int columnaresta = 0;
        int filaresta = 0;
        while (columnaresta < 3 && filaresta < f){
            System.out.println("Ingrese la ruta de vuelo que desea :");
            int ruta = teclado.nextInt();
            System.out.println("Ingrese el horario de vuelo que desea :");
            int horario = teclado.nextInt();
            System.out.println("Ingrese la cantidad de puestos que desea :");
            int puestos = teclado.nextInt();
            matriz[ruta][horario]= matriz[ruta][horario] - puestos;
            
            // Verificar si los valores ingresados están dentro de los límites permitidos
            if (ruta < 0 || ruta >= f || horario < 0 || horario >= 3) {
                System.out.println("Error: La ruta o el horario seleccionados no están disponibles.");
                System.out.println("Por favor ingrese 1 para volver a ingresar los datos correctos o 2 para finalizar.");
                int respuesta = teclado.nextInt();
                if (respuesta == 1) {
                    continue; // Reinicia el bucle `while` desde el principio de la siguiente iteración
                } else {
                    break; // Sale del bucle `while`
                }
            }

            // Verificar si hay suficientes puestos disponibles
            if (matriz[ruta][horario] < puestos) {
                System.out.println("Lo siento, la cantidad de puestos seleccionados en la ruta excede la cantidad de puestos disponibles.");
                System.out.println("Ingrese 1 para continuar con la selección de ruta y 2 para terminar:");
                int respuesta2 = teclado.nextInt();
                if (respuesta2 == 1) {
                    continue; // Reinicia el bucle `while` desde el principio de la siguiente iteración
                } else {
                    break; // Sale del bucle `while`
                }
            }
            
                System.out.println("Su reserva fue realizada con exito");
                System.out.println("En la ruta :" + ruta);
                System.out.println("En el horario :" + horario);
            
            
            /*
            System.out.println("Su reserva fue realizada con exito");
            System.out.println("En la ruta :" + ruta);
            System.out.println("En el horario :" + horario);
             */
            
        }
    }
}
