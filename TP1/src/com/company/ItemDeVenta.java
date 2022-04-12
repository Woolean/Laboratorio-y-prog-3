package com.company;

public class ItemDeVenta {

    private int cantidad;
    private String id, descripcion;
    private float precio;

    public void setItem(String id, int cantidad, String descripcion, float precio) {
        this.id = id;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    //Getters
    public String getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public float getPrecioTotal(int cantidad){
        return precio*cantidad;
    }

    //Printear
    public void mostrarItems(){
        System.out.println("Item Venta [ID: " + id + ", descripción: " + descripcion + ", Cantidad: " + cantidad + ", Precio Unitario: $" + precio + ", Precio Total: $" + getPrecioTotal(cantidad) + "] ");
    }
}
