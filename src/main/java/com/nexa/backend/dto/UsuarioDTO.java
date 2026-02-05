package com.nexa.backend.dto;

import com.nexa.backend.entity.Rol;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UsuarioDTO {

    @NotBlank
    private String primerNombre;

    private String segundoNombre; //opcional

    @NotBlank
    private String primerApellido;

    @NotBlank
    private String segundoApellido;

    @NotBlank
    private String numeroTelefono;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    private Rol rol;
}
