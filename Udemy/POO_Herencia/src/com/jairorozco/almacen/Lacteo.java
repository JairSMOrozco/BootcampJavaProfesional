package com.jairorozco.almacen;

public class Lacteo extends Producto{
    //atributos
    private int cantidad;
    private int proteinas;

    //constructor
    public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    //getters
    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cantidad producto: " + getCantidad() + "\n" +
                "Proteínas producto: " + getProteinas() + "\n";
    }
}
