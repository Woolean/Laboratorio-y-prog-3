package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.Stack;

public class ListaBasica implements Reproduccion {

    private String nombre;
    private Stack<Cancion> miLista = new Stack<Cancion>();

    //nombrar la lista
    public ListaBasica(String nombre) {
        this.nombre = nombre;
    }

    //Ver tope de stack
    @Override
    public Object reproducir() {
        if (!miLista.empty()) {
            return miLista.peek();
        } else {
            return "La lista está vacía";
        }
    }

    @Override
    public void añadirCancion(String nueva, ArrayList<Cancion> canciones) {
        miLista.push((Cancion) buscarCancion(nueva, canciones));
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
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void verMiLista() {

        Stack<Cancion> aux = new Stack<>();

        for (int i = 0; i < miLista.size(); i++) {
            if (!miLista.empty()) {
                System.out.println(miLista.peek());
                aux.push(miLista.pop());
            }
        }

        for (int i = 0; i < aux.size(); i++) {
            if (!miLista.empty()) {
                System.out.println(miLista.peek());
                miLista.push(aux.pop());
            }
        }

    }
}
