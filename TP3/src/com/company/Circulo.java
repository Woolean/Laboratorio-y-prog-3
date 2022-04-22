package com.company;

public class Circulo {

    private double radio;
    private String color;

    //Constructor por defecto
    public Circulo(){
        this.radio = 1.0;
        this.color = "rojo";
    }

    //Constructor personalizado
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    //Métodos
    public double area() {
        return (Math.PI*(this.radio*this.radio));
    }

    public void mostrar() {
        System.out.println("Color: " + this.color + ", radio: " + this.radio + ", área: " + area());
    }

}
