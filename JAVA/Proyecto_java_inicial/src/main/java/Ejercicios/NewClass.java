
package Ejercicios;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        
        System.out.println("Por favor ingrese el numero: ");
        Scanner teclado = new Scanner (System.in);
        
        int limite = teclado.nextInt();
        int cont = 0;
        
        for (int i = 1; i <= limite; i++){
                cont=cont +1;
                System.out.println("Numero : " + cont);
        }
    }
}
