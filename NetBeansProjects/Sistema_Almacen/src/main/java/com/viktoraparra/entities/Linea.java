package com.viktoraparra.entities;
public class Linea {
    private int codigo;
    private String nombre;

    public static String getTable(){ return "Lineas";}
    public Linea() {}

    public Linea(String nombre) {
        this.nombre = nombre;
    }

    public Linea(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {return codigo + ", " + nombre; }

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
