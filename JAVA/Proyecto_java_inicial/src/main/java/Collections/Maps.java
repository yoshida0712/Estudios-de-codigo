package Collections;

import java.util.HashMap;
import java.util.Map;


public class Maps {
    public static void main (String[] args){
        Map<Integer, String>  mapaEmpleados = new HashMap<>();
        
        mapaEmpleados.put(1, "ah");
        mapaEmpleados.put(2, "ah2");
        mapaEmpleados.put(3, "ah3");
        mapaEmpleados.put(4, "ah4");
        mapaEmpleados.put(5, "ah5");
        mapaEmpleados.put(6, "ah6");
        
        boolean dato = mapaEmpleados.containsValue("ah");
        
        if (dato==true){
            System.out.println("estoy");
        }
        else {
            System.out.println("no estoy");
        }
        
        System.out.println(mapaEmpleados.values());
        System.out.println(mapaEmpleados.keySet());
        
        String nombre = mapaEmpleados.get(1);
        System.out.println(nombre);
        
        mapaEmpleados.remove(1);
        System.out.println(mapaEmpleados.keySet());
   }
}
