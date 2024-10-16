package com.jairorozco.poointerfaces;

import com.jairorozco.poointerfaces.modelo.Cliente;
import com.jairorozco.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        RepositorioCompleto repo = new ClienteListRepositorio();

        repo.crear(new Cliente("Jano","Pérez"));
        repo.crear(new Cliente("Bea","González"));
        repo.crear(new Cliente("Luci", "Martínez"));
        repo.crear(new Cliente("Andrés","Guzmán"));

        //List<Cliente> clientes = repo.listar();
        //clientes.forEach(System.out::println);

        //List<Cliente> paginable = repo.listar(0,3);
        //paginable.forEach(System.out::println);

        List<Cliente> clientesOrdenAsc = repo.listar("apellido", Direccion.ASC);
        clientesOrdenAsc.forEach(System.out::println);

        /*
        Cliente beaActualizar = new Cliente("Bea","Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        */

        //repo.eliminar(2);
        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println(repo.total());








    }

}
