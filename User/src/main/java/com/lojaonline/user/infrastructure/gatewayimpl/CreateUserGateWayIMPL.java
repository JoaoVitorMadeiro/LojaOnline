package com.lojaonline.user.infrastructure.gatewayimpl;


import com.lojaonline.user.application.gateway.CreateUserGateWay;
import com.lojaonline.user.core.domain.User;
import com.lojaonline.user.infrastructure.mapper.UserMapper;
import com.lojaonline.user.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateUserGateWayIMPL implements CreateUserGateWay {
    private UsuarioRepository usuarioRepository;
    private UserMapper userMapper;


    public CreateUserGateWayIMPL(UsuarioRepository usuarioRepository, UserMapper userMapper) {
        this.usuarioRepository = usuarioRepository;
        this.userMapper = userMapper;
    }



    @Override
    public Boolean userSaved(User user) {
       try {
              var userEntity = userMapper.toEntity(user);
              var userEntitySaved = usuarioRepository.save(userEntity);
              usuarioRepository.save(userEntity);
              return true;
         } catch (Exception e) {
                return false;
       }
    }
}
