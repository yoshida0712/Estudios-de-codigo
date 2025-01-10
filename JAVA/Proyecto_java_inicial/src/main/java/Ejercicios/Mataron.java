package Ejercicios;
import java.util.Scanner;
/*
En la cuidad de Obera Misiones, se realiza año a año la "Maratón del Inmigrante" en el marco de la 
Fiesta Nacional del Inmigrante. El evento cuenta con un dia de inscipciones en día anterior a la 
carrera, por lo que se desconoce la cantidad exacta de inscriptos que puede llegar a haber. Desde la 
Federacion de Colectivos ( Organismo que organiza), manifestaron que se solicitan los siguentes datos
para la inscripción de cada participante: dni, nombre y edad.

En cuanto a las categorias posibles para una inscripcion, se manejas las siguientes:

Menores A (6 a 10 años)
Menores B (11 a 17 años)
Juveniles (18 a 30 años)
Adultos (21 a 50 años)
Adultos mayores (mayores de 50 años)

Se necesita un programa que, a partir del ingreso de datos y edad de cada participante, se muestre
por pantalla a que categoria debe ser inscripto. Cabe destacar que, al finalizar el dia, para dar fin
a las inscripciones, se debe ingresar un dni con el valor 0 y un nombre con la palabra "fin".
*/
public class Mataron {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese la cedula: ");
        Scanner teclado = new Scanner (System.in);        
        String cedula = teclado.next();
        System.out.println("Por favor ingre el nombre");
        Scanner teclado2 = new Scanner (System.in);
        String nombre = teclado2.next();
        System.out.println("Por favor ingrese la edad: ");
        Scanner teclado3 = new Scanner (System.in);
        int edad = teclado3.nextInt();
        
        while (!nombre.equalsIgnoreCase("fin") && !cedula.equals("0")){
            if ( 6 <= edad && edad<= 10){
                System.out.println("Pertenece al grupo Menores A");
            }
            else if ( 11 <= edad && edad <=17 ){
                System.out.println("Pertenece al grupo Menores B");
            }
            else if ( 18 <= edad && edad <=30){
                System.out.println("Pertecene al grupo Juveniles");
            }
            else if ( 21 <= edad && edad <= 50){
                System.out.println("Pertenece al grupo de Adultos");
            }
            else if ( 4 >= edad){
                System.out.println("La edad es insuficiente");
            }
            else {
                System.out.println("Pertenece al grupo de Adultos Mayores");
            }
            
            System.out.println("Por favor ingrese la cedula: ");
            cedula = teclado.next();
            System.out.println("Por favor ingre el nombre");
            nombre = teclado2.next();
            System.out.println("Por favor ingrese la edad: ");
            edad = teclado3.nextInt();
        }        
    }
}
