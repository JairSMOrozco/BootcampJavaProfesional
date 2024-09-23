package com.jairorozco.appfacturas.model;

public class ItemFactura {
    //Atributos
    private int cantidad;
    private Producto producto;

    //Constructor
    public ItemFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    //Getters and setters
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    //Métodos
    public float calcularIMporte(){
        return this.cantidad * producto.getPrecio();
    }

    @Override
    public String toString() {
        return producto.toString() +
                "\t" + cantidad +
                "\t" + calcularIMporte();
    }
}
