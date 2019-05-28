package com.viktoraparra.repositories.jdbc;

import com.viktoraparra.entities.Recibos;
import com.viktoraparra.repositories.interfaces.I_GenericR;
import com.viktoraparra.repositories.interfaces.I_ReciboR;
import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ReciboR implements I_ReciboR{
    private I_GenericR<Recibos> reci;
    public ReciboR(Connection conn) { reci= new GenericR(conn, new Recibos()); }

    @Override public void save(Recibos recibos)   { reci.save(recibos);      }
    @Override public void remove(Recibos recibos) { reci.remove(recibos);    }
    @Override public void update(Recibos recibos) { reci.update(recibos);    }
    @Override public List<Recibos> getAll()       { return reci.getAll();    }

    @Override
    public Recibos GetByIdRecibos(Integer idRecibos) {
        List<Recibos> lista=getAll()
                .stream()
                .filter(a->a.getCodigo()==idRecibos)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public List<Recibos> GetByDate(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    
}
