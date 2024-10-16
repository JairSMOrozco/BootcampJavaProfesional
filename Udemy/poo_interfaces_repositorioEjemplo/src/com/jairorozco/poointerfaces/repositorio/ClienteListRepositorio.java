package com.jairorozco.poointerfaces.repositorio;

import com.jairorozco.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements RepositorioCompleto{
    //Atributos
    private List<Cliente> dataSource;

    //Constructor
    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente clienteEncontrado = null;

        for(Cliente cliente: dataSource) {
            if(cliente.getId() != null && cliente.getId().equals(id)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        return clienteEncontrado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);

    }

    @Override
    public void editar(Cliente cliente) {
        //Encontrar al cliente por ID al que se le editaran los datos
        Cliente c = this.porId(cliente.getId());

        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        Cliente c = this.porId(id);
        this.dataSource.remove(c);
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
                int resultado = 0;
                if(dir == Direccion.ASC) {
                    resultado = ordenar(campo, a,b);
                }else if(dir == Direccion.DESC) {
                    resultado = ordenar(campo, b,a);
                }
                return resultado;
        });
        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public int total(){
        return this.dataSource.size();
    }

    public static int ordenar(String campo, Cliente a, Cliente b){
        int resultado = 0;
        switch (campo){
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }
}
