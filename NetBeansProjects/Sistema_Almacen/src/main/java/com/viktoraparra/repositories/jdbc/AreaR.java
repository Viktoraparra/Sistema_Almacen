package com.viktoraparra.repositories.jdbc;
import com.viktoraparra.entities.Area;
import com.viktoraparra.repositories.interfaces.I_AreaR;
import com.viktoraparra.repositories.interfaces.I_GenericR;
import java.sql.Connection;
import java.util.List;
import java.util.stream.Collectors;

public class AreaR implements I_AreaR{
    private I_GenericR<Area> ar;
    public AreaR(Connection conn){ ar = new GenericR(conn, new Area()); }
    
    @Override public void save(Area area)   { ar.save(area);   }
    @Override public void remove(Area area) { ar.remove(area); }
    @Override public void update(Area area) { ar.update(area); }
    @Override public List<Area> getAll() { return ar.getAll(); }

    @Override
    public Area GetByCodigo(Integer idArea) {
        List<Area> lista=getAll()
                .stream().filter(a->a.getCodigo()==idArea)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public List<Area> GetByNombre(String nombre) {
        return getAll()
                .stream()
                .filter(a->a.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    
}
