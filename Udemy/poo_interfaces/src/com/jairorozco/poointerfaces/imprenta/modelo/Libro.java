package com.jairorozco.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{
    //Atributos
    private List<Imprimible> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;

    //Constructor
    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    //Métodos
    public Libro addPagina(Imprimible hoja) {
        this.paginas.add(hoja);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: ").append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Genero: ").append(this.genero).append("\n");
        for(Imprimible pag : this.paginas){
            sb.append(pag.imprimir()).append("\n");
        }

        return sb.toString();
    }
}
