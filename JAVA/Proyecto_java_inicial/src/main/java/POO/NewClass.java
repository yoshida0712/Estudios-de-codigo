
package POO;

public class NewClass {
    /*
    objeto alumno
    variables globales, usadas en general
    */    
    int id;
    String nombre;
    String apellido;        
    /*
    procedimiento al no devolver algo
    el nombre "mostrarNombre" es asi por k la primera palabra siempre inicia en minuscula, y las palabras que le sigan siempre son en 
    mayuscula
    */
    public void mostrarNombre(){
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }
    /*
    funcion al retornar un valor
    */    
    public void saberAprovado (double calificacion){
        if ( calificacion >= 6){
            System.out.println("Aprobé la materia");
        }
        else {
            System.out.println("No aprobé");
        }
    }
    /*
        contructores    atajo alt + insert
    */    
    /*
    contructor vacio
    se utiliza mas k todo cuando no se tienen los datos aun, y se usans mas adelante
    */
    public NewClass() {
        
    }
    /*
    constructor con parametros
    variables locales, solo usadas dentro del constructor 
    */
    public NewClass(int id, String nombre, String apellido) {        
        /*
        toma los datos recividos de las variables globales, y los iguales con los locales
        colocandolos para uso posterior
        */
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    /*
    gettes y setters
    se pueden colocar con los contructores vacios
    get toma los valores guardados y los reenvia y set los coloca y los guarda
    */

    public int getId() {
        return id; 
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
