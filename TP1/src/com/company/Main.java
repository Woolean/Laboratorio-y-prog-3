package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Rectangulo miRectangulo = new Rectangulo(); //Ejercicio 1
        Empleado empleado1 = new Empleado(); //Ejercicio 2
        Empleado empleado2 = new Empleado();
        ItemDeVenta item1 = new ItemDeVenta(); //Ejercicio 3
        CuentaBanco cuenta1 = new CuentaBanco(); //Ejercicio 4
        Hora hora = new Hora(); //Ejercicio 5
        Scanner scan = new Scanner(System.in);
        float valor;

        //Ejercicio 1
        /*miRectangulo.setAlto(3);
        miRectangulo.setAncho(5);

        System.out.println("Alto: " + miRectangulo.getAlto());
        System.out.println("Ancho: " + miRectangulo.getAncho());
        System.out.println("Perimetro: " + miRectangulo.getPerimetro());
        System.out.println("Area: " + miRectangulo.getArea());

        System.out.print("Ingresar nuevo valor para el alto: ");
        valor = scan.nextFloat();
        miRectangulo.setAlto(valor);

        System.out.print("Ingresar nuevo valor para el ancho: ");
        valor = scan.nextFloat();
        miRectangulo.setAncho(valor);

        System.out.println("Nuevos valores: ");
        System.out.println("Alto: " + miRectangulo.getAlto());
        System.out.println("Ancho: " + miRectangulo.getAncho());
        System.out.println("Perimetro: " + miRectangulo.getPerimetro());
        System.out.println("Area: " + miRectangulo.getArea());*/

        //Ejercicio 2
        /*empleado1.setEmpleado("23456345", "Carlos", "Gutierrez", 25000.00f);
        empleado2.setEmpleado("34234123", "Ana", "Sánchez", 27500.00f);
        empleado1.mostrarEmpleado();
        empleado2.mostrarEmpleado();
        empleado1.AumentarSalario(15.00f);
        empleado1.mostrarEmpleado();*/

        //Ejercicio 3
        /*item1.setItem("49993", 30, "Pelotas", 20.4f);
        item1.mostrarItems();*/

        //Ejercicio 4
        /*cuenta1.setCuentaBanco("392", "Carlitos", 15000.0f);
        cuenta1.mostrarCuenta();
        cuenta1.credito(2500);
        cuenta1.mostrarCuenta();
        cuenta1.debito(1500);
        cuenta1.mostrarCuenta();
        cuenta1.debito(17000);
        cuenta1.mostrarCuenta();*/

        //Ejercicio 5
        hora.setHorario(23, 59, 59);
        System.out.println(hora.toString());
        hora.avanzarSegundo();
        System.out.println(hora.toString());
        hora.retrocederSegundo();
        System.out.println(hora.toString());
    }
}
