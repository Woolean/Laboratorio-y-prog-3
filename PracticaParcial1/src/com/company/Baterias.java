package com.company;

public class Baterias extends Instrumento{

    private int tambores, platillos;
    private static double precioTamb = 3000;
    private static double precioPlat = 2500;

    public Baterias(String marca, int platillos, int tambores) {
        super(marca);
        this.platillos = platillos;
        this.tambores = tambores;
        this.setPrecio(platillos*precioPlat + tambores*precioTamb);
    }

    @Override
    public String toString() {
        return "Baterias{" +
                ", Marca: " + getMarca() +
                ", tambores=" + tambores +
                ", platillos=" + platillos +
                ", precio: " + getPrecio() +
                '}'+ "\n";
    }
}
