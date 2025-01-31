
package Relaciones;

import java.util.List;

public class Auto {
    private long id;
    private String marca;
    private String modelo;

    //relacion 1 a 1, se agrega a cualquiera de los 2, la k tenga mas sentido que tenga el objeto del otro, en otras palabras, esto es subjetivo, y tambien
    //dependera del sistema que estemos creando, ejemplo: si es un sistema es un garage, tiene sentido agregarle el objeto a el auto, por que
    //necesitamos saber quien es el dueño de cada auto, por que el que importa es el auto, por que es el "cliente"
    //private Propietario prop;
    
    
//relacion 1 a N,  desde el lado del 1 al lado de la N, se establece una collections, para permitir que el objeto el de 1, tengo una coleccion de objetos

    private List<Propietario> listaPropietario;
    
    
    //se agregan los constructores
    
    
    
    
    public Auto() {
    }

    public Auto(long id, String marca, String modelo, List<Propietario> listaPropietario) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietario = listaPropietario;
    }

    public List<Propietario> getListaPropietario() {
        return listaPropietario;
    }

    public void setListaPropietario(List<Propietario> listaPropietario) {
        this.listaPropietario = listaPropietario;
    }    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
