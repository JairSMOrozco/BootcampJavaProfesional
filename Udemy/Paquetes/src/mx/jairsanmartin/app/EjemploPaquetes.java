package mx.jairsanmartin.app;

//Packages importados
import mx.jairsanmartin.app.hogar.Persona;
import mx.jairsanmartin.app.hogar.Gato;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Jair";

        System.out.println(persona.nombre);
    }
}
