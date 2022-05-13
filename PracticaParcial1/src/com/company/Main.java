package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Instrumento> lista = new ArrayList<>();
        GuitarraElectrica c1 = new GuitarraElectrica("Peavey", 30000);
        GuitarraAcustica c2 = new GuitarraAcustica("Fender", 20000, "Caoba");
        GuitarraElectrica c3 = new GuitarraElectrica("Squire", 40000);
        Baterias b1 = new Baterias("Yamaha", 5, 3);
        Baterias b2 = new Baterias("Pearl", 3, 5);
        Baterias b3 = new Baterias("Pirulo", 5, 0);

        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(b1);
        lista.add(b2);
        lista.add(b3);

        System.out.println(lista.toString());
        System.out.println(c1.sonidoAmplificado());
        System.out.println(c3.sonidoAmplificado());

        for (int i=0; i<lista.size();i++){
            if(lista.get(i) instanceof GuitarraElectrica){
                lista.get(i).actualizarPrecios(5);
            } else if (lista.get(i) instanceof GuitarraAcustica) {
                lista.get(i).actualizarPrecios(10);
            } else if (lista.get(i) instanceof Baterias) {
                lista.get(i).actualizarPrecios(15);
            } else {
                lista.get(i).actualizarPrecios(20);
            }
        }

    }
}
