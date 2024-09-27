package com.jairorozco.almacen;

public class ListaProductos {
    private Producto[] productosArray = new Producto[8];
    private static int indiceArray;

    public Producto[] getProductosArray() {
        return productosArray;
    }

    //Metodos
    public void addProducto(Producto producto){
        productosArray[indiceArray++] = producto;
    }
}
