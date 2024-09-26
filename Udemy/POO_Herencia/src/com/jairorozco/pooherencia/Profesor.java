package com.jairorozco.pooherencia;

public class Profesor extends Persona{
    //atributos
    private String asignatura;

    //Constructores
    public Profesor() {
        System.out.println("Profesor inicializando constructor ...");
    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura){
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    //Getters and setters
    public String getAsignatura() {
        return asignatura;
    }
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
