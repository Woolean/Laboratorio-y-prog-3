package com.company;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        Autor autor1 = new Autor();
        Autor autor2 = new Autor();
        Autor autor3 = new Autor();

        autor1.setAutor("Joshua", "Bloch", "joshua@email.com", 'M');
        autor2.setAutor("Jorge Luis", "Borges", "jorgito@email.com", 'M');
        autor3.setAutor("Carlos", "Verga Mota", "elpijas@hotmail.com", 'F');
        //autor1.mostrarAutor();
        libro1.setLibro(autor1, "Effective Java", 150, 450);
        libro1.agregarAutor(autor2);
        libro1.agregarAutor(autor3);
        //libro1.mostrarLibro();
        //libro1.modificarPrecio(500);
        //libro1.modificarStock(50);
        //libro1.autores.get(0).mostrarAutor();
        libro1.mostrarLibro();
    }
}
