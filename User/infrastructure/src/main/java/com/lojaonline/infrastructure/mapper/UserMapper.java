package com.lojaonline.infrastructure.mapper;

import com.lojaonline.infrastructure.dto.UsuarioDTO;
import com.lojaonline.core.domain.User;


public class UserMapper {
    public static User toEntity(UsuarioDTO dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setName(dto.getNome());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getSenha());
        user.setType(dto.getRole());
        return user;
    }

    public static UsuarioDTO toDTO(User user) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(user.getId());
        dto.setNome(user.getName());
        dto.setEmail(user.getEmail());
        dto.setSenha(user.getPassword());
        dto.setRole(user.getType());
        return dto;
    }

    private UserMapper() {
    }
}
