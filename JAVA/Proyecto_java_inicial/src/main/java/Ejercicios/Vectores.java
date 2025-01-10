package Ejercicios;

import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        /*
        Llevar a cabo un programa que incluta un vectir que almacene los nombres: Alejandra, Leonardo,
        Rosam Guillermo, Gabriel, Daniel, Luisa y Ludmila. Realizar un recorrido del vector para cargar
        los datos y otro recorrido para mostrar los mismo por pantalla
        */
        
        Scanner teclado = new Scanner (System.in);     
        System.out.println("Ingrese la cantidad de espacio requeridos: ");
        int a = teclado.nextInt();        
        String vector[] = new String [a];
        
        int cont = 0;
        while (cont <vector.length){
            System.out.println("Ingrese el nombre por favor");
            Scanner teclado2 = new Scanner (System.in);
            vector[cont] = teclado2.next();
            cont = cont + 1;
        }
        
        for ( int i = 0; i < a; i++){
            int x = i + 1;
            System.out.println("Nombre " + vector[i] + " en la pocicion " + x);            
        }
    }
}