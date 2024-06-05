package com.lojaonline.infrastructure.dto;

import com.lojaonline.core.domain.enums.EnumUserType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTO {
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private EnumUserType role;
}
