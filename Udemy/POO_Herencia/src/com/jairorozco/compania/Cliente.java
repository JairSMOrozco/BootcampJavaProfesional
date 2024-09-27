package com.jairorozco.compania;

public class Cliente extends Persona{
    //Atributos
    private int clienteID;

    //Constructores
    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteID) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteID = clienteID;
    }

    //Getters
    public int getClienteID() {
        return clienteID;
    }

    //Métodos
    @Override
    public String toString(){
        return super.toString() +
                "Cliente ID: " + getClienteID() + "\n";
    }
}
