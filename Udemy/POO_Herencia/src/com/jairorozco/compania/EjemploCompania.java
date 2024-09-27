package com.jairorozco.compania;

public class EjemploCompania {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Jair", "Orozco", "29465", "Calle 6 #256, CDMX", 24678.90, 867);
        gerente.setPresupuesto(250000.0);
        gerente.aumentarRemuneracion(15.0);
        System.out.println(gerente);
    }
}
