package com.viktoraparra.repositories.jdbc;

import com.viktoraparra.entities.Almacen;
import com.viktoraparra.repositories.interfaces.I_AlmacenR;
import com.viktoraparra.repositories.interfaces.I_GenericR;
import java.sql.Connection;
import java.util.List;
import java.util.stream.Collectors;

public class AlmacenR implements I_AlmacenR{
    private I_GenericR<Almacen> alma;
    public AlmacenR(Connection conn) { alma = new GenericR(conn, new Almacen()); };

    @Override public void save(Almacen almacen)   { alma.save(almacen);   }
    @Override public void update(Almacen almacen) { alma.update(almacen); }
    @Override public void remove(Almacen almacen) { alma.remove(almacen); }
    @Override public List<Almacen> getAll()       { return alma.getAll(); }

    @Override
    public Almacen GetByCodigo(Integer idAlmacen) {
        List<Almacen> lista=getAll()
                .stream()
                .filter(a->a.getCodigo()==idAlmacen)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }
}
