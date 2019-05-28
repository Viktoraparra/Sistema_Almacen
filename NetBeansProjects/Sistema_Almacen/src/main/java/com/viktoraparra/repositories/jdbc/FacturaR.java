package com.viktoraparra.repositories.jdbc;

import com.viktoraparra.entities.Factura;
import com.viktoraparra.repositories.interfaces.I_FacturaR;
import com.viktoraparra.repositories.interfaces.I_GenericR;
import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FacturaR implements I_FacturaR{
    private I_GenericR<Factura> fact;

    public FacturaR(Connection conn) { fact= new GenericR(conn, new Factura()); }
    
    @Override public void save(Factura factura) { fact.save(factura); }
    @Override public void remove(Factura factura) { fact.remove(factura); }
    @Override public void update(Factura factura) { fact.update(factura); }
    @Override public List<Factura> getAll() { return fact.getAll();    }

    @Override
    public Factura GetByIdFactura(Integer idFactura) {
        List<Factura> lista= getAll()
                .stream()
                .filter(a->a.getCodigo()==idFactura)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public List<Factura> GetByDate(Date date) {
        List<Factura> lista;
//                .stream()
//                .filter(a->a.getFechaEntrada().toLocalDate().compareTo(other))
        return null;
    }

    @Override
    public Factura GetByLineas(Integer lineasId) {
        List<Factura> lista= getAll()
                .stream()
                .filter(a->a.getLineasId()==lineasId)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public Factura GetByProveedor(Integer proveedoresId) {
         List<Factura> lista= getAll()
                .stream()
                .filter(a->a.getProveedoresId()==proveedoresId)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }
    
}
