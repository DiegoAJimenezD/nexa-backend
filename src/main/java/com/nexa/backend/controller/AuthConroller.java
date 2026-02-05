package com.nexa.backend.controller;

import com.nexa.backend.dto.LoginRequestDTO;
import com.nexa.backend.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthConroller {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@Valid @RequestBody LoginRequestDTO request){
        String token = authService.login(request);
        return ResponseEntity.ok(token);
    }
}
