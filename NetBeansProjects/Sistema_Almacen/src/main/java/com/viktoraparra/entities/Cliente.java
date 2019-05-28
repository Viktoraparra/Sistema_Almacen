package com.viktoraparra.entities;
public class Cliente {
    private Integer dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String domicilio;

    public Cliente() {
    }

    public Cliente(Integer dni, String nombre, String apellido, String telefono, String correo, String domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return dni + ", " + nombre + ", " + apellido + ", " + telefono + ", " + correo + ", " + domicilio;
    }

    public Integer getCodigo() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    } 
    
}
