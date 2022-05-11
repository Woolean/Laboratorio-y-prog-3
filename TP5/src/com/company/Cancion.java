package com.company;

public class Cancion {

    private String nombre, genero;
    private int duracion;
    private Album album;
    private Artista artista, artistaInvitado;

    public Cancion(String nombre, String genero, int duracion, Album album, Artista artista) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.album = album;
        this.artista = artista;
        this.artistaInvitado = null;
    }

    public Cancion(String nombre, String genero, int duracion, Album album, Artista artista, Artista artistaInvitado) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.album = album;
        this.artista = artista;
        this.artistaInvitado = artistaInvitado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public Album getAlbum() {
        return album;
    }

    public Artista getArtista() {
        return artista;
    }

    public Artista getArtistaInvitado() {
        return artistaInvitado;
    }

    @Override
    public String toString() {
        if (artistaInvitado != null) {
            return "==== Cancion: " + nombre +
                    " - Duracion: " + duracion + "seg. " +
                    " - Artista: " + artista.getNombre() +
                    " - Album: " + album.getTitulo() +
                    " - Genero: " + genero +
                    " - Artista Invitado: " + artistaInvitado.getNombre() + "\n";
        } else {
            return "==== Cancion: " + nombre +
                    " - Duracion: " + duracion + "seg. " +
                    " - Artista: " + artista.getNombre() +
                    " - Album: " + album.getTitulo() +
                    " - Genero: " + genero +
                    "\n";
        }
    }

}
