package com.viktoraparra.entities;

public class Proveedor {
    
    private Integer codigo;
    private String nombreRS;
    private String telefono;
    private String domicilio;

    public static String getTable(){ return "Proveedores";}
    public Proveedor() {}

    public Proveedor(String nombreRS, String telefono, String domicilio) {
        this.nombreRS = nombreRS;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public Proveedor(Integer codigo, String nombreRS, String telefono, String domicilio) {
        this.codigo = codigo;
        this.nombreRS = nombreRS;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return codigo + ", " + nombreRS + ", " + telefono + ", " + domicilio;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombreRS() {
        return nombreRS;
    }

    public void setNombreRS(String nombreRS) {
        this.nombreRS = nombreRS;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    
}
