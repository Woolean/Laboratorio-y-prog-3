package com.company;

public class Cliente {

    public String nombre, direccion, telefono;

    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString(){
        return "== Cliente ==" +
                "Nombre: " + this.nombre +
                "Dirección: " + this.direccion +
                "Telefono: " + this.telefono;
    }
}
