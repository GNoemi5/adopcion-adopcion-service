package com.adopcion.app.domain.usuario.repositories;

import com.adopcion.app.domain.usuario.entities.Usuario;

public interface UsuarioRepository {

    void registrar(Usuario usuario);

    Usuario buscar(Integer idCuenta);


}
