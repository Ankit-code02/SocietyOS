package com.societyos.backend.user.dto;

import com.societyos.backend.user.entity.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {

    private Long id;
    private String fullName;
    private String email;
    private Role role;
}