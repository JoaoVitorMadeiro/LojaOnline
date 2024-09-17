package com.lojaonline.user.infrastructure.mapper;

import com.lojaonline.user.core.domain.User;
import com.lojaonline.user.infrastructure.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserEntity toEntity(User dto) {
        UserEntity user = new UserEntity("name", "emaill", "password", "type");
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setType(dto.getType().name());
        return user;
    }

}
