package com.jairorozco.almacen;

public class NoPerecedero extends Producto{
    //atributos
    private int contenido;
    private int calorias;

    //constructor
    public NoPerecedero(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }


    //getters
    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Contenido producto: " + getContenido() + "gr" + "\n" +
                "Calorías producto: " + getCalorias() + "\n";
    }
}
