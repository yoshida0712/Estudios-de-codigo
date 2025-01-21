
package Herencia;

public class Herencia2 {
    public static void main (String[] args){
        Persona vector [] = new Persona [5];
        vector [0] = new Empleado();
        vector [1] = new Persona();
        vector [1] = new Consultor();
        vector [1] = new Jefe();
        
        Persona perso = new Persona();
        Consultor consul = new Consultor();
        
        perso = consul;        
        
    }
}
