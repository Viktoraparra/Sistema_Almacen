package com.viktoraparra.repositories.jdbc;

import com.viktoraparra.entities.Linea;
import com.viktoraparra.repositories.interfaces.I_GenericR;
import com.viktoraparra.repositories.interfaces.I_LineaR;
import java.sql.Connection;
import java.util.List;
import java.util.stream.Collectors;

public class LineaR implements I_LineaR{
    private I_GenericR<Linea> lin;
    public LineaR(Connection conn) { lin = new GenericR(conn, new Linea()); }

    @Override public void save(Linea linea) { lin.save(linea);  }
    @Override public void remove(Linea linea) { lin.remove(linea);  }
    @Override public void update(Linea linea) { lin.update(linea);  }
    @Override public List<Linea> getAll() { return lin.getAll();  }

    @Override
    public List<Linea> GetByNombre(String nombre) {
        return getAll()
                .stream()
                .filter(a->a.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
        
    }

    @Override
    public Linea getByIdLinea(Integer idLinea) {
        List<Linea> lista=getAll()
                .stream()
                .filter(a->a.getCodigo()==idLinea)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }
    
}
