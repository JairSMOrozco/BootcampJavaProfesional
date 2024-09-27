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

    //Métodos
    @Override
    public String saludar() {
        return "Soy el profesor de " + getAsignatura() + ", " + getNombre();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Asignatura: " + getAsignatura();
    }
}
