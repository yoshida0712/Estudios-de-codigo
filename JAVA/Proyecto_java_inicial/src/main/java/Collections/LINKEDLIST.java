package Collections;

import java.util.LinkedList;
import java.util.List;

public class LINKEDLIST {
    public static void main(String[] args){
        List<Persona> lista = new LinkedList<Persona> ();
        
        lista.add(new Persona(1,"David",21));
        lista.add(new Persona(5,"Samuel",22));
        lista.add(new Persona(3,"Camilo",23));        
        lista.add(new Persona(4,"Andres",24));
        
        //agregar al inicio de la lista
        //para poner un dato al inicio de la array, se debe colocar el 0 de esta forma
        lista.add(0, new Persona(6,"Manuel",30));
        
        //No tienen un indice bien definido, por eso se debe usar un for each para recorer cada dato
        for (Persona perso1:lista){            
            System.out.println("prueba: " + perso1.getNombre());
        }
    }
}
