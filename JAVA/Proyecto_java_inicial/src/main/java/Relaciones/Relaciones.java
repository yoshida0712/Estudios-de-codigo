
package Relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {

    public static void main(String[] args) {
        
        //1 a N
        
        Auto aut = new Auto();
        aut.setId(1L);
        aut.setMarca("Renault");
        aut.setModelo("Duster");

        List<Propietario> listaPropietarios = new ArrayList<Propietario>();
        
        Propietario prop1 = new Propietario(35L, "Lusiana", "de paula");
        Propietario prop2 = new Propietario(25L, "Salim", "David");
        
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        
        aut.setListaPropietario(listaPropietarios);
        
        System.out.println("El auto" + aut.getMarca() + "" + aut.getModelo() + " tiene como "
                + "propietarios a: " + aut.getListaPropietario().toString());
    }
}
