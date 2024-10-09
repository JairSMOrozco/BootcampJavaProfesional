package com.jairorozco.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible{
    //Atributos
    private String autor;
    private String editor;


    //Constructor
    public Informe(String autor, String editor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.editor = editor;
    }

    //Uso de métodos abstractos de la clase padre
    @Override
    public String imprimir() {
        return "Informe escrito por: " + this.autor + ", revisado por: " + this.editor +
                "\n" + this.contenido + "\n";
    }
}
