package com.anamorphic.clasesabstractas.form.elementos;

public class TextAreaForm extends ElementoForm {
    //Atributos
    private int filas;
    private int columnas;


    //Constructores
    public TextAreaForm(String nombre) {
        super(nombre);
    }

    public TextAreaForm(String nombre, int filas, int columnas) {
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }

    //Getter and setter
    public int getFilas() {
        return filas;
    }
    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }
    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    //Sobreescritura de métodos
    @Override
    public String dibujarHTML() {
        return "<textarea name = '" + this.nombre + "'" + " cols = '" + this.columnas +"'" + " rows = '" + this.filas + "'" + ">" + this.valor + "</textarea>";
    }
}
