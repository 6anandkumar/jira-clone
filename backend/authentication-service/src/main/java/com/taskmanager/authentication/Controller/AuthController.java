package com.taskmanager.authentication.Controller;

import com.taskmanager.authentication.Model.DTO.AuthResponse;
import com.taskmanager.authentication.Model.DTO.LoginRequest;
import com.taskmanager.authentication.Model.DTO.RegisterRequest;
import com.taskmanager.authentication.Service.AuthService;
import com.taskmanager.authentication.Service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/auth")
public class AuthController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    CustomUserDetailsService customUserDetailsService;

    @Autowired
    AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest registerRequest){
        //Hash Password before saving
        registerRequest.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        AuthResponse authResponse = authService.register(registerRequest);
        return  ResponseEntity.ok(authResponse);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest loginRequest){
        //
        String authToken = "";
        return ResponseEntity.ok(new AuthResponse(authToken, ""));
    }
//
//    @GetMapping("/isAuthValid")
//    public ResponseEntity<String> validateAuth()
}
