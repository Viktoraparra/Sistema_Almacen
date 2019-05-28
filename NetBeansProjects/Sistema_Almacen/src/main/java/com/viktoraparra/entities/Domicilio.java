package com.viktoraparra.entities;
public class Domicilio {
    private String calle;
    private Integer numero;
    private String pisoOcasa;
    private String barrio;
    private String provincia;
    private String ciudad;

    public Domicilio() {
    }

    public Domicilio(String calle, Integer numero, String pisoOcasa, String barrio, String provincia, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.pisoOcasa = pisoOcasa;
        this.barrio = barrio;
        this.provincia = provincia;
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPisoOcasa() {
        return pisoOcasa;
    }

    public void setPisoOcasa(String pisoOcasa) {
        this.pisoOcasa = pisoOcasa;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    
}
