package com.jairorozco.modelo;

import java.util.Date;

public class Libro extends Producto implements ILibro, IProducto {
    //atributos
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;
    private double precioVenta;

    //Constructor
    public Libro(Date fechaPublicacion, String autor, String titulo, String editorial, double precioVenta, int precio) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.precioVenta = precioVenta;
    }

    //getters

    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public double getPrecioVenta() {
        return precioVenta;
    }

    @Override
    public String toString(){
        return "Datos Libro: " + "\n"
                + "Fecha de publicación : " + this.getFechaPublicacion() + "\n"
                + "Autor: " + this.getAutor() + "\n"
                + "Título : " + this.getTitulo() + "\n"
                + "Editorial : " + this.getEditorial() + "\n"
                + "Precio Venta : " + this.getPrecioVenta() + "\n";
    }

    public String toString(String personaje){
        return "Datos Comic: " + "\n"
                + personaje
                + "Fecha de publicación : " + this.getFechaPublicacion() + "\n"
                + "Autor: " + this.getAutor() + "\n"
                + "Título : " + this.getTitulo() + "\n"
                + "Editorial : " + this.getEditorial() + "\n"
                + "Precio Venta : " + this.getPrecioVenta() + "\n";
    }
}
