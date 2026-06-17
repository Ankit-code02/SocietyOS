package com.societyos.backend.user.dto;

import com.societyos.backend.user.entity.Role;
import lombok.Data;

@Data
public class RegisterUserRequest {

    private String fullName;

    private String email;

    private String password;

    private Role role;
}