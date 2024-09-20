package mx.jairsanmartin.app.hogar;

//Package importados
import mx.jairsanmartin.app.jardin.Perro;

//Atributos y métodos estáticos
import static mx.jairsanmartin.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Perro perro = new Perro();

        String saludo = saludar();

    }
}
