package com.jairorozco.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{
    //Atributos
    private Persona persona;
    private String carrera;
    private List<String> experiencias;


    //Constructor
    public Curriculum(Persona persona, String carrera, String contenido){
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    //Métodos
    public Curriculum addExperiencia(String exp){
        this.experiencias.add(exp);
        return this;
    }

    //Uso de métodos abstractos de la clase padre
    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.persona).append("\n")
                .append("Resumen: ").append(this.contenido).append("\n")
                .append("Profesión: ")
                .append(this.carrera).append("\n")
                .append("Experiencias: \n");
        for (String exp: this.experiencias) {
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
