package com.jairorozco.ejemplo;

import com.jairorozco.pooherencia.Alumno;
import com.jairorozco.pooherencia.AlumnoInternacional;
import com.jairorozco.pooherencia.Persona;
import com.jairorozco.pooherencia.Profesor;

public class EjemploHerenciaToString {
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
        System.out.println(persona);
    }
}
