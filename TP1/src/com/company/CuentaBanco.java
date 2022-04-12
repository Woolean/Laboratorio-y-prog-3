package com.company;

public class CuentaBanco {

    private String id, nombre;
    private float balance;

    //Setter
    public void setCuentaBanco(String id, String nombre, float balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    //Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getBalance() {
        return balance;
    }

    //métodos
    public float credito(float deposito) {
        this.balance += deposito;
        return balance;
    }

    public float debito(float sustraccion) {

        if (balance-sustraccion < 0) {
            System.out.println("El dinero en la cuenta no es suficiente para realizar esta sustracción.");
        } else {
            this.balance -= sustraccion;
        }

        return balance;
    }

    public void mostrarCuenta() {
        System.out.println("Cuenta: [Nombre: " + nombre + ", ID: " + id + ", Balance: $" + balance + "]");
    }
}
