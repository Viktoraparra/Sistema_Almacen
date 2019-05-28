package com.viktoraparra.repositories.interfaces;

import com.viktoraparra.entities.DetalleFactura;
import java.util.List;
import java.util.TreeMap;

public interface I_DetalleFacturaR {
    void save(DetalleFactura detalleFactura);
    void remove(DetalleFactura detalleFactura);
    void update(DetalleFactura detallefactura);
    List<DetalleFactura>getAll();
    List<DetalleFactura>GetByIdDetalleFactura(Integer id);
    List<DetalleFactura>GetLikeMenorCantidad(Integer cantidad);
    List<DetalleFactura>GetLikeMayorCantidad(Integer cantidad);
    TreeMap<Integer, DetalleFactura>GetByIdTotal(Integer id, double total);
}
