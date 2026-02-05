package com.nexa.backend.service;

import com.nexa.backend.dto.UsuarioDTO;
import com.nexa.backend.entity.Usuario;

public interface UsuarioService {
    Usuario crearUsuario(UsuarioDTO usuarioDTO);
}
