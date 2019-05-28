package com.viktoraparra.repositories.interfaces;
import com.viktoraparra.entities.Usuario;
import java.util.List;
public interface I_UsuarioR {
    void save(Usuario usuario);
    void remove(Usuario usuario);
    void update(Usuario usuario);
    List<Usuario>getAll();
    Usuario GetByCodigo(Integer idUsuario);
    List<Usuario>GetByNombreUsuario(String nombre, String usuario);
    List<Usuario>GetByPerfil(String perfil);
}
