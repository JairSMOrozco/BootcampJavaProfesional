package com.jairorozco.poointerfaces.imprenta.modelo;

public class Informe extends Hoja {
    //Atributos
    private String autor;
    private String editor;


    //Constructor
    public Informe(String autor, String editor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.editor = editor;
    }

    //Uso de métodos abstractos
    @Override
    public String imprimir() {
        return "Informe escrito por: " + this.autor + ", revisado por: " + this.editor +
                "\n" + this.contenido;
    }
}
