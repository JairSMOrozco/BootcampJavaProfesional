package com.jairorozco.almacen;

public class Limpieza extends Producto{
    //atributos
    private String componentes;
    private double litros;

    //Constructor
    public Limpieza(String nombre, double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    //getters
    public String getComponentes() {
        return componentes;
    }

    public double getLitros() {
        return litros;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Componentes producto: " + getComponentes() + "\n" +
                "Litros producto: " + getLitros() + "l" + "\n";
    }
}
