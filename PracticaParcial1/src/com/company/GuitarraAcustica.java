package com.company;

public class GuitarraAcustica extends Instrumento{

    private int cantCuerdas = 6;
    private String madera;

    public GuitarraAcustica(String marca, double precio, String madera) {
        super(marca, precio);
        this.madera = madera;
    }

    @Override
    public String toString() {
        return "Guitarra Acustica{" +
                "cantCuerdas=" + cantCuerdas +
                ", madera='" + madera + '\'' +
                ", Precio: $" + getPrecio() +
                '}' + "\n";
    }
}
