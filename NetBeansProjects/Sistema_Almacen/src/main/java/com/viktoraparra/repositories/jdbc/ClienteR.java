package com.viktoraparra.repositories.jdbc;

import com.viktoraparra.entities.Cliente;
import com.viktoraparra.repositories.interfaces.I_ClienteR;
import java.sql.Connection;
import java.util.List;
import java.util.stream.Collectors;

public class ClienteR implements I_ClienteR{
    private GenericR<Cliente> clie;
//    public AreaR(Connection conn){ ar = new GenericR(conn, new Area()); }
    public ClienteR(Connection conn) { clie = new GenericR(conn, new Cliente()); }
    @Override public void save(Cliente cliente)   { clie.save(cliente);   }
    @Override public void remove(Cliente cliente) { clie.remove(cliente); }
    @Override public void update(Cliente cliente) { clie.update(cliente); }
    @Override public List<Cliente> getAll()       { return clie.getAll(); }

    @Override
    public List<Cliente> GetByNombreApellido(String nombre, String apellido) {
        return getAll()
                .stream()
                .filter(a->a.getNombre().toString().contains(nombre.toString())
                && a.getApellido().toLowerCase().contains(apellido.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public Cliente getByCodigo(Integer dni) {
        List<Cliente> lista=getAll()
                .stream()
                .filter(a->a.getCodigo()==dni)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }
    
}
