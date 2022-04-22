package com.company;

public class Rectangulo extends Figura {

    private double alto, largo;

    public Rectangulo(String color, double alto, double largo) {
        super(color);
        this.alto = alto;
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public double getLargo() {
        return largo;
    }

    @Override
    public double getArea() {
        return alto*largo;
    }

    @Override
    public double getPerimetro() {
        return 2*(alto+largo);
    }

    @Override
    public void mostrarFigura(){
        System.out.println("==== Rectangulo: ");
        System.out.println("Base: " + this.largo);
        System.out.println("Altura: " + this.alto);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimetro: " + this.getPerimetro());
        System.out.println("Color: " + this.getColor());
    }
}
