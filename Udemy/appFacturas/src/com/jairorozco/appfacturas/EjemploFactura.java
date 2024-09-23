package com.jairorozco.appfacturas;

import com.jairorozco.appfacturas.model.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Jair");

        Scanner myScanner =  new Scanner(System.in);
        System.out.println("Ingrese la descripción de la factura: ");
        String desc = myScanner.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for (int i = 0; i < 5; i++){
            producto = new Producto();
            System.out.print("Ingrese el producto no. " + producto.getCodigo() + ": ");
            nombre = myScanner.nextLine();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio del producto: ");
            precio = myScanner.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = myScanner.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);

            System.out.println();
            myScanner.nextLine();
        }

        System.out.println(factura);
    }
}
