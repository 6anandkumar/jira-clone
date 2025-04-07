package com.taskmanager.authentication.Model.DTO;

import lombok.Getter;

@Getter
public class AuthResponse {
    private String authToken;
    private String refreshToken;

    public AuthResponse(String authToken, String refreshToken){
        this.authToken = authToken;
        this.refreshToken = refreshToken;
    }
}
