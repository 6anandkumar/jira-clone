package com.taskmanager.authentication.Security;

import com.taskmanager.authentication.Model.Entity.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {
    @Value("${app.jwt.secret}")
    private String SECRET_KEY;

    @Value("${app.jwt.refresh_token_expiry-ms}")
    private long refreshTokenExpiryMs;

    @Value("${app.jwt.auth_token_expiry_ms}")
    private long authTokenExpiry;

    @PostConstruct
    public void init() {
        System.out.println("SECRET_KEY = " + SECRET_KEY);
    }
    public String generateAccessToken(User user) {
        return generateToken(user.getEmail(), authTokenExpiry);
    }

    public String generateRefreshToken(User user) {
        return generateToken(user.getEmail(), refreshTokenExpiryMs);
    }

    private Key getSigningKey(){
        return Keys.hmacShaKeyFor(SECRET_KEY.getBytes(StandardCharsets.UTF_8));
    }

    private String generateToken(String subject, long expirationMillis){
        return Jwts
                .builder()
                .setSubject(subject)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expirationMillis))
                .signWith(getSigningKey(), SignatureAlgorithm.HS256)
                .compact();
    }




}
