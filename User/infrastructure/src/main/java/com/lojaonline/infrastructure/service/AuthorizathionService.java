package com.lojaonline.infrastructure.service;


import com.lojaonline.core.domain.User;
import com.lojaonline.infrastructure.dto.UsuarioDetails;
import com.lojaonline.infrastructure.entity.UserEntity;
import com.lojaonline.infrastructure.repository.UsuarioRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthorizathionService implements UserDetailsService {

    @Autowired
    UsuarioRepository usuariorepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User usuario = usuariorepo.findByName(username);
        return new UsuarioDetails(usuario);
    }


}
