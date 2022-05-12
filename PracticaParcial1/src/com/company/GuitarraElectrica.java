package com.company;

public class GuitarraElectrica extends Instrumento implements Sonido{

    private int cantCuerdas = 6;

    public GuitarraElectrica(String marca, double precio) {
        super(marca, precio);
    }

    @Override
    public String toString() {
        return "Guitarra Electrica {" +
                " Marca: " + getMarca() +
                ", Precio: $" + getPrecio() +
                ", cantidad de cuerdas= " + cantCuerdas +
                '}' + "\n";
    }

    @Override
    public String sonidoAmplificado() {
        return "Guitarra Eléctrica: SONIDO AMPLIFICADO";
    }
}
