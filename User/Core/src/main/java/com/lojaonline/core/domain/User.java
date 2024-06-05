package com.lojaonline.core.domain;

import com.lojaonline.core.domain.enums.EnumUserType;

public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private EnumUserType type;

    public User(Long id, String name, String email, String password, EnumUserType type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EnumUserType getType() { return type; }

    public void setType(EnumUserType type) {
        this.type = type;
    }

    public boolean isEmpty() {
        return (this.name == null || this.name.isEmpty()) ||
                (this.email == null || this.email.isEmpty()) ||
                (this.password == null || this.password.isEmpty()) ||
                (this.type == null);
    }


}