package com.lojaonline.infrastructure.service;

import org.springframework.stereotype.Service;
import com.lojaonline.infrastructure.dto.UsuarioDTO;
import com.lojaonline.infrastructure.entity.Usuario;
import com.lojaonline.infrastructure.enums.EnumRole;
import com.lojaonline.infrastructure.repository.UsuarioRepository;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    public Usuario save(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioDTO.getNome());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setSenha(usuarioDTO.getSenha());
        usuario.setRole(EnumRole.ROLE_USER);
        return usuarioRepository.save(usuario);
    }
    public Usuario findByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }
    public Usuario update(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }

}