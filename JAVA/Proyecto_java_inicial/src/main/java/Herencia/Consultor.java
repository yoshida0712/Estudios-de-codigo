
package Herencia;

public class Consultor extends Persona{
    
    String nombe_consultora;
    int num_consultar;

    public Consultor() {
    }

    public Consultor(String nombe_consultora, int num_consultar, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombe_consultora = nombe_consultora;
        this.num_consultar = num_consultar;
    }

    public String getNombe_consultora() {
        return nombe_consultora;
    }

    public void setNombe_consultora(String nombe_consultora) {
        this.nombe_consultora = nombe_consultora;
    }

    public int getNum_consultar() {
        return num_consultar;
    }

    public void setNum_consultar(int num_consultar) {
        this.num_consultar = num_consultar;
    }
    
    
    
}
