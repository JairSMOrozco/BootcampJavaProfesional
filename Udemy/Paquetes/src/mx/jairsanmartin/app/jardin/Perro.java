package mx.jairsanmartin.app.jardin;

import mx.jairsanmartin.app.hogar.Persona;

public class Perro {
    protected String nombre;
    protected String raza;

    String jugar(Persona persona){
        return persona.getNombre() + " " + persona.lanzarPelota();
    }

}
