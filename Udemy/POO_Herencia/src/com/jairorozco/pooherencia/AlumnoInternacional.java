package com.jairorozco.pooherencia;

public class AlumnoInternacional extends Alumno{
    //atributos
    private String pais;
    private double notaIdiomas;

    //Constructor
    public AlumnoInternacional() {
        System.out.println("AlumnoInternacional inicializando constructor ...");
    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);
        this.pais = pais;
    }

    //getters and setters
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }
    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    //Métodos

    @Override
    public String saludar() {
        String saludo = super.saludar();
        return saludo + ", soy extranjero del país " + getPais();
    }

    @Override
    public double calcularPromedio(){
        double promedio = ((super.calcularPromedio() * 3) + notaIdiomas) / 4;
        return promedio;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Nota idiomas: " + getNotaIdiomas() + "\n";
    }
}
