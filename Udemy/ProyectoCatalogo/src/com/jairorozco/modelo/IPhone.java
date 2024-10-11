package com.jairorozco.modelo;

public class IPhone extends Electronico implements IProducto {
    //Atributos
    String color;
    String modelo;
    double precioVenta;

    //Constructor
    public IPhone(String color, String modelo, double precioVenta, String fabricante){
        super(fabricante);
        this.color = color;
        this.modelo = modelo;
        this.precioVenta = precioVenta;
    }

    //Getters
    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    //métodos
    @Override
    public double getPrecioVenta(){
        return this.precioVenta;
    }

    @Override
    public String toString(){
        return  "Datos iPhone: " + "\n"
                + "Fabricante: " + super.getFabricante() + "\n"
                + "Modelo: " + this.getModelo() + "\n"
                + "Color : " + this.getColor() + "\n"
                + "Precio Venta : " + this.getPrecioVenta() + "\n";
    }

}
