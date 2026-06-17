package com.societyos.backend.user.controller;

import com.societyos.backend.user.dto.RegisterUserRequest;
import com.societyos.backend.user.dto.UserResponse;
import com.societyos.backend.user.entity.User;
import com.societyos.backend.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(
            @RequestBody RegisterUserRequest request
    ) {
        return ResponseEntity.ok(
                userService.registerUser(request)
        );
    }
    @GetMapping("/me")
    public String me(Authentication authentication) {

        return "Logged in as: "
                + authentication.getName();
    }
}
