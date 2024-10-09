package com.jairorozco.poointerfaces.imprenta.modelo;

public class Pagina extends Hoja implements Imprimible{

    //Constructor
    public Pagina(String contenido) {
        super(contenido);
    }

    //Uso de métodos abstractos de la clase padre
    @Override
    public String imprimir() {
        return this.contenido;
    }
}
