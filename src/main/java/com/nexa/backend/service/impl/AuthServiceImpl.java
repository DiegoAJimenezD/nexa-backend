package com.nexa.backend.service.impl;

import com.nexa.backend.config.JwtService;
import com.nexa.backend.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.nexa.backend.dto.LoginRequestDTO;
import com.nexa.backend.entity.Usuario;
import com.nexa.backend.repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;


@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    @Override
    public String login(LoginRequestDTO loginRequest){
        Usuario usuario = usuarioRepository.findByEmail(loginRequest.getEmail())
                .orElseThrow(() -> new RuntimeException(("usuario no encontrado")));
        if(!passwordEncoder.matches(loginRequest.getPassword(), usuario.getPassword())){
            throw new RuntimeException("Credenciales inválidas");
        }

        return jwtService.generarToken(usuario.getEmail());
    }
}
