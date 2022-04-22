package com.company;

public class Circulo extends Figura {

    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double getArea() {
        return Math.PI * (radio*radio);
    }

    @Override
    public double getPerimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public void mostrarFigura() {
        System.out.println("==== Circulo: ");
        System.out.println("Radio: " + this.radio);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimetro: " + this.getPerimetro());
        System.out.println("Color: " + this.getColor());
    }
}
