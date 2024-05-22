package com.lojaonline.core.domain;

import com.lojaonline.core.domain.enums.EnumUserType;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String email;
    private String password;
    private EnumUserType.UserType type;
}