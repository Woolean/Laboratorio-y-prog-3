package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Stack;

public class ListaPremium implements Reproduccion {

    private String nombre;
    private LinkedList<Cancion> miLista = new LinkedList<>();

    public ListaPremium(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public Object reproducir() {
        if (!miLista.isEmpty()) {
            return miLista.peek();
        } else {
            return "La lista está vacía";
        }
    }

    public Cancion buscarCancion(String nombre, ArrayList<Cancion> canciones) {

        for (int i = 0; i < canciones.size(); i++) {
            if (Objects.equals(nombre, canciones.get(i).getNombre()))
                return canciones.get(i);
        }

        System.out.println("La cancion no existe.");
        return null;
    }

    @Override
    public void añadirCancion(String nueva, ArrayList<Cancion> canciones) {
        miLista.push((Cancion) buscarCancion(nueva, canciones));
    }

    @Override
    public void eliminarCancion() {

    }

    @Override
    public void verMiLista() {

        for (int i = 0; i < miLista.size(); i++) {
            System.out.println(miLista.get(i));
        }
    }
}
