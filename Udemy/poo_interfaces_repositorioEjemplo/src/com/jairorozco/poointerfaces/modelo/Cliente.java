package com.jairorozco.poointerfaces.modelo;

import java.util.Objects;

public class Cliente {

    //Atributos
    private Integer id;
    private String nombre;
    private String apellido;
    private static int ultimoID;

    //Constructores
    public Cliente(){
        this.id = ++ultimoID;
    }

    public Cliente(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getters and setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

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

    //Métodos

    @Override
    public String toString() {
        return "ID: " + id + "\n"
                + "Nombre: " + nombre + "\n"
                + "Apellido: " + apellido + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

}
