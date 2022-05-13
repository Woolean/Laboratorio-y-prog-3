package com.company;

public class Instrumento{

    private double precio;
    private String marca;

    public Instrumento(String marca) {
        this.marca = marca;
    }

    public Instrumento(String marca, double precio){
        this.marca = marca;
        this.precio = precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public void actualizarPrecios(double aumento){
        System.out.println("Precio anterior: $" + getPrecio());
        this.setPrecio(precio + (precio*aumento/100));
        System.out.println("Precio nuevo: $" + getPrecio());
        //return precio;
    }

}
