package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class VideoStore {

    private List<Film> films;
    private List<Cliente> clientes;
    List<Alquiler> alquileres = new ArrayList<Alquiler>();

    public VideoStore(List<Film> films, List<Cliente> clientes) {
        this.films = films;
        this.clientes = clientes;
    }

    public List<Film> getFilms() {
        return films;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    //metodos
    public Film buscarFilm(String titulo) {

        for (Film film : films) {
            if (film != null && film.getTitulo().equalsIgnoreCase(titulo)) {
                return film;
            }
        }

        System.out.println("La película no existe en la base de datos.");
        return null;
    }

    public void agregarCliente(){
        Scanner dato = new Scanner(System.in);
        System.out.println("=== Nuevo Cliente ===");
        System.out.println("Nombre: ");
        String nombre = dato.nextLine();
        System.out.println("Dirección: ");
        String direccion = dato.nextLine();
        System.out.println("Telefono: ");
        String telefono = dato.nextLine();
        Cliente cliente = new Cliente(nombre,direccion,telefono);
        clientes.add(cliente);
    }

    public Cliente buscarCliente(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente != null && cliente.getNombre().equalsIgnoreCase(nombre))
                return cliente;
        }

        System.out.println("El cliente no existe.");
        agregarCliente();
        return clientes.get(clientes.size() - 1);
    }

    public Alquiler alquilarFilm(String pelicula, String nombreCliente){

        Film film = buscarFilm(pelicula);
        Cliente cliente = buscarCliente(nombreCliente);

        if (film != null && cliente != null) {
            film.setStock(film.getStock() - 1);
            Alquiler alquiler = new Alquiler(film, cliente, LocalDate.now());
            alquileres.add(alquiler);
            return alquiler;
        }

        return null;
    }

    public void mostrarAlquileres(){
        for (Alquiler alquiler : alquileres) {
            System.out.println(alquiler);
        }
    }

    public void mostrarAlquileresCliente(String cliente){
        for (Alquiler alquiler : alquileres) {
            if (Objects.equals(cliente, alquiler.getCliente().getNombre())) {
                System.out.println(alquiler);
            }
        }
    }

}
