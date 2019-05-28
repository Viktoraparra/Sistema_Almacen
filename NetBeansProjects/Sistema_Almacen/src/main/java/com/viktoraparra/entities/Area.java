package com.viktoraparra.entities;

public class Area {
    private Integer codigo;
    private String nombre;
    
    public static String getTable(){ return "Areas";}
    public Area() {    }

    public Area(String nombre) {
        this.nombre = nombre;
    }

    public Area(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return codigo + ", " + nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
