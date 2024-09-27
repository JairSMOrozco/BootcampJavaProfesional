package com.jairorozco.almacen;

public class EjemploAlmacen {
    public static void main(String[] args) {
        ListaProductos lista = new ListaProductos();

        Fruta mango = new Fruta("Mango", 31.4, 1.200, "amarillo");
        Fruta pera = new Fruta("Pera", 26.34, .930, "verde");

        Limpieza lavatrastes = new Limpieza("Lavatrastes", 52.30, "Alquil, sulfonato de sodio, Alcohol ED, Óxidos de amina, Etanol, Perfume, EDTA tetrasodico, Colorantes", 1.5);
        Limpieza desengrasante = new Limpieza("Desengrasante", 90.10, "Tensoactivos, solvente, soda cáustica, preservante y agua", 1.250);

        Lacteo leche = new Lacteo("Leche", 21.50, 2, 30);
        Lacteo crema = new Lacteo("Crema", 17.30, 1, 10);

        NoPerecedero pepinillos = new NoPerecedero("Pepinillos", 109.11, 750, 243);
        NoPerecedero aceitunas = new NoPerecedero("Aceitunas", 42.76, 425, 135);

        lista.addProducto(mango);
        lista.addProducto(pera);
        lista.addProducto(lavatrastes);
        lista.addProducto(desengrasante);
        lista.addProducto(leche);
        lista.addProducto(crema);
        lista.addProducto(pepinillos);
        lista.addProducto(aceitunas);

        for (Producto producto: lista.getProductosArray()){
            System.out.println(producto);
        }
    }


}
