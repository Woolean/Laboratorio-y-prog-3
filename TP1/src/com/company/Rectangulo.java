package com.company;

public class Rectangulo {

    private float alto;
    private float ancho;

    //Setters
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    //Getters
    public float getAlto() {
        return alto;
    }

    public float getAncho() {
        return ancho;
    }

    //Metodos
    public float getArea() {
        return alto*ancho;
    }

    public float getPerimetro() {
        return 2*alto + 2*ancho;
    }

}
