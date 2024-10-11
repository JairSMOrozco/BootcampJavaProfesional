package com.jairorozco.modelo;

public interface IProducto {
    //métodos
    default int getPrecio(){
        return 0;
    }
    double getPrecioVenta();
}
