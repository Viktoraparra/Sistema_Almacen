package com.viktoraparra.repositories.interfaces;

import com.viktoraparra.entities.Recibos;
import java.sql.Date;
import java.util.List;

public interface I_ReciboR {
    void save(Recibos recibos);
    void remove(Recibos recibos);
    void update(Recibos recibos);
    List<Recibos>getAll();
    Recibos GetByIdRecibos(Integer idRecibos);
    List<Recibos>GetByDate(Date date);
}
