package com.viktoraparra.entities;

public class Almacen {
    private int codigo;
    private int lineasId;
    private String descripcion;
    private int stock;
    private String uMedida;
    private double pUnitaria;

    public static String getTable(){ return "Almacen";}
    public Almacen() {}

    public Almacen(Integer lineasId, String descripcion, Integer stock, String uMedida, double pUnitaria) {
        this.lineasId = lineasId;
        this.descripcion = descripcion;
        this.stock = stock;
        this.uMedida = uMedida;
        this.pUnitaria = pUnitaria;
    }

    public Almacen(Integer codigo, Integer lineasId, String descripcion, Integer stock, String uMedida, double pUnitaria) {
        this.codigo = codigo;
        this.lineasId = lineasId;
        this.descripcion = descripcion;
        this.stock = stock;
        this.uMedida = uMedida;
        this.pUnitaria = pUnitaria;
    }

    @Override
    public String toString() {
        return codigo + ", " + lineasId + ", " + descripcion + ", " + stock + ", " + uMedida + ", " + pUnitaria;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getuMedida() {
        return uMedida;
    }

    public void setuMedida(String uMedida) {
        this.uMedida = uMedida;
    }

    public double getpUnitaria() {
        return pUnitaria;
    }

    public void setpUnitaria(double pUnitaria) {
        this.pUnitaria = pUnitaria;
    }
    
    
}

