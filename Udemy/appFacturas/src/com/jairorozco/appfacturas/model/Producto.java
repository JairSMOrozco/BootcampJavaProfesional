package com.jairorozco.appfacturas.model;

public class Producto {
    //Atributos
    private int codigo;
    private String nombre;
    private float precio;
    private static int ULTIMO_CODIGO;

    //Constructor
    public Producto() {
        this.codigo = ++ULTIMO_CODIGO;
    }

    //Getters and Setters
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return codigo +
                "\t" + nombre +
                "\t" + precio;
    }
}
