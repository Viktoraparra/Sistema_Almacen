package com.viktoraparra.entities;

public class DetalleFactura {
   private Integer codigo;
   private Integer materialesId;
   private Integer cantidad;
   private double total;

    public static String getTable(){ return "DetalleFacturas";}
    public DetalleFactura() {
    }

    public DetalleFactura(Integer materialesId, Integer cantidad, double total) {
        this.materialesId = materialesId;
        this.cantidad = cantidad;
        this.total = total;
    }

    public DetalleFactura(Integer codigo, Integer materialesId, Integer cantidad, double total) {
        this.codigo = codigo;
        this.materialesId = materialesId;
        this.cantidad = cantidad;
        this.total = total;
    }

    @Override
    public String toString() {
        return codigo + ", " + materialesId + ", " + cantidad + ", " + total;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getMaterialesId() {
        return materialesId;
    }

    public void setMaterialesId(Integer materialesId) {
        this.materialesId = materialesId;
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
