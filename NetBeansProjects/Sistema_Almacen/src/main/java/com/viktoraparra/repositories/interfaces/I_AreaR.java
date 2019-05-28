package com.viktoraparra.repositories.interfaces;

import com.viktoraparra.entities.Area;
import java.util.List;

public interface I_AreaR {
    void save(Area area);
    void remove(Area area);
    void update(Area area);
    List<Area>getAll();
    Area GetByCodigo(Integer idArea);
    List<Area>GetByNombre(String nombre);
}
