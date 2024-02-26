package com.example;

import javafx.scene.image.ImageView;


public final class Cuento {

    private String titulo;
    private String descripcion;

    private String[] mensaje;

    private ImageView[] imagenes;

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    enum Tipo{
        TERROR,ROMANTICA,INFANTIL
    }
    private Tipo tipo;


    public Cuento(String titulo, String descripcion, String[] mensaje, ImageView[] imagenes, Tipo tipo) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.mensaje = mensaje;
        this.imagenes = imagenes;
        this.tipo = tipo;
    }

    public Cuento(String titulo) {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String[] getMensaje() {
        return mensaje;
    }

    public void setMensaje(String[] mensaje) {
        this.mensaje = mensaje;
    }

    public ImageView[] getImagenes() {
        return imagenes;
    }

    public void setImagenes(ImageView[] imagenes) {
        this.imagenes = imagenes;
    }
}
