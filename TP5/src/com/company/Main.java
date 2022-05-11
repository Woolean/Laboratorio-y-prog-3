package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cancion> canciones = new ArrayList<>();
        ArrayList<Artista> artistas = new ArrayList<>();
        ArrayList<Album> albumes = new ArrayList<>();

        //int añoNacArt, añoAlbum, duracionCanc; //Para agregar canciones, su banda y su album desde cero
        //String nombreBanda, nacion, titAlbum, nombreCanc, genero;
        String cancionABuscar; //para guardar el título de la cancion que se quiere agregar a la playlist

        Artista art1 = new Artista("The Beatles", "Inglaterra", 1960);
        Artista art2 = new Artista("Ghost", "Suecia", 2008);
        Artista art3 = new Artista("Weather Report", "Estados Unidos", 1970);

        artistas.add(art1);
        artistas.add(art2);

        Album a1 = new Album("Abbey Road", art1, 1969);
        Album a2 = new Album("Meliora", art2, 2015);
        Album a3 = new Album("Heavy Weather", art3, 1977);

        albumes.add(a1);
        albumes.add(a2);

        Cancion c1 = new Cancion("Come Together", GENERO.ROCK, 252, a1, art1);
        Cancion c2 = new Cancion("Something", GENERO.ROCK, 181, a1, art1);
        Cancion c3 = new Cancion("Maxwell's Silver Hammer", GENERO.ROCK, 196, a1, art1);
        Cancion c4 = new Cancion("Oh Darling", GENERO.ROCK, 195, a1, art1);
        Cancion c5 = new Cancion("Octopus's Garden", GENERO.ROCK, 150, a1, art1);
        Cancion c6 = new Cancion("I Want You (She's so Heavy)", GENERO.ROCK, 448, a1, art1);
        Cancion c7 = new Cancion("Spirit", GENERO.METAL, 309, a2, art2);
        Cancion c8 = new Cancion("Cirice", GENERO.METAL, 361, a2, art2);
        Cancion c9 = new Cancion("Birdland", GENERO.JAZZ, 356, a3, art3);

        canciones.add(c1);
        canciones.add(c2);
        canciones.add(c3);
        canciones.add(c4);
        canciones.add(c5);
        canciones.add(c6);
        canciones.add(c7);
        canciones.add(c8);
        canciones.add(c9);

        //System.out.println(canciones);
        ListaBasica playlist = new ListaBasica("playlist");
        System.out.println(playlist.reproducir());

        //Agregar una canción entera (malinterpreté un ejercicio)
        /*Scanner sc = new Scanner(System.in);
        Scanner i = new Scanner(System.in);
        System.out.println("Agregar una cancion \n");
        System.out.println("Nombre del artista: ");
        nombreBanda = sc.nextLine();
        System.out.println("País del artista: ");
        nacion = sc.nextLine();
        System.out.println("Año de formacion del artista: ");
        añoNacArt = i.nextInt();
        Artista artNuevo = new Artista(nombreBanda, nacion, añoNacArt);

        System.out.println("Nombre del album: ");
        titAlbum = sc.nextLine();
        System.out.println("Año del album: ");
        añoAlbum = i.nextInt();
        Album albNuevo = new Album(titAlbum, artNuevo, añoAlbum);

        System.out.println("Nombre de la cancion: ");
        nombreCanc = sc.nextLine();
        System.out.println("Duracion: ");
        duracionCanc = i.nextInt();
        System.out.println("Genero: ");
        genero = sc.nextLine();
        Cancion cancNueva = new Cancion(nombreCanc, genero, duracionCanc, albNuevo, artNuevo);
        playlist.añadirCancion(cancNueva);
        System.out.println(playlist.reproducir());*/

        //Añadir una canción de la lista
        Scanner sc = new Scanner(System.in);
        System.out.println("Canción a buscar: ");
        cancionABuscar = sc.nextLine();
        playlist.añadirCancion(cancionABuscar, canciones);
        System.out.println(playlist.reproducir());

    }
}
