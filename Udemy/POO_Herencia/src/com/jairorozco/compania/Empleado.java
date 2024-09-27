package com.jairorozco.compania;

public class Empleado extends Persona {
    //Atributos
    private double remuneracion;
    private int empleadoID;

    //Constructores
    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoID) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoID = empleadoID;
    }

    //Getters
    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    //Métodos

    public double aumentarRemuneracion(double porcentaje) {
        return this.remuneracion += remuneracion * (porcentaje/100);
    }

    @Override
    public String toString(){
        return super.toString() +
                "Remuneración: " + getRemuneracion() + "\n" +
                "Empleado ID: " + getEmpleadoID() + "\n";
    }
}
