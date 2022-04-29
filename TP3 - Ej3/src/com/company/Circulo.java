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
        System.out.println("==== Circulo: "+ "\n" +
                "Radio: " + this.getRadio() + "\n" +
                "Area: " + this.getArea() + "\n" +
                "Perimetro: " + this.getPerimetro() + "\n" +
                "Color: " + this.getColor());
    }
}
