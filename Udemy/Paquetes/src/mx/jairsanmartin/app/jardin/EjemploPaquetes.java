package mx.jairsanmartin.app.jardin;

//Packages importados
import mx.jairsanmartin.app.hogar.*;

//Atributos y métodos estáticos
import static mx.jairsanmartin.app.hogar.Persona.*;
import static mx.jairsanmartin.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Perro perro = new Perro();

        persona.setNombre("Jair");
        persona.setApellido("Orozco");
        persona.setColorPelo(NEGRO);
        perro.nombre = "Toby";
        perro.raza = "Bulldog";

        System.out.println(persona.getNombre());

        String jugando = perro.jugar(persona);
        System.out.println(jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String genero1 = GENERO_FEMENINO;
        String genero2 = GENERO_MASCULINO;
        System.out.println("genero1 = " + genero1);
        System.out.println("genero2 = " + genero2);
    }
}
