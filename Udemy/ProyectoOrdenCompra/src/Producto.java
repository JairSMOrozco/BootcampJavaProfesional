public class Producto {
    //Atributos
    private String fabricante;
    private String nombre;
    private int precio;

    //Constructores
    public Producto(String fabricante, String nombre, int precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters
    public String getFabricante() {
        return fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }


}
