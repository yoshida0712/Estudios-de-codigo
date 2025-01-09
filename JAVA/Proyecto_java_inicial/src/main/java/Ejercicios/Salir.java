
package Ejercicios;

import java.util.Scanner;

public class Salir {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese la palabra: ");
        Scanner teclado = new Scanner (System.in);
        
        String palabra = teclado.next();
                     /*equals se usa para comparar strings, tal cual se coloca la condicion, si se
                     coloca SALIR, solo cuando se escriba SALIR se codigo se detiene, pero si se
                     escribe son minuscula no la detecta y el codigo continua.
                     equalsIgnoreCase hace lo mismo, pero si la palabra se escribe con alguna
                     variacion, como SAlIR, si lo toma, y detiene el programa*/
        while (!palabra.equalsIgnoreCase("salir")){
            System.out.println("La palabra es: " + palabra);
            System.out.println("Por favor ingrese la palabra: ");
            palabra = teclado.next();
        }
        
    }
}
