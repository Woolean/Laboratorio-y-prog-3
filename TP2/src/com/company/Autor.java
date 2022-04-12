package com.company;

public class Autor {

    private String nombre, apellido, email;
    private char genero;

    //setter
    public void setAutor(String nombre, String apellido, String email, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    //Getter
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public char getGenero() {
        return genero;
    }

    //printear
    public void mostrarAutor() {
        System.out.println(this.nombre + " " + this.apellido + " - Email: " + this.email + " - Genero: " + this.genero);
    }
}
