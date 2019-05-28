package com.viktoraparra.repositories.interfaces;

import com.viktoraparra.entities.Proveedor;
import java.util.List;

public interface I_ProveedorR {
    void save(Proveedor proveedor);
    void remove(Proveedor proveedor);
    void update(Proveedor proveedor);
    List<Proveedor>getAll();
    Proveedor GetByIdProveedor(Integer idProveedor);
    List<Proveedor>GetByNombre(String nombre);
    List<Proveedor>GetByTelefono(String telefono);
    List<Proveedor>GetByDomicilio(String domicilio);
}
