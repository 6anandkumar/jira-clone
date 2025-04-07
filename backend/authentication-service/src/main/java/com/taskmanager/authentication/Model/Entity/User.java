package com.taskmanager.authentication.Model.Entity;

import com.taskmanager.authentication.Model.UserRole;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor // No-arg constructor
@AllArgsConstructor // All-args constructor
@Builder // Optional: for building objects fluently
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "userid")
    private String userId;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "firstname", nullable = false, unique = false)
    private String firstName;

    @Column(name = "lastname", nullable = true, unique = false)
    private String lastName;

    @Column(name = "passwordhash", nullable = false, unique = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false, unique = false)
    private UserRole role;

    @Column(name = "refreshtoken", nullable = false, unique = true)
    private String refreshToken;

    @CreationTimestamp
    @Column(name = "createdat", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "modifiedat", nullable = false)
    private LocalDateTime modifiedAt;

    @Column(name = "createdby")
    private String createdBy;

    @Column(name = "modifiedby")
    private String modifiedBy;

}
