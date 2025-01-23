
package POO.Encapsulamiento;

public class Encapsulamiento {
    public static void main (String[    ]args){
        //protegido, solo se puede usar ya que es clase hija
        Alumno alu = new Alumno ();
        //publico, cualquier otra clase la puede usar
        Alumno alu2 = new Alumno(15,"asta", "credo");
        /*
        privado, no tengo ejemplo, por k me tirar error de una y no deja continuar el codigo
        pero si esta privada ni las clases hija la pueden usar        
        */
        
        
    }

}
