
package POO;

public class sobrescritura {
    private int id_animal;
    private String descripcion;
    
    //contructores
    
    //metodos getters y setters
    
    //otros metodos
    
    /*
    La forma en que java diferencia entre cada uno de las funciones para poder es a traves de los parametros que recibe, y como tal 
    llama a la funcion que tiene los mismo parametros
    */
    //solo imprime ya que no recibe nada
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
    //solo imprime si es que recibe un dato en la variable nombreAnimal
    public void hacerSonido(String nombreAnimal){
        System.out.println("El animal " + nombreAnimal + " hace un sonido");
    }
    //solo imprime si es que recibe un dato en la variable nombreAnimal y un dato en la variable tipoSonido
    public void hacerSonido(String nombreAnimal, String tipoSonido){
        System.out.println("El animal " + nombreAnimal + " hace un sonido tipo " + tipoSonido);
    }
}
