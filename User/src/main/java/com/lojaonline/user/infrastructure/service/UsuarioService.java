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
        UserEntity usuario = new UserEntity("name", "emaill", "password", "type");
        usuario.setName(usuarioDTO.getNome());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setPassword(usuarioDTO.getSenha());
        usuario.setType(usuarioDTO.getRole());
        return usuarioRepository.save(usuario);
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