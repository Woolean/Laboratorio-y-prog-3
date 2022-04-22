package com.company;

public class Persona {

    private String nombre, apellido, email, direccion, dni;

    public Persona(String nombre, String apellido, String email, String direccion, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.dni = dni;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDni() {
        return dni;
    }

    //printear
    public void mostrar() {
        System.out.println("Nombre y apellido: " + this.nombre + " " + this.apellido + ", Email: " + this.email+", Dirección: "+this.direccion+", DNI: "+this.dni);
    }

}
