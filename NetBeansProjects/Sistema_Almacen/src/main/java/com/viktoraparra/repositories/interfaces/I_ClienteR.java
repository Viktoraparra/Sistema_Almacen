package com.viktoraparra.repositories.interfaces;

import com.viktoraparra.entities.Cliente;
import java.util.List;

public interface I_ClienteR {
   void save(Cliente cliente);
   void remove(Cliente cliente);
   void update(Cliente cliente);
    List<Cliente>getAll();
    List<Cliente>GetByNombreApellido(String nombre, String apellido);
    Cliente getByCodigo(Integer dni);
}
