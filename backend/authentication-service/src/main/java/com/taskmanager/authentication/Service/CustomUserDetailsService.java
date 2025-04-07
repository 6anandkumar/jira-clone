package com.taskmanager.authentication.Service;

import com.taskmanager.authentication.Model.Entity.User;
import com.taskmanager.authentication.Repository.UserAuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserAuthRepository userAuthRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userAuthRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("Email not found"));
        return null;
    }
}
