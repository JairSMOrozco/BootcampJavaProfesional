package com.jairorozco.poointerfaces.imprenta;

import com.jairorozco.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum(new Persona("Jair","Orozco"), "Ingeniero en Sistemas", "Resumen laboral ...");
        cv.addExperiencia("Java")
        .addExperiencia("Oracle DBA")
        .addExperiencia("SQL Server")
        .addExperiencia("Spring Framework")
        .addExperiencia("Spring MVC")
        .addExperiencia("Spring Security");

        Libro libro = new Libro(new Persona("Erich","Gamma"), "Patrones de Diseño", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));

        Informe inf = new Informe(new Persona("Jair", "Orozco"), new Persona("Karina", "Tadeo"), "Estudio sobre microservicios");

        imprimir(cv);
        imprimir(inf);
        imprimir(libro);

    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
