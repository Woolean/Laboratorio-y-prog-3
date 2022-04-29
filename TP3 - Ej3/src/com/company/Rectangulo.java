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
        System.out.println("==== Rectangulo: "+ "\n" +
                "Alto: " + this.getAlto() + "\n" +
                "Largo: " + this.getLargo() + "\n" +
                "Area: " + this.getArea() + "\n" +
                "Perimetro: " + this.getPerimetro() + "\n" +
                "Color: " + this.getColor());
    }
}
