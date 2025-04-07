package com.taskmanager.authentication.Service;

import com.taskmanager.authentication.Model.DTO.AuthResponse;
import com.taskmanager.authentication.Model.DTO.RegisterRequest;
import com.taskmanager.authentication.Model.Entity.User;
import com.taskmanager.authentication.Model.UserRole;
import com.taskmanager.authentication.Repository.UserAuthRepository;
import com.taskmanager.authentication.Security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserAuthRepository userAuthRepository;

    @Autowired
    private JwtUtil jwtUtil;


    public AuthResponse register(RegisterRequest registerRequest){
        if(userAuthRepository.findByEmail(registerRequest.getEmail()).isPresent()){
            throw new RuntimeException("Email Already Registered");
        }

        User user = new User();
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        user.setRole(UserRole.USER);
        user.setFirstName(registerRequest.getFirstname());
        user.setLastName(registerRequest.getLastname());

        String refreshToken = jwtUtil.generateRefreshToken(user);
        user.setRefreshToken(refreshToken);

        String authToken = jwtUtil.generateAccessToken(user);

        userAuthRepository.save(user);

        return new AuthResponse(authToken, refreshToken);
    }
}
