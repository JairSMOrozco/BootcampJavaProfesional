package com.jairorozco.compania;

public class Gerente extends Empleado{
    //atributos
    private double presupuesto;

    //constructor
    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoID){
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoID);
    }

    //getters
    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }


    //métodos
    @Override
    public String toString() {
        return super.toString() +
                "Presupuesto=" + getPresupuesto();
    }
}
