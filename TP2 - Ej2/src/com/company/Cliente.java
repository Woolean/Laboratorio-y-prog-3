package com.company;

import java.util.UUID;

public class Cliente {

    private String nombre, email;
    private float descuento;
    UUID id = UUID.randomUUID();

    //Setters
    public void setCliente(String nombre, String email, float descuento) {
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    //Getters
    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public float getDescuento() {
        return descuento;
    }

    //printear
    public void mostrarCliente() {
        System.out.println("Nombre: " + this.nombre + ", Email: " + this.email + ", ID: " + this.id + ", Descuento: " + this.descuento);
    }
}
