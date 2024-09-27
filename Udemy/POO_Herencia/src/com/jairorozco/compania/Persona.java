package com.jairorozco.compania;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private String numeroFiscal;
    private String direccion;

    //Constructores
    public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    //Métodos
    @Override
    public String toString(){
        return "Nombre: " + getNombre() + "\n" +
                "Apellido: " + getApellido() + "\n" +
                "Numero Fiscal: " + getNumeroFiscal() + "\n" +
                "Direccion: " + getDireccion() + "\n";
    }
}
