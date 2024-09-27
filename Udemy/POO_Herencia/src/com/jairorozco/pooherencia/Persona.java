package com.jairorozco.pooherencia;

public class Persona {
    //atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    //Constructores
    public Persona(){
        System.out.println("Persona inicializando constructor ...");
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, int edad) {
        this(nombre, apellido);
        this.edad = edad;
    }

    //Getters and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //Métodos
    public String saludar(){
        return "Hola, que tal !";
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\n" +
                "Apellido: " + getApellido() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Saludo: " + this.saludar() + "\n";
    }
}