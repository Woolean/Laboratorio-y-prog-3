package com.company;

import java.util.ArrayList;
import java.util.List;

public class Libro {

    List<Autor> autores = new ArrayList<>();
    private String titulo;
    private int stock;
    private float precio;

    //Setter
    public void setLibro(Autor autor, String titulo, int stock, float precio) {
        autores.add(autor);
        this.titulo = titulo;
        this.stock = stock;
        this.precio = precio;
    }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }

    //Getter
    public String getTitulo() {
        return titulo;
    }

    public int getStock() {
        return stock;
    }

    public float getPrecio() {
        return precio;
    }

    //Métodos
    public void modificarPrecio(float nuevo) {
        this.precio = nuevo;
    }

    public void modificarStock(int nuevo) {
        this.stock = nuevo;
    }

    //printear
    public void mostrarLibro() {
        //System.out.println("Nombre: " + this.titulo + ". Autor: " + this.autor.getNombre() + " " + this.autor.getApellido() + ". Stock: " + this.stock + ". Precio: $" + this.precio);
        //System.out.println("El libro, " + this.titulo + " de " + this.autor.getNombre() + " " + this.autor.getApellido() + ". Se vende a $" + this.precio + ". ");
        System.out.printf("El libro, %s, de los autores ", this.titulo);

        for (int i = 0; i<=autores.size() -1 ; i++) {
            System.out.print(autores.get(i).getNombre() + " " + autores.get(i).getApellido() + ", ");
        }

        System.out.printf("se vende a %s pesos.", this.precio);
    }

}
