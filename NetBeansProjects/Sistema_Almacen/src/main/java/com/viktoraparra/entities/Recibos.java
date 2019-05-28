package com.viktoraparra.entities;

import java.util.Date;

public class Recibos {
    private Integer codigo;
    private Integer areasId;
    private Date fechaSalida;
    
    public static String getTable(){ return "Recibos";}
    public Recibos() {}

    public Recibos(Integer areasId, Date fechaSalida) {
        this.areasId = areasId;
        this.fechaSalida = fechaSalida;
    }

    public Recibos(Integer codigo, Integer areasId, Date fechaSalida) {
        this.codigo = codigo;
        this.areasId = areasId;
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return codigo + ", " + areasId + ", " + fechaSalida;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getAreasId() {
        return areasId;
    }

    public void setAreasId(Integer areasId) {
        this.areasId = areasId;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
}
