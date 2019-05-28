
package com.viktoraparra.repositories.interfaces;

import com.viktoraparra.entities.Factura;
import java.sql.Date;
import java.util.List;

public interface I_FacturaR {
    void save(Factura factura);
    void remove(Factura factura);
    void update(Factura factura);
    List<Factura>getAll();
    Factura GetByIdFactura(Integer idFactura);
    List<Factura>GetByDate(Date date);
    Factura GetByLineas(Integer lineasId);
    Factura GetByProveedor(Integer proveedoresId);
}
