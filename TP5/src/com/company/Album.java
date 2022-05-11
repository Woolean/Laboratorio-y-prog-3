package com.company;

public class Album {

    private String titulo;
    private Artista artista;
    private int año;

    public Album(String titulo, Artista artista, int año) {
        this.titulo = titulo;
        this.artista = artista;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public int getAño() {
        return año;
    }

    @Override
    public String toString() {
        return "==== Album: " + titulo +
                " - Artista: " + artista.getNombre() +
                " - Año de Lanzamiento: " + año;
    }
}
