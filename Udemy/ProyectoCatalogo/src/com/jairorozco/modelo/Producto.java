package com.jairorozco.modelo;

public abstract class Producto implements IProducto{
    //atributos
    private int precio;

    //Constructor
    public Producto(int precio){
        this.precio = precio;
    };

    //Getter
    @Override
    public int getPrecio() {
        return precio;
    }



}
