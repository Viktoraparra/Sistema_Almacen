package com.viktoraparra.entities;
import java.sql.Date;


public class Factura {
    private Integer codigo;
    private Integer lineasId;
    private Integer proveedoresId;
    private Date fechaEntrada;

    public static String getTable(){ return "Facturas";}
    public Factura() { }

    public Factura(Integer lineasId, Integer proveedoresId, Date fechaEntrada) {
        this.lineasId = lineasId;
        this.proveedoresId = proveedoresId;
        this.fechaEntrada = fechaEntrada;
    }

    public Factura(Integer codigo, Integer lineasId, Integer proveedoresId, Date fechaEntrada) {
        this.codigo = codigo;
        this.lineasId = lineasId;
        this.proveedoresId = proveedoresId;
        this.fechaEntrada = fechaEntrada;
    }

    @Override
    public String toString() {
        return codigo + ", " + lineasId + ", " + proveedoresId + ", " + fechaEntrada;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getLineasId() {
        return lineasId;
    }

    public void setLineasId(Integer lineasId) {
        this.lineasId = lineasId;
    }

    public Integer getProveedoresId() {
        return proveedoresId;
    }

    public void setProveedoresId(Integer proveedoresId) {
        this.proveedoresId = proveedoresId;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    
}
