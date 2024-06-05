package com.lojaonline.infrastructure.dto;


import com.lojaonline.core.domain.enums.EnumUserType;
import com.lojaonline.core.domain.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UsuarioRepostaDTO {

    private Long id;
    private String nome;
    private String email;
    private boolean admin;

    public static UsuarioRepostaDTO transformaEmDTO(User usuario) {
        return new UsuarioRepostaDTO(usuario.getId(), usuario.getName(), usuario.getEmail(), usuario.getType().equals(EnumUserType.UserType.ADMIN));
    }
}