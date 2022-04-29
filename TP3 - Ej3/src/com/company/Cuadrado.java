package com.company;

public class Cuadrado extends Rectangulo {

    public Cuadrado(String color, double lado) {
        super(color, lado, lado);
    }

    @Override
    public void mostrarFigura(){
        System.out.println("==== Cuadrado: "+ "\n" +
                "Lado: " + this.getAlto() + "\n" +
                "Area: " + this.getArea() + "\n" +
                "Perimetro: " + this.getPerimetro() + "\n" +
                "Color: " + this.getColor());
    }
}
