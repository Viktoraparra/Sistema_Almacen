package com.viktoraparra.repositories.interfaces;

import com.viktoraparra.entities.DetalleRecibo;
import java.util.List;
import java.util.TreeMap;

public interface I_DetalleReciboR {
    void save(DetalleRecibo detalleRecibo);
    void remove(DetalleRecibo detalleRecibo);
    void update(DetalleRecibo detalleRecibo);
    List<DetalleRecibo>getAll();
    List<DetalleRecibo>GetByIdDetalleRecibo(Integer idDetalleRecibo);
    List<DetalleRecibo>GetLikeMenorCantidad(Integer cantidad);
    List<DetalleRecibo>GetLikeMayorCantidad(Integer cantidad);
    TreeMap<Integer, DetalleRecibo>GetByIdTotal(Integer id,Double total);
}
