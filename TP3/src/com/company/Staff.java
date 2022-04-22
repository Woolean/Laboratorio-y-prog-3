package com.company;

public class Staff extends Persona {

    private double salario;
    private String turno;

    public Staff(String nombre, String apellido, String email, String direccion, String dni, String turno, double salario) {
        super(nombre, apellido, email, direccion, dni);
        this.turno = turno;
        this.salario = salario;
    }

    public double salarioAnual() {
        return salario*12;
    }

    //Getters
    public double getSalario() {
        return salario;
    }

    public String getTurno() {
        return turno;
    }

    //printear


    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("- Turno: "+this.turno+", Salario: $"+this.salario+", Salario anual: $"+salarioAnual());
    }
}
