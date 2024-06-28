package com.lojaonline.user.infrastructure.dto;


import com.lojaonline.user.core.domain.enums.EnumUserType;
import com.lojaonline.user.infrastructure.entity.UserEntity;
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

    public static UsuarioRepostaDTO transformaEmDTO(UserEntity user) {
        return new UsuarioRepostaDTO(user.getId(), user.getName(), user.getEmail(), user.getType().equals(EnumUserType.valueOf("ADMIN")));
    }
}