package com.lojaonline.infrastructure.dto;

import com.lojaonline.core.domain.User;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.List;

public class UsuarioDetails implements UserDetails {
    private  User usuario;

    public UsuarioDetails(User usuario) {
        this.usuario = usuario;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_" + usuario.getType().name()));
    }
    @Override
    public String getPassword() {
        return ((UserDetails) usuario).getPassword();
    }

    @Override
    public String getUsername() {
        return ((UserDetails) usuario).getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
