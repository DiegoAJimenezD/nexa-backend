package com.nexa.backend.service;

import com.nexa.backend.dto.LoginRequestDTO;

public interface AuthService {

    String login(LoginRequestDTO loginRequest);
}
