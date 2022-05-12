package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cancion> canciones = new ArrayList<>();
        ArrayList<Artista> artistas = new ArrayList<>();
        ArrayList<Album> albumes = new ArrayList<>();

        //int añoNacArt, añoAlbum, duracionCanc; //Para agregar canciones, su banda y su album desde cero
        //String nombreBanda, nacion, titAlbum, nombreCanc, genero;
        String cancionABuscar;//para guardar el título de la cancion que se quiere agregar a la playlist
        String opcion = "s", opcionMenu = "s"; //Para salir del do-while en la busqueda de canciones
        int opcionSwitch, opcionPremium = 0; //Opcion para elegir en el menú

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
        ListaPremium premiumPlaylist = null; //Creo la lista premium vacía, sin nombre
        //System.out.println(playlist.reproducir());

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

        //Menu común
        do {
            Scanner scc = new Scanner(System.in);
            System.out.println("""
                    === Menu:\s
                    1- Ver cancion en reproducción.\s
                    2- Agregar una canción.
                    3- Mostrar toda la lista.
                    4- Eliminar canción de la lista.
                    5- Pasar al paquete Premium.
                    0- Salir del programa.
                    """);
            System.out.print("Opcion: ");
            opcionSwitch = scc.nextInt();
            System.out.println("=============");

            switch (opcionSwitch) {
                case 1:
                    System.out.println(playlist.reproducir());
                    break;
                case 2:
                    do {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Canción a agregar: ");
                        cancionABuscar = sc.nextLine();
                        playlist.añadirCancion(cancionABuscar, canciones);
                        System.out.println("Agregar otra? s/n");
                        opcion = sc.nextLine();
                    } while (!Objects.equals(opcion, "n"));
                    break;
                case 3:
                    playlist.verMiLista();
                    break;
                case 4:
                    playlist.eliminarCancion();
                    break;
                case 5:
                    premiumPlaylist = new ListaPremium("Lista Premium"); //Si quiero crear la lista premium, le pongo un nombre
                    System.out.println("Gracias por crear una lista Premium!");
                    opcionSwitch = 0;
                    break;
                case 0:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("La opción no existe");
            }

        } while (!Objects.equals(opcionSwitch, 0));

        if (premiumPlaylist != null) { //Compruebo que la lista premium fue creada con nombre, si no tiene nombre no entra en el if
            do {
                Scanner scannerPremium = new Scanner(System.in);
                System.out.println("""
                    === Menu Premium! ===:\s
                    1- Ver cancion en reproducción.\s
                    2- Agregar una canción.
                    3- Mostrar toda la lista.
                    4- Eliminar canción de la lista.
                    5- Pasar al paquete Premium.
                    0- Salir del programa.
                    """);
                System.out.print("Opcion: ");
                opcionPremium = scannerPremium.nextInt();
                System.out.println("=============");

                switch (opcionPremium) {
                    case 1:
                        premiumPlaylist.reproducir();
                        break;
                    case 2:
                        do {
                            Scanner scPremium = new Scanner(System.in);
                            System.out.println("Canción a agregar: ");
                            cancionABuscar = scPremium.nextLine();
                            playlist.añadirCancion(cancionABuscar, canciones);
                            System.out.println("Agregar otra? s/n");
                            opcion = scPremium.nextLine();
                        } while (!Objects.equals(opcion, "n"));
                        break;
                    case 3:
                        premiumPlaylist.verMiLista();
                        break;
                    case 4:

                }

            }while (!Objects.equals(opcionPremium, 0));
        }
    }
}
