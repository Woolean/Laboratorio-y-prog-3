package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Clase y lista de películas en stock
        List <Film> films = new ArrayList<>();
        Film f1 = new Film("Godzilla", Audiencia.PG13 , "Japón", "Monstruo gigante", Genero.AVENTURA, 1954, 100, 2);
        Film f2 = new Film("Godzilla Raids Again", Audiencia.PG13, "Japón", "Monstruo gigante de nuevo", Genero.ACCION, 1955, 82, 3);
        Film f3 = new Film("Godzilla vs King Kong", Audiencia.PG13, "Japón", "Lagarto vs Mono", Genero.ACCION, 1962, 98, 1);
        films.add(f1);
        films.add(f2);
        films.add(f3);

        //lista de clientes
        List <Cliente> clientes = new ArrayList<>();
        Cliente c1 = new Cliente("Pedro Lopez", "Calle Bolaso 302", "4555555");
        Cliente c2 = new Cliente("Juan Perez", "Calle Mentira 333", "4338855");
        Cliente c3 = new Cliente("José Rodriguez", "Calle Falsa 123", "4691212");
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        //Videostore que se encarga de hacer todos los metodos y transacciones
        VideoStore tienda = new VideoStore(films, clientes);

        //nuevo alquiler
        Alquiler a1 = tienda.alquilarFilm("Godzilla", "Pedro Lopez");
        Alquiler a2 = tienda.alquilarFilm("Godzilla Raids Again", "Pedro Lopez");
        tienda.mostrarAlquileres();
        tienda.mostrarAlquileresCliente("Pedro Lopez");

    }
}
