package com.jairorozco.modelo;

import java.util.Date;

public class Comics extends Libro implements IProducto {
    //atributos
    private String personaje;

    //Constructor
    public Comics(String personaje, Date fechaPublicacion, String autor, String titulo, String editorial, double precioVenta, int precio) {
        super(fechaPublicacion, autor, titulo, editorial, precioVenta, precio);
        this.personaje = personaje;
    }

    //Getter
    public String getPersonaje() {
        return personaje;
    }

    @Override
    public String toString(){
        return super.toString("Personaje : " + this.getPersonaje() + "\n");
    }

}
