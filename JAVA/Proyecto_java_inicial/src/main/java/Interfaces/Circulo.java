
package Interfaces;

//esta inplementando multiples 
public class Circulo implements figura, Dibujable, Rotable {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("rotando un circulo");
    }
}
