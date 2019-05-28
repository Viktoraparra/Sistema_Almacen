package com.viktoraparra.repositories.interfaces;
import com.viktoraparra.entities.Almacen;
import java.util.List;

public interface I_AlmacenR {
    void save(Almacen almacen);
    void update(Almacen almacen);
    void remove(Almacen almacen);
    List<Almacen>getAll();
    Almacen GetByCodigo(Integer idAlmacen);
}
