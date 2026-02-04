package com.nexa.backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "usuarios")

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Primer nombre
    @Column(nullable = false)
    private String primerNombre;

    //Segundo nombre
    private String segundoNombre; //Opcional

    //Primer apellido
    @Column(nullable = false)
    private String primerApellido;

    //Segundo apellido
    @Column(nullable = false)
    private String segundoApellido;

    //Número de teléfono
    @Column(nullable = false)
    private String numeroTelefono;

    //Correo electrónico
    @Column(nullable = false, unique = true)
    private String email;

    //Contraseña
    @Column(nullable = false)
    private String contraseña;

    //Rol del usuario
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Rol rol;
}
