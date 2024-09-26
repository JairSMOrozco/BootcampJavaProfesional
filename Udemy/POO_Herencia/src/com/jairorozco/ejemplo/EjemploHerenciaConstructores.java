package com.jairorozco.ejemplo;

import com.jairorozco.pooherencia.*;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        //System.out.println("=================Creando la instancia de alumno=================");
        Alumno alumno = new Alumno("Jair", "Orozco", 13, "Instituto Nacional");
        alumno.setEmail("jair@correo.com");
        alumno.setNotaLenguaje(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        //System.out.println("=================Creando la instancia de AlumnoInternacional=================");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEmail("peter@correo.com");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaLenguaje(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);

        //System.out.println("=================Creando la instancia de Profesor=================");
        Profesor profesor = new Profesor("Emilio", "Mora", "Matematicas");
        profesor.setEdad(37);
        profesor.setEmail("profesor.emilio@correo.com");

        System.out.println("==================================");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
    }

    public static void imprimir(Persona persona){
        System.out.println("Imprimiendo los datos del tipo Persona:");
        System.out.println("nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail()
        );

        if (persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo Alumno:");
            System.out.println("Institucion: " + ((Alumno)persona).getInstitucion() );
            System.out.println("Nota matematicas: " + ((Alumno)persona).getNotaMatematica());
            System.out.println("Nota historia: " + ((Alumno)persona).getNotaHistoria());
            System.out.println("Nota lenguaje: " + ((Alumno)persona).getNotaLenguaje());

            if (persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional:");
                System.out.println("Nota idiomas: " + ((AlumnoInternacional)persona).getNotaIdiomas());
                System.out.println("País: " + ((AlumnoInternacional)persona).getPais());
            }
        }

        if (persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor:");
            System.out.println("Asignatura: " + ((Profesor)persona).getAsignatura());
        }
        System.out.println();
    }
}
