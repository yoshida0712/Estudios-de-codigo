
package com.mycompany.proyecto_java_inicial;

import java.util.Scanner;

public class Proyecto_java_inicial {

    public static void main(String[] args) {

        int rol = 3;
        
        Scanner teclado = new Scanner (System.in);
        
        double sueldo1 = 15890; 
        double sueldo2 = 25630.89;
        double sueldo3 = 35560.20;
        double pago;
        double pagototal;
        
        switch (rol) {
            case 1: 
            pago = sueldo1 * 0.1;
            pagototal = pago + sueldo1;
            System.out.println("El pago total del repositor  es de: " + pagototal);
                break;
            case 2: 
            pago = sueldo2;
            System.out.println("El pago total del cajero  es de: " + pago);
                break;
            case 3: 
            pago = sueldo3 * 0.11;
            pagototal = sueldo3 - pago;
            System.out.println("El pago total del supervisor  es de: " + pagototal);
                break;
            default:
                System.out.println("El tipo de empleado ingresado es incorrecto");        
            }
        
    }
}
