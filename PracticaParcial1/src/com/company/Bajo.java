package com.company;

public class Bajo extends Instrumento implements Sonido{

    private int cantCuerdas = 4;

    public Bajo(String marca, double precio) {
        super(marca, precio);
    }

    @Override
    public String toString() {
        return "Bajo {" +
                " Marca: " + getMarca() +
                ", Precio: $" + getPrecio() +
                ", cantidad de cuerdas= " + cantCuerdas +
                '}' + "\n";
    }

    @Override
    public String sonidoAmplificado() {
        return "Bajo: SONIDO AMPLIFICADO";
    }

}
