package com.lojaonline.user.infrastructure.dto;


import com.lojaonline.user.core.domain.enums.EnumUserType;

public record UsuarioRegisterDTO(String Username, String senha, EnumUserType role) {

    public CharSequence password() {
        throw new UnsupportedOperationException("Unimplemented method 'password'");
    }
}