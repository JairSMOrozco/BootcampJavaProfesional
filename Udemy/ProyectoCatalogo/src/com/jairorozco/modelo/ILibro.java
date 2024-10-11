package com.jairorozco.modelo;

import java.util.Date;

public interface ILibro {
    //Métodos
    Date getFechaPublicacion();
    String getAutor();
    String getTitulo();
    String getEditorial();
}
