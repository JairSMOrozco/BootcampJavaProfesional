package com.jairorozco.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        Profesor profesor = new Profesor();

        alumno.setNombre("Jair");
        alumno.setApellido("Orozco");

        profesor.setNombre("Emilio");
        profesor.setApellido("Mora");
        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());

    }
}
