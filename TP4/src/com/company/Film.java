package com.company;

public class Film {

    private String titulo, clasificacion, pais, descripcion, genero;
    private int año, duracion, stock;

    public Film(String titulo, String clasificacion, String pais, String descripcion, String genero, int año, int duracion, int stock) {
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.pais = pais;
        this.descripcion = descripcion;
        this.genero = genero;
        this.año = año;
        this.duracion = duracion;
        this.stock = stock;
    }

    public void setStock(int stockActual){
        this.stock = stockActual;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getPais() {
        return pais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public int getAño() {
        return año;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString(){
        return "== Film ==" + "\n" +
                " Duracion: " + this.duracion +
                ", stock: " + this.stock +
                ", clasificacion: '" + this.clasificacion + '\'' +
                ", titulo: '" + this.titulo + '\'' +
                ", fechaLanzamiento: " + this.año +
                ", genero: " + this.genero;
    }
}
