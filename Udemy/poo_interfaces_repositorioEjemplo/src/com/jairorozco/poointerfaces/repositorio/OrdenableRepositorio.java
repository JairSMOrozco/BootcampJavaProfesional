package com.jairorozco.poointerfaces.repositorio;
import com.jairorozco.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    //Métodos de la interfaz
    List<Cliente> listar(String campo, Direccion dir);
}
