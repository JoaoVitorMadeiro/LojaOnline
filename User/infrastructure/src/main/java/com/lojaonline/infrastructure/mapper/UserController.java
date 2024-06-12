package com.lojaonline.infrastructure.mapper;

import com.lojaonline.core.domain.User;
import com.lojaonline.infrastructure.dto.UsuarioDTO;
import com.lojaonline.infrastructure.service.UsuarioService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

class UserMApper {
    private UsuarioService userService;

    public UserMApper(UsuarioService userService) {
        this.userService = userService;
    }
    @PostMapping
    public void save(UsuarioDTO dto) {
        User user = UserMapper.toEntity(dto);
        userService.save(user);
    }
    @GetMapping
    public void findByEmail(String email) {
        userService.findByEmail(email);
    }
    @GetMapping
    public void findById(Long id) {
        userService.findById(id);
    }
    @PutMapping
    public void update(User user) {
        userService.update(user);
    }
    @DeleteMapping
    public void delete(Long id) {
        userService.delete(id);
    }

}
