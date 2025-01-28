package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_y_Linked_list {

    public static void main(String[] args) {

        List<Persona> listaArray = new ArrayList<Persona>();

        listaArray.add(new Persona(1, "David", 21));
        listaArray.add(new Persona(5, "Samuel", 22));
        listaArray.add(new Persona(3, "Camilo", 23));
        listaArray.add(new Persona(4, "Andres", 24));
        listaArray.add(new Persona(7, "Gabriel", 1));

        LinkedList<Persona> listaLinked = new LinkedList<Persona>();

        listaLinked.add(new Persona(1, "David", 21));
        listaLinked.add(new Persona(5, "Samuel", 22));
        listaLinked.add(new Persona(3, "Camilo", 23));
        listaLinked.add(new Persona(4, "Andres", 24));
        listaLinked.add(new Persona(9, "Gabriel", 1));

        //remover de arraylist
        listaArray.remove(1);

        //remover de linkedlist
        String nombreBorrar = "Gabriel";
        for (Persona persona2 : listaLinked) {
            if (persona2.getNombre().equals(nombreBorrar)) {
                listaLinked.remove(persona2);
                break;
            }
        }

        System.out.println("Array");
        for (Persona persona : listaArray) {
            System.out.println("prueba " + persona.getNombre());
        }

        System.out.println("Link");
        for (Persona persona : listaLinked) {
            System.out.println("prueba: " + persona.getNombre());
        }

        System.out.println("Tamano de listas");
        System.out.println("Array: " + listaArray.size());
        System.out.println("linked: " + listaLinked.size());

        //solo para LinkedList
        System.out.println("Primero y ultimo ");
        System.out.println("Primero linked: " + listaLinked.getFirst().toString());
        System.out.println("Ultimo linked: " + listaLinked.getLast().toString());

        System.out.println("Borra listas:");
        listaArray.clear();
        listaLinked.clear();

        System.out.println("Revisar si existen listas vacias:");
        //se verifica con un boolean, true para vacio false para lleno/con datos
        System.out.println("Arraylist: " + listaArray.isEmpty());
        System.out.println("Linkedlist: " + listaLinked.isEmpty());
    }
}
