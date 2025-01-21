
package Herencia;

public class Herencia {
    
    public static void main (String[] args){
        Empleado emple = new Empleado();
        /*
        gracias al hecho de que empleado de que recibe los atributos de persona, se pueden llamar como si fueran el mismo
        */
        //heredado de persona
        emple.getDomicilio();
        //propio de empleado
        emple.getCargo();
        
        Consultor consul = new Consultor();
        //heredado de persona
        consul.getDomicilio();
        //propio de consultor
        consul.getNombe_consultora();
        
        
        
        
    }
    
}
