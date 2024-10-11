package com.jairorozco.modelo;

public class TvLcd extends Electronico implements IProducto{
    //atributos
    private int pulgada;
    private double precioVenta;

    //Constructor
    public TvLcd(int pulgada, double precioVenta, String fabricante) {
        super(fabricante);
        this.pulgada = pulgada;
        this.precioVenta = precioVenta;
    }

    //Getter
    public int getPulgada() {
        return pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return precioVenta;
    }

    @Override
    public String toString(){
        return "Datos TV: " + "\n"
                + "Fabricante: " + super.getFabricante() + "\n"
                + "Pulgadas: " + this.getPulgada() + "\n"
                + "Precio Venta : " + this.getPrecioVenta() + "\n";
    }
}
