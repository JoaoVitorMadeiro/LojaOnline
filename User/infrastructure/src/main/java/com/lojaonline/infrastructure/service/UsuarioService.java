package com.lojaonline.infrastructure.service;

import com.lojaonline.core.domain.User;
import com.lojaonline.core.domain.enums.EnumUserType;
import org.springframework.stereotype.Service;

import com.lojaonline.infrastructure.repository.UsuarioRepository;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public User save(User usuarioDTO) {
        User usuario = new User();
        usuario.setName(usuarioDTO.getName());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setPassword(usuarioDTO.getPassword());
        usuario.setType(usuarioDTO.getType());
        return usuarioRepository.save(usuario);
    }

    public User findByEmail(String email) {
        return usuarioRepository.findByName(email);
    }

    public User findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public User update(User usuario) {
        return usuarioRepository.save(usuario);
    }

    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }

}