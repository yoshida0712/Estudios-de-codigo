//para arrylist
package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args){
                
        List<Persona> lista = new ArrayList<Persona> ();
        
        /*
        forma de crear y agregar
        */
        
        //forma larga, se inicializa aparte, y aparte se agrega
        Persona perso = new Persona (2,"Salin",21);
        lista.add(perso);
        //forma acortada, donde se inicializa de una y se dan los datos
        lista.add(new Persona(1,"David",21));
        lista.add(new Persona(5,"Samuel",22));
        lista.add(new Persona(3,"Camilo",23));
        lista.add(new Persona(4,"Andres",24));
        
        /*
        forma de recorrer        
        */
        
        //for clasico como una matriz/vector
        for(int i=0; i<lista.size();i++){
                                            //aca trae la posicion de la persona, con el punto le dice que traiga 
                                            //otro dato de esa posicion que se guarda en el arraylits
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }
        
        //for each
        for (Persona perso1:lista){
                                            //aca como no se tiene que asignar la posicion directamente, por que igualmente como recorre
                                            //cada posicion al ser un for each, se puede asignar directamente y decirle que tipo de 
                                            //dato traer
            System.out.println("prueba: " + perso1.getNombre());
        }
        /*
        nota: para recorrer todo la arraylist, lo mejor es usar el for each, ya que recorre todos los datos, sin necesidad de un indice
        pero cuando se conoce la posicion exacta del dato para buscar, se puede buscar directamente por el indice
        */
    }
}
 