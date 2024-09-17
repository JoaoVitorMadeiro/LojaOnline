package com.lojaonline.user.infrastructure.service;

import com.lojaonline.user.infrastructure.dto.UsuarioDetails;
import com.lojaonline.user.infrastructure.entity.UserEntity;
import com.lojaonline.user.infrastructure.repository.UsuarioRepository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthorizathionService implements UserDetailsService {

    UsuarioRepository usuariorepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity usuario = usuariorepo.findByName(username);
        UsuarioDetails ud = new UsuarioDetails(usuario);
        return ud;
    }


}
