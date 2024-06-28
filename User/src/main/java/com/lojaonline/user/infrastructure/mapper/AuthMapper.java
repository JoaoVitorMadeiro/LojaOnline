package com.lojaonline.user.infrastructure.mapper;

import com.lojaonline.user.infrastructure.dto.UsuarioAuthDTO;
import com.lojaonline.user.infrastructure.dto.UsuarioDetails;
import com.lojaonline.user.infrastructure.dto.UsuarioLoginResponseDTO;
import com.lojaonline.user.infrastructure.service.TokenService;
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



import com.lojaonline.user.infrastructure.dto.UsuarioRegisterDTO;




@RestController
@RequestMapping("/auth")
public class AuthMapper {
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
