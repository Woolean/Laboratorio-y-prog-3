package com.company;

import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {

    private String cliente;
    private float monto, montoFinal;
    UUID id = UUID.randomUUID();
    LocalDateTime fecha = LocalDateTime.now();

    //Setters
    public void setFactura(String cliente, float monto, float descuento) {
        this.cliente = cliente;
        this.monto = monto;
        this.montoFinal = monto - monto*(descuento/100);
    }

    //Getters
    public UUID getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public float getMonto() {
        return monto;
    }

    //Metodo para aplicar descuento
    public float getMontoFinal(float descuento){
        return monto - monto*(descuento/100);
    }

    //printear
    public void mostrarFactura(Cliente cliente){
        System.out.println("Factura: [ID: " + this.id + ", fecha: " + this.fecha + ", monto: $" + this.monto + ", monto Descuento: $" + this.montoFinal);
        System.out.println("Cliente: [ID: " + cliente.getId() + ", nombre: " + cliente.getNombre() + ", email: " + cliente.getEmail() + ", descuento: " + cliente.getDescuento() + "%] ");
    }
}
