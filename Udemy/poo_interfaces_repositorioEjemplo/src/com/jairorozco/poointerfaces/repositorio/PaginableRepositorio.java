package com.jairorozco.poointerfaces.repositorio;
import com.jairorozco.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}

