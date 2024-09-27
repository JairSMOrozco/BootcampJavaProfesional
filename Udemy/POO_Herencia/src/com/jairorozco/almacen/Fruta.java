package com.jairorozco.almacen;

public class Fruta extends Producto{
    //atributos
    private double peso;
    private String color;

    //constructor
    public Fruta(String nombre, double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    //getters
    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Peso producto: " + getPeso() + "kg" + "\n" +
                "Color producto: " + getColor() + "\n";
    }
}
