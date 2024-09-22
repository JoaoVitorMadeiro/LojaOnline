package com.lojaonline.user.infrastructure.service;


import com.lojaonline.user.infrastructure.dto.UsuarioDTO;
import com.lojaonline.user.infrastructure.entity.UserEntity;
import org.springframework.stereotype.Service;
import com.lojaonline.user.infrastructure.repository.UsuarioRepository;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UserEntity save(UsuarioDTO usuarioDTO) {

        if (usuarioDTO.getSenha().length() < 8 && usuarioDTO.getSenha().contains("ABCDEFGHIJKLMNOPQRSTUVWXYZ") && usuarioDTO.getSenha().contains("abcdefghijklmnopqrstuvwxyz") && usuarioDTO.getSenha().contains("!@#$%¨&*()_+")) {
            throw new IllegalArgumentException("Password must be at least 8 characters");
        }

        UserEntity user = usuarioRepository.save(UserEntity.builder()
                .name(usuarioDTO.getNome())
                .email(usuarioDTO.getEmail())
                .password(usuarioDTO.getSenha())
                .type(usuarioDTO.getRole())
                .build());

        return  user;
    }


    public UserEntity findByEmail(String email) {
        return usuarioRepository.findByName(email);
    }

    public UserEntity findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public UserEntity update(UserEntity usuario) {
        return usuarioRepository.save(usuario);
    }

    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }

}