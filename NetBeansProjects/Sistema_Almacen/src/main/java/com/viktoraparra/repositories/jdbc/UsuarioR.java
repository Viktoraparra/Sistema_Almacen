package com.viktoraparra.repositories.jdbc;

import com.viktoraparra.entities.Usuario;
import com.viktoraparra.repositories.interfaces.I_UsuarioR;
import com.viktoraparra.repositories.interfaces.I_GenericR;
import java.sql.Connection;
import java.util.List;
import java.util.stream.Collectors;

public class UsuarioR implements I_UsuarioR{
    private I_GenericR<Usuario> usu;
    public UsuarioR(Connection conn) { usu= new GenericR(conn, new Usuario());}

    @Override public void save(Usuario usuario) { usu.save(usuario);}
    @Override public void remove(Usuario usuario) { usu.remove(usuario);}
    @Override public void update(Usuario usuario) { usu.update(usuario);}
    @Override public List<Usuario> getAll() { return usu.getAll();}

    @Override
    public Usuario GetByCodigo(Integer idUsuario) {
        List<Usuario> lista=getAll()
                .stream()
                .filter(a->a.getCodigo()==idUsuario)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public List<Usuario>GetByNombreUsuario(String nombre, String usuario) {
        return getAll()
                .stream()
                .filter(a->a.getNombre().toLowerCase().contains(nombre.toLowerCase())
                || a.getUsuario().toLowerCase().contains(usuario.toLowerCase()))
                .collect(Collectors.toList());
             
    }

    @Override
    public List<Usuario> GetByPerfil(String perfil) {
        return getAll()
                .stream()
                .filter(a->a.getPerfil().toLowerCase().contains(perfil.toLowerCase()))
                .collect(Collectors.toList());      
    }

}
