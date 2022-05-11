package com.company;

public class Artista {

    private String nombre, nacionalidad;
    private int añoNacimiento;

    public Artista(String nombre, String nacionalidad, int añoNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.añoNacimiento = añoNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return añoNacimiento;
    }

    @Override
    public String toString() {
        return "====== Artista: " + nombre +
                " - Nacionalidad: " + nacionalidad +
                " - Año de Nacimiento: " + añoNacimiento;
    }
}
