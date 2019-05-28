package com.viktoraparra.test;

import com.viktoraparra.connectors.ConnectorMySQL;
import com.viktoraparra.entities.Linea;
import com.viktoraparra.entities.Usuario;
import com.viktoraparra.repositories.jdbc.GenericR;

public class TestGeneric {
    public static void main(String[] args) {
        GenericR<Linea> lin = new GenericR(ConnectorMySQL.getConnection(), 
                new Linea());
//        Usuario usuario = new Usuario("Daniel", "danRamirez", "123456789", "Administrador");
//        usu.save(usuario);
//        System.out.println(usuario);
        
        Linea linea = new Linea("Cargil Servicios");
        lin.save(linea);
        System.out.println(linea);
    }
}
