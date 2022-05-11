package com.company;

import java.util.ArrayList;

public interface Reproduccion {

    abstract Object reproducir();
    abstract void añadirCancion(String nueva, ArrayList<Cancion> canciones);
    abstract void eliminarCancion();
    abstract void verMiLista();

}
