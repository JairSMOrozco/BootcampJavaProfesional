package com.jairorozco.modelo;

public abstract class Electronico implements IElectronico {
    //atributos
    String fabricante;

    //Constructor
    public Electronico(String fabricante){
        this.fabricante = fabricante;
    }

    //Getter
    @Override
    public String getFabricante() {
        return fabricante;
    }
}
