package com.viktoraparra.repositories.jdbc;

import com.viktoraparra.entities.Proveedor;
import com.viktoraparra.repositories.interfaces.I_GenericR;
import com.viktoraparra.repositories.interfaces.I_ProveedorR;
import java.sql.Connection;
import java.util.List;
import java.util.stream.Collectors;

public class ProveedorR implements I_ProveedorR{
    private I_GenericR<Proveedor> prove;
    public ProveedorR(Connection conn) { prove= new GenericR(conn, new Proveedor());}

    @Override public void save(Proveedor proveedor)   { prove.save(proveedor);    }
    @Override public void remove(Proveedor proveedor) { prove.remove(proveedor);  } 
    @Override public void update(Proveedor proveedor) { prove.update(proveedor);  }
    @Override public List<Proveedor> getAll()         { return prove.getAll();    }

    @Override
    public Proveedor GetByIdProveedor(Integer idProveedor) {
        List<Proveedor> lista=getAll()
                .stream()
                .filter(a->a.getCodigo()==idProveedor)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public List<Proveedor> GetByNombre(String nombre) {
        return getAll()
                .stream()
                .filter(a->a.getNombreRS().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Proveedor> GetByTelefono(String telefono) {
        return getAll()
                .stream()
                .filter(a->a.getTelefono().toLowerCase().contains(telefono.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Proveedor> GetByDomicilio(String domicilio) {
        return getAll()
                .stream()
                .filter(a->a.getDomicilio().toLowerCase().contains(domicilio.toLowerCase()))
                .collect(Collectors.toList()); 
    }

    
}
