public class Cliente {
    //Atributos
    private String nombre;
    private String apellido;

    //Constructores
    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getter
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
