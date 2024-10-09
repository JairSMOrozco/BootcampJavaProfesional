package com.jairorozco.poointerfaces.imprenta;

import com.jairorozco.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("JAIR OROZCO", "Ingeniero en Sistemas", "REsumen laboral ...");
        cv.addExperiencia("Java");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("SQL Server");
        cv.addExperiencia("Spring Framework");
        cv.addExperiencia("Spring MVC");
        cv.addExperiencia("Spring Security");

        Libro libro = new Libro("Erich Gamma", "Patrones de Diseño", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Fascade"));

        Informe inf = new Informe("JAIR OROZCO", "Karina Tadeo", "Estudio sobre microservicios");

        imprimir(cv);
        imprimir(inf);
        imprimir(libro);

    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
