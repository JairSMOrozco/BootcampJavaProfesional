import java.util.Arrays;
import java.util.Date;

public class OrdenCompra{
    //atributos
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private int indiceProducto;

    //atributos privados
    private static int ultimoID;

    //Constructores
    public OrdenCompra(String descripcion) {
        this.id = ++ultimoID;
        this.descripcion = descripcion;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }
    public OrdenCompra addProducto(Producto producto){
        productos[indiceProducto++] = producto;

        return this;
    }

    //Metodos
    public double granTotal(){
        double total = 0;
        for(int i = 0; i < productos.length; i++){
            total += productos[i].getPrecio();
        }

        return total;
    }

    public String recorrerProductos(){
        String listaProductos = "";
        for (Producto producto: productos) {
            listaProductos += "Fabricante: " + producto.getFabricante() + ", " +
                              "Nombre: " + producto.getNombre() + ", " +
                              "Precio: " + producto.getPrecio() + "\n";
        }
        return listaProductos;
    }

    @Override
    public String toString() {
        return getDescripcion() + "\n" +
                "Fecha de la compra: " + getFecha() + "\n" +
                "Id de orden de compra: " + getId() + "\n" +
                "Cliente: " + getCliente().getNombre() + " " + getCliente().getApellido() + "\n" +
                "Lista de productos: " + "\n" +
                 recorrerProductos() + "\n" +
                "Total de compra: $" + granTotal() + "\n";
    }
}
