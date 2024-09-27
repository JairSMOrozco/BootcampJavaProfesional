package com.jairorozco.almacen;

public class Producto {
    //atributos
    private String nombre;
    private double precio;


    //Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Nombre producto: " + getNombre() + "\n" +
                "Precio producto: $" + getPrecio() + "\n";
    }


}
