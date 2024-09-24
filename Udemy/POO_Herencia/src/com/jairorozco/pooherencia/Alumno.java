package com.jairorozco.pooherencia;

public class Alumno extends Persona {
    //atributos
    private String institución;
    private double notaMatematica;
    private double notaLenguaje;
    private double notaHIstoria;


    //Getters and setters
    public String getInstitución() {
        return institución;
    }
    public void setInstitución(String institución) {
        this.institución = institución;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }
    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaLenguaje() {
        return notaLenguaje;
    }
    public void setNotaLenguaje(double notaLenguaje) {
        this.notaLenguaje = notaLenguaje;
    }

    public double getNotaHIstoria() {
        return notaHIstoria;
    }
    public void setNotaHIstoria(double notaHIstoria) {
        this.notaHIstoria = notaHIstoria;
    }
}
