package com.jairorozco.pooherencia;

public class Alumno extends Persona {
    //atributos
    private String institucion;
    private double notaMatematica;
    private double notaLenguaje;
    private double notaHistoria;

    //Constructores
    public Alumno() {
        System.out.println("Alumno inicializando constructor ...");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion, double notaMatematica, double notaLenguaje, double notaHistoria){
        this(nombre, apellido, edad, institucion);
        this.notaMatematica = notaMatematica;
        this.notaLenguaje = notaLenguaje;
        this.notaHistoria = notaHistoria;
    }

    //Getters and setters
    public String getInstitucion() {
        return institucion;
    }
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
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

    public double getNotaHistoria() {
        return notaHistoria;
    }
    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    //Métodos
    @Override
    public String saludar() {
        String saludo = super.saludar();
        return saludo + ", soy un alumno y mi nombre es " + getNombre();
    }

    public double calcularPromedio(){
        double promedio = (notaHistoria + notaLenguaje + notaMatematica) / 3;
        return promedio;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Intitución: " + getInstitucion() + "\n" +
                "Nota historia: " + getNotaHistoria() + "\n" +
                "Nota lenguaje: " + getNotaLenguaje() + "\n" +
                "Nota Matematica: " + getNotaMatematica() + "\n" +
                "Promedio: " + this.calcularPromedio() + "\n";

    }
}
