package com.taskmanager.authentication.Repository;

import com.taskmanager.authentication.Model.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserAuthRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
