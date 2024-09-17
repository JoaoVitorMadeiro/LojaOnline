package com.lojaonline.user.infrastructure.mapper;

import com.lojaonline.user.infrastructure.dto.UsuarioDTO;import com.lojaonline.user.infrastructure.dto.UsuarioRepostaDTO;
import com.lojaonline.user.infrastructure.entity.UserEntity;
import com.lojaonline.user.infrastructure.service.KafkaMessageProducer;
import com.lojaonline.user.infrastructure.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jdk.jshell.Snippet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")

public class UserController {
    private final KafkaMessageProducer kafkaMessageProducer;
    private UsuarioService userService;

    public UserController(UsuarioService userService, KafkaMessageProducer kafkaMessageProducer) {
        this.userService = userService;
        this.kafkaMessageProducer = kafkaMessageProducer;
    }

    @Operation(summary = "record a new permission", description = "save a new book in database", responses = {
            @ApiResponse(responseCode = "200", ref = "ok"),
            @ApiResponse(responseCode = "400", ref = "badRequest"),
            @ApiResponse(responseCode = "403", ref = "permissionDenied"),
            @ApiResponse(responseCode = "404", ref = "ResourceNotFound"),
            @ApiResponse(responseCode = "409", ref = "conflict")
    })
    @PostMapping
    public ResponseEntity<UserEntity> save(UsuarioDTO dto) {
       UserEntity savedUser = userService.save(dto);
       return new ResponseEntity<UserEntity>(savedUser, HttpStatus.CREATED);
    }
    @GetMapping
    public String ok() {
        return "ok";
    }

    @PostMapping("/enviar mensagem")
    public void enviarMensagem(@RequestParam String token, @RequestParam String userType) {
        kafkaMessageProducer.sendMessage(token, userType);
    }

}
