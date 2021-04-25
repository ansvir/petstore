package com.petstore.backend.model;

import org.springframework.security.core.GrantedAuthority;

public enum RoleEnum implements GrantedAuthority {
    ROLE_USER, ROLE_MODERATOR, ROLE_ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
