package com.example.identityservice.auth;

import com.example.identityservice.user.Role;

public record RegisterResponse(Long id, String username, Role role) {
}
