package com.company;

public abstract class Figura {

    protected String color = "Azul";

    public Figura() {
    }

    public Figura(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public abstract double getArea();
    public abstract double getPerimetro();
    public abstract void mostrarFigura();

}
