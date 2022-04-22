package com.company;

public class Main {

    public static void main(String[] args) {

        Figura circulo = new Circulo("Amarillo", 30);
        Figura rectangulo = new Rectangulo("Rojo", 10, 5);
        Figura cuadrado = new Cuadrado("Violeta", 56);

        circulo.mostrarFigura();
        rectangulo.mostrarFigura();
        cuadrado.mostrarFigura();

    }
}
