package com.company;

public class Cilindro extends Circulo {

    private double altura = 1.0;

    public Cilindro() {
        super();
    }

    public Cilindro(double radio, String color, float altura) {
        super(radio, color);
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    //Método

    @Override
    public double area(){
        return (2*Math.PI * getRadio() * altura + 2*super.area());
    }

    public double volumen() {
        return area()*altura;
    }

    @Override
    public void mostrar() {
        System.out.println("Color: " + this.getColor() + ", radio: " + this.getRadio() + ", Area: " + this.area() + ", volumen: " + this.volumen());
    }
}
