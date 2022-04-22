package com.company;

public class Estudiante extends Persona {

    private String carrera;
    private double cuota;
    private int añoDeIngreso;

    public Estudiante(String nombre, String apellido, String email, String direccion, String dni, String carrera, double cuota, int añoDeIngreso) {
        super(nombre, apellido, email, direccion, dni);
        this.carrera = carrera;
        this.cuota = cuota;
        this.añoDeIngreso = añoDeIngreso;
    }

    //Getters
    public String getCarrera() {
        return carrera;
    }

    public double getCuota() {
        return cuota;
    }

    public int getAñoDeIngreso() {
        return añoDeIngreso;
    }

    //printear

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("- Carrera: "+this.carrera+", Año de Ingreso: "+this.añoDeIngreso+", Cuota: $"+this.cuota);
    }
}
