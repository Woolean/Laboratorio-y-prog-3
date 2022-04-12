package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        Factura factura1 = new Factura();

        cliente1.setCliente("Carlos Gomez", "carlos@email.com", 100);
        //cliente1.mostrarCliente();

        factura1.setFactura(cliente1.getNombre(), 578, cliente1.getDescuento());
        factura1.mostrarFactura(cliente1);

    }
}
