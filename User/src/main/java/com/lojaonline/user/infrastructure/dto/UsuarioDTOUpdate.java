package com.lojaonline.user.infrastructure.dto;

import lombok.Data;

@Data
public class UsuarioDTOUpdate {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String type;
    private String token;
    private String refreshToken;
    private String createdAt;
    private String updatedAt;
}
