package com.nexa.backend.service.impl;

import com.nexa.backend.dto.UsuarioDTO;
import com.nexa.backend.entity.Usuario;
import com.nexa.backend.repository.UsuarioRepository;
import com.nexa.backend.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepositorio;

    @Override
    public Usuario crearUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setPrimerNombre(usuarioDTO.getPrimerNombre());
        usuario.setSegundoNombre(usuarioDTO.getSegundoNombre());
        usuario.setPrimerApellido(usuarioDTO.getPrimerApellido());
        usuario.setSegundoApellido(usuarioDTO.getSegundoApellido());
        usuario.setNumeroTelefono(usuarioDTO.getNumeroTelefono());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setContraseña(usuarioDTO.getContraseña());
        usuario.setRol(usuarioDTO.getRol());

        return usuarioRepositorio.save(usuario);
    }
}
