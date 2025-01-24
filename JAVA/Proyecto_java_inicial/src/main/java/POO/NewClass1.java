
package POO;

public class NewClass1 {
    public static void main(String[] args){
        //usa el constructor vacio para enviar los datos
        NewClass alu1 = new NewClass ();
        //usa el contructor con parametros, y tiene k enviar los mismos parametros en el mismo orden
        NewClass alu2 = new NewClass (5,"Luisina","de Puala");
        
        System.out.println("La id del alumno 1 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
        
        alu1.setId(1);
        alu1.setNombre("DAS");
        alu1.setApellido("CAS");
        
        System.out.println("_________________________");
        System.out.println("La id del alumno 2 es: " + alu1.getId());
        System.out.println("El nombre es: " + alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido());
        
        /*
        Para poder sobre escribir datos ya almacenados en un constructor se puede usar el set para reemplazarlo
        */
        
        alu2.setId(2);
        
        System.out.println("_________________________");
        System.out.println("La id del alumno 1 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
         
    }
}
