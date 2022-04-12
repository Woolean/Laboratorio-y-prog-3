package com.company;

public class Empleado {

    private String dni, nombre, apellido;
    private float salario;

    public void setEmpleado(String dni, String nombre, String apellido, float salario){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    //Getter
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getSalario() {
        return salario;
    }

    //Métodos
    public float SalarioAnual() {
        return salario*12;
    }

    public void AumentarSalario(float porcentaje) {
        float aumento;

        aumento = (porcentaje/100) * salario;
        this.salario = salario + aumento;
    }

    //printear
    public void mostrarEmpleado() {
        System.out.println("Empleado: DNI= " + dni + ", nombre= " + nombre + ", apellido= " + apellido + ", salario= $" + salario + ".");
    }

}
