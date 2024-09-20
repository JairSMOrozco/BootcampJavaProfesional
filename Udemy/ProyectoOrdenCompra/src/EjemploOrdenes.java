import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        //Orden de compra cliente 1
        Cliente carlos = new Cliente("Carlos", "Martinez");
        Producto carlosProducto1 = new Producto("Apple", "iPhone 15", 999);
        Producto carlosProducto2 = new Producto("Samsung", "Galaxy S23", 899);
        Producto carlosProducto3 = new Producto("Sony", "PlayStation 5", 499);
        Producto carlosProducto4 = new Producto("Dell", "XPS 13", 1200);

        OrdenCompra orden1 = new OrdenCompra("Orden de compra de " + carlos.getNombre() + " " + carlos.getApellido());
        orden1.setFecha(new Date());
        orden1.setCliente(carlos);
        orden1.addProducto(carlosProducto1).addProducto(carlosProducto2).addProducto(carlosProducto3).addProducto(carlosProducto4);


        //Orden de compra cliente 2
        Cliente laura = new Cliente("Laura", "Martinez");
        Producto lauraProducto1 = new Producto("LG", "OLED TV 55\"", 1500);
        Producto lauraProducto2 = new Producto("Lenovo", "ThinkPad X1", 1300);
        Producto lauraProducto3 = new Producto("Bose", "QuietComfort 45", 329);
        Producto lauraProducto4 = new Producto("HP", "Spectre x360", 1400);

        OrdenCompra orden2 = new OrdenCompra("Orden de compra de " + laura.getNombre() + " " + laura.getApellido());
        orden2.setFecha(new Date());
        orden2.setCliente(laura);
        orden2.addProducto(lauraProducto1).addProducto(lauraProducto2).addProducto(lauraProducto3).addProducto(lauraProducto4);


        //Orden de compra cliente 3
        Cliente ana = new Cliente("Ana", "Gonzalez");
        Producto anaProducto1 = new Producto("Asus", "ROG Strix", 1800);
        Producto anaProducto2 = new Producto("Microsoft", "Surface Pro 9", 999);
        Producto anaProducto3 = new Producto("Huawei", "MateBook D15", 699);
        Producto anaProducto4 = new Producto("Xiaomi", "Mi Smart Band 7", 49);

        OrdenCompra orden3 = new OrdenCompra("Orden de compra de " + ana.getNombre() + " " + ana.getApellido());
        orden3.setFecha(new Date());
        orden3.setCliente(ana);
        orden3.addProducto(anaProducto1).addProducto(anaProducto2).addProducto(anaProducto3).addProducto(anaProducto4);

        System.out.println(orden1);
        System.out.println(orden2);
        System.out.println(orden3);
    }
}