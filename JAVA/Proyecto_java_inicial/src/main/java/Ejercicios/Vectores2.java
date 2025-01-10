package Ejercicios;
import java.util.Scanner;

public class Vectores2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);     
        System.out.println("Ingrese la cantidad de espacio requeridos: ");
        int a = teclado.nextInt();        
        String cuidad[] = new String [a];
        Double tempM[] = new Double [a];
        Double tempMx[] = new Double [a];
        
        int cont = 0;
        while (cont <cuidad.length){
            int x = cont + 1;
            System.out.println("Ingrese el nombre de la cuidad por favor " + x);
            Scanner teclado2 = new Scanner (System.in);
            cuidad[cont] = teclado2.next();            
            System.out.println("Ingrese la temperatura minima por favor " + x);
            Scanner teclado3 = new Scanner (System.in);
            tempM[cont] = teclado3.nextDouble();
            System.out.println("Ingrese la temperatura maxima por favor " + x);
            Scanner teclado4 = new Scanner (System.in);
            tempMx[cont] = teclado4.nextDouble();
            cont = cont + 1;
        }
        
        for ( int i = 0; i < a; i++){
            int x = i + 1;
            System.out.println("Nombre " + cuidad[i] + " en la pocicion " + x + " con la temperatura "
                    + "minima de " + tempM[i] + " y de temperatura maxima de " + tempMx[i]
            );            
        }        
        
        Double minima = 999999999.0;
        int posMin;
        for ( int i = 0; i < a; i++){
            if (tempM[i] < minima){
                minima = tempM[i];
                posMin = i;
            }
        }
    }
}