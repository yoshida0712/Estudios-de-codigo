
package Collections;

import java.util.Stack;

public class Stacks {
    public static void main (String[] args){
        Stack<Integer> pila = new Stack<Integer>();
        
        System.out.println("Lista vacia: " + pila);
        System.out.println("Esta vacia: " + pila.isEmpty());
        
        //agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        //recorrido
        for (Integer pilita: pila){
            System.out.println(pilita);
        }
        
        //mostrar
        System.out.println("Pila: " + pila);
        System.out.println("Pila vacia? " + pila.isEmpty());
        
        pila.pop();//eliminar el ultimo registro que entro
        System.out.println("Esta el 3?" + pila.search(8));// search solo sirve para buscar datos con 1 solo tipo de valor,
                                                            // si tiene mas no busca correctamente.
        //nota: cuando dan numeros positivos, significa verdadero, cuando dan negativos, significa falso
        System.out.println("Ultimo agregado: " + pila.peek());
    }
}
