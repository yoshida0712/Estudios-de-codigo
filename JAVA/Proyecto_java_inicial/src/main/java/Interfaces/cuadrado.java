/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author TIRESIA
 */
public class cuadrado implements figura,Dibujable {

    private double lado;

    public cuadrado(double lado) {
        this.lado = lado;
    }    
    
    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un cuadrado");
    }
    
}