package com.viktoraparra.entities;

public class DetalleRecibo {
    private Integer codigo;
    private Integer recibosId;
    private Integer cantidad;
    private double total;
    
    public static String getTable(){ return "DetalleRecibos";}
    public DetalleRecibo() {}

    public DetalleRecibo(Integer recibosId, Integer cantidad, double total) {
        this.recibosId = recibosId;
        this.cantidad = cantidad;
        this.total = total;
    }

    public DetalleRecibo(Integer codigo, Integer recibosId, Integer cantidad, double total) {
        this.codigo = codigo;
        this.recibosId = recibosId;
        this.cantidad = cantidad;
        this.total = total;
    }

    @Override
    public String toString() {
        return codigo + ", " + recibosId + ", " + cantidad + ", " + total;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getRecibosId() {
        return recibosId;
    }

    public void setRecibosId(Integer recibosId) {
        this.recibosId = recibosId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
