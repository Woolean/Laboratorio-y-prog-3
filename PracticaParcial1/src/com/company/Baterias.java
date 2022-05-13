package com.company;

public class Baterias extends Instrumento{

    private int tambores;
    private int platillos;
    private static final double precioTamb = 3000;
    private static final double precioPlat = 2500;

    public Baterias(String marca, int platillos, int tambores) {
        super(marca);
        if(tambores >= 5){
            this.tambores = 5;
        } else if(tambores <= 1) {
            this.tambores = 1;
        } else {
            this.tambores = tambores;
        }

        if(platillos <= 3) {
            this.platillos = 3;
        } else {
            this.platillos = platillos;
        }

        this.setPrecio(platillos*precioPlat + tambores*precioTamb);
    }

    @Override
    public String toString() {
        return "Baterias{" +
                ", Marca: " + getMarca() +
                ", platillos=" + platillos +
                ", tambores=" + tambores +
                ", precio: " + getPrecio() +
                '}'+ "\n";
    }
}
