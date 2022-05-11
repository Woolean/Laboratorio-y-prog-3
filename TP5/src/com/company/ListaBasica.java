package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.Stack;

public class ListaBasica implements Reproduccion{

    private String nombre;
    private Stack<Cancion> miLista = new Stack<Cancion>();

    //apilar stack con la lista de canciones
    public ListaBasica(String nombre) {
        this.nombre = nombre;
    }

    //Ver tope de stack
    @Override
    public Object reproducir() {
        if (!miLista.empty()){
            return miLista.peek();
        } else {
            return "La lista está vacía";
        }
    }

    @Override
    public void añadirCancion(String nueva, ArrayList<Cancion> canciones) {
        miLista.push((Cancion) buscarCancion(nueva,canciones));
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
    public void eliminarCancion() {

    }

    @Override
    public void verMiLista() {

    }
}
