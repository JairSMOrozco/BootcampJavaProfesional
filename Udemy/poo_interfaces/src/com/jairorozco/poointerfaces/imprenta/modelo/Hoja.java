package com.jairorozco.poointerfaces.imprenta.modelo;

public abstract class Hoja {
    //atributos
    protected String contenido;

    //Constructor
    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    //Métodos abstractos
    public abstract String imprimir();


}
