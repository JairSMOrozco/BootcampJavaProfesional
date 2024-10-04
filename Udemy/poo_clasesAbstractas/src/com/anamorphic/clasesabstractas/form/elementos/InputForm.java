package com.anamorphic.clasesabstractas.form.elementos;

import java.text.Normalizer;

public class InputForm extends ElementoForm {
    //Atributos
    private String tipo =  "text";

    //Constructores
    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    //Getter and setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String dibujarHTML() {
        return "<input type = '" + tipo + "'" + " name = '" + this.nombre + "'" + " value = '" + valor + "'" + ">";
    }
}
