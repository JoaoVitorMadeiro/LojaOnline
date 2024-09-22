package com.lojaonline.user.infrastructure.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTO {
    private Long id;
    private String nome;
    @Email
    @NotBlank
    private String email;
    private String senha;
    private String role;
}
