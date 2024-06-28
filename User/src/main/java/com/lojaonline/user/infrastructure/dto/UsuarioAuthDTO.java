package com.lojaonline.user.infrastructure.dto;

public record UsuarioAuthDTO(String Username, String senha) {

    public Object password() {
        throw new UnsupportedOperationException("Unimplemented method 'password'");
    }}