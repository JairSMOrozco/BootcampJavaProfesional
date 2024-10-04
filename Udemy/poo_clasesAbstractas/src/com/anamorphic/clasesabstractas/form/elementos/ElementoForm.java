package com.anamorphic.clasesabstractas.form.elementos;

public abstract class ElementoForm {
    //Atributos
    protected String valor;
    protected String nombre;

    //Constructor

    public ElementoForm() {
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    //Setters
    public void setValor(String valor) {
        this.valor = valor;
    }


    //Métodos


    //Métodos abstractos
    public abstract String dibujarHTML();

}
