package Logica;
import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args){
        double promedio;
        String conficionFinal;        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el promedio: ");
        promedio = teclado.nextDouble();        
        conficionFinal = promedio >=6 ? "Aprobado" : "Desaprobado";
        System.out.println("La condicion final del alumno es: " + conficionFinal);
    }
}
