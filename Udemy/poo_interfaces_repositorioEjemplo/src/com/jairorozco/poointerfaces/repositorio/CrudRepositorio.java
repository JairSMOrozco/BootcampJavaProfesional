package com.jairorozco.poointerfaces.repositorio;
import com.jairorozco.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    //Métodos de la interfaz
    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
