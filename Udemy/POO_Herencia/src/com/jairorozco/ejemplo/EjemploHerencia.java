package com.jairorozco.ejemplo;

import com.jairorozco.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("=================Creando la instancia de alumno=================");
        Alumno alumno = new Alumno();
        alumno.setNombre("Jair");
        alumno.setApellido("Orozco");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaLenguaje(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        System.out.println("=================Creando la instancia de AlumnoInternacional=================");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaLenguaje(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);

        System.out.println("=================Creando la instancia de Profesor=================");
        Profesor profesor = new Profesor();
        profesor.setNombre("Emilio");
        profesor.setApellido("Mora");
        profesor.setAsignatura("Matematicas");

        System.out.println("=================    =================");
        System.out.println(alumno.getNombre()
                            + " " + alumno.getApellido()
                            + " " + alumno.getInstitucion());

        System.out.println(alumnoInt.getNombre()
                            + " " + alumnoInt.getApellido()
                            + alumnoInt.getPais()
                            + alumnoInt.getInstitucion());

        System.out.println("Profesor " + profesor.getAsignatura() + ": "
                            + profesor.getNombre()
                            + " " + profesor.getApellido());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }

    }
}
