package com.viktoraparra.entities;
import com.viktorparra.enumera.Perfil;

public class Usuario {
 private Integer codigo;
 private String nombre;
 private String usuario;
 private String clave;
 private Perfil perfil;
 
    public static String getTable(){ return "Usuarios";}
    public Usuario(){}

    public Usuario(String nombre, String usuario, String clave, Perfil perfil) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
        this.perfil = perfil;
    }

    public Usuario(Integer codigo, String nombre, String usuario, String clave, Perfil perfil) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return codigo + ", " + nombre + ", " + usuario + ", " + clave + ", " + perfil;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPerfil() {
        return perfil.toString();
    }
    
    public void setPerfil(Perfil perfil){
        this.perfil= perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = Perfil.valueOf(perfil.toUpperCase());
    }
 
 
}
