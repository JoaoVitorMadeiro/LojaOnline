package com.lojaonline.user.infrastructure.repository;



import com.lojaonline.user.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByName(String username);
}
