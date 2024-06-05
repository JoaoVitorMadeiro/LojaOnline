package com.lojaonline.infrastructure.repository;

import com.lojaonline.core.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<User, Long> {
    User findByName(String username);
}
