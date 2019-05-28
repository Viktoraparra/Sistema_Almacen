package com.viktoraparra.repositories.interfaces;

import com.viktoraparra.entities.Linea;
import java.util.List;

public interface I_LineaR {
    void save(Linea linea);
    void remove(Linea linea);
    void update(Linea linea);
    List<Linea>getAll();
    List<Linea>GetByNombre(String nombre);
    Linea getByIdLinea(Integer idLinea);
}
