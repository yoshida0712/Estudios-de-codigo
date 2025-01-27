/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author TIRESIA
 */
public class LINKEDLIST {
    public static void main(String[] args){
        List<Persona> lista = new LinkedList<Persona> ();
        
        lista.add(new Persona(1,"David",21));
        lista.add(new Persona(5,"Samuel",22));
        lista.add(new Persona(3,"Camilo",23));
        lista.add(new Persona(4,"Andres",24));
        //No tienen un indice bien definido
        for (Persona perso1:lista){            
            System.out.println("prueba: " + perso1.getNombre());
        }
    }
}
