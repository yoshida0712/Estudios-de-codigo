package anfiteatro.logica;

import java.util.Date;

public class ticket {    

    private int numero;
    private int fila;
    private int asiento;
    private double precio;
    private Date fechaCompra;
    private Date fechaValidez;

    public ticket() {

    }

    public ticket(int numero, int fila, int asiento, double precio, Date fechaCompra, Date fechaValidez) {
        this.numero = numero;
        this.fila = fila;
        this.asiento = asiento;
        this.precio = precio;
        this.fechaCompra = fechaCompra;
        this.fechaValidez = fechaValidez;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }
    
    public void setFila(int fila) {

        this.fila = fila;
    }

    public int getFila() {

        return fila;
    }

    public void setAsiento(int asiento) {

        this.asiento = asiento;
    }

    public void setPrecio(double precio) {

        this.precio = precio;
    }

    public double getPrecio() {

        return precio;
    }

    public void setFechaCompra(Date fechaCompra) {

        this.fechaCompra = fechaCompra;
    }

    public void setFechaValidez(Date fechaValidez) {

        this.fechaValidez = fechaValidez;
    }
    
    @Override
    public String toString() {
        return "ticket{" + "numero=" + numero + ", fila=" + fila + ", asiento=" + asiento + ", precio=" + precio + ", fechaCompra=" + fechaCompra + ", fechaValidez=" + fechaValidez + '}';
    }
}
