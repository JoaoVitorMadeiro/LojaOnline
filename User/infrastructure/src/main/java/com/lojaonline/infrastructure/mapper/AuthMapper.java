package com.lojaonline.infrastructure.mapper;

import com.lojaonline.infrastructure.dto.UsuarioDetails;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lojaonline.infrastructure.dto.UsuarioLoginResponseDTO;
import com.lojaonline.infrastructure.dto.UsuarioRegisterDTO;
import com.lojaonline.infrastructure.service.TokenService;
import com.lojaonline.infrastructure.dto.UsuarioAuthDTO;



@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authManager;
    @Autowired
    private TokenService tokenService;

    @SuppressWarnings("rawtypes")
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid UsuarioAuthDTO data){
        UsernamePasswordAuthenticationToken upat = new UsernamePasswordAuthenticationToken(data.Username(), data.password());
        Authentication auth = authManager.authenticate(upat);

        String token = tokenService.generateToken((UsuarioDetails) auth.getPrincipal());

        return ResponseEntity.ok(new UsuarioLoginResponseDTO(token));
    }

    @SuppressWarnings("rawtypes")
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid UsuarioRegisterDTO data){
        {
            return ResponseEntity.badRequest().build();
        }
    }
}
