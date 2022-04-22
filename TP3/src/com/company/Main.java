package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 1
        /*Circulo circulo1 = new Circulo(3, "azul");
        circulo1.mostrar();

        Cilindro cilindro1 = new Cilindro(3, "verde", 30);
        cilindro1.mostrar();*/

        //Ejercicio 2
        int e = 0;
        int s = 0;
        double ingresoTotal=0;
        Persona e1 = new Estudiante("Julián", "Coronel", "julianmacoronel@gmail.com", "9 de julio 3954", "37983263", "Programación", 3000.0, 2020);
        Persona e2 = new Estudiante("Pepe", "Perez", "pepito@gmail.com", "blabla 39", "44332233", "Ingenieria Naval", 6000.0, 2021);
        Persona e3 = new Estudiante("Maria", "Gonzales", "marygon@gmail.com", "3 de febrero 3002", "44321233", "Que se yo amig", 4552.0, 2022);
        Persona e4 = new Estudiante("Juan Domingo", "Peron", "vivaPeron@gmail.com", "Piopi 9499", "12334456", "Algo", 4399.94, 2019);
        Persona s1 = new Staff("Carlos", "Gomez", "carlosgomes@gmail.com", "Luro 39929", "4949494949", "Noche", 100000);
        Persona s2 = new Staff("Ringo", "Starr", "ringo@gmail.com", "Liverpool 392", "44919292", "Mañana", 433212);
        Persona s3 = new Staff("John", "Lennon", "JohnnyL@gmail.com", "Strawberry fields 44", "443322334", "Noche", 59000.55);
        Persona s4 = new Staff("George", "Harrison", "Bluejayway@gmail.com", "Independencia 4990", "98393912", "Mañana", 1111111);

        ArrayList <Persona> personas = new ArrayList<>();
        personas.add(e1);
        personas.add(e2);
        personas.add(e3);
        personas.add(e4);
        personas.add(s1);
        personas.add(s2);
        personas.add(s3);
        personas.add(s4);

        for (int i = 0; i < personas.size(); i++) {
            personas.get(i).mostrar();
            if (personas.get(i) instanceof Estudiante) {
                e++;
                ingresoTotal += ((Estudiante) personas.get(i)).getCuota();
            } else {
                s++;
            }
        }

        System.out.println("Cantidad de Staff: " + s);
        System.out.println("Cantidad de Estudiantes: " + e);
        System.out.println("Total de Ingresos de la institución: $" + ingresoTotal);

    }
}
