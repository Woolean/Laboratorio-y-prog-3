package com.company;

public class Cuadrado extends Rectangulo {

    public Cuadrado(String color, double lado) {
        super(color, lado, lado);
    }

    @Override
    public void mostrarFigura(){
        System.out.println("==== Cuadrado: ");
        System.out.println("Lado: " + this.getAlto());
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimetro: " + this.getPerimetro());
        System.out.println("Color: " + this.getColor());
    }
}
