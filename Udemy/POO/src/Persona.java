public class Persona {
    //Atributos
    private String nombre;
    private String apellido;

    //Constructores
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Sobreescritura de métodos
    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
