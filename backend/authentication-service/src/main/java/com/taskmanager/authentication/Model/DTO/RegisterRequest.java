package com.taskmanager.authentication.Model.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;

}
