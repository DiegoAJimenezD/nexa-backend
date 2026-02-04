package com.nexa.backend.controller;

import com.nexa.backend.dto.UsuarioDTO;
import com.nexa.backend.entity.Usuario;
import com.nexa.backend.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@Valid @RequestBody UsuarioDTO usuarioDTO){
        Usuario savedUsuario = usuarioService.crearUsuario(usuarioDTO);
        return ResponseEntity.ok(savedUsuario);
    }
}
