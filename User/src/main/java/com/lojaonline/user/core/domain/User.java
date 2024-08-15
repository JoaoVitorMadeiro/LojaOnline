package com.lojaonline.user.core.domain;


import com.lojaonline.user.core.domain.enums.EnumUserType;

public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private EnumUserType type;
    private Wallet wallet;
    private TransactionPin transactionPin;

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

    public EnumUserType getType() {
        return type;
    }

    public void setType(EnumUserType type) {
        this.type = type;
    }


    public boolean isEmpty() {
        return (this.name == null || this.name.isEmpty()) ||
                (this.email == null || this.email.isEmpty()) ||
                (this.password == null || this.password.isEmpty()) ||
                (this.type == null);
    }
    public boolean PasswordValid(String password){
       if(password.contains("ABCDEFGHIJKLMNOPQRSTUVWXYZ")  && password.contains("abcdefghijklmnopqrstuvwxyz") && password.length() >= 8 && password.contains("@#$%&*!^")){
           return true;
       }
       else{
           return false;
       }
    }
    public boolean EmailValid(String email){
        if(email.contains("@gmail.com")){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean NameLimit(String name){
        if(name.length() >= 3 && name.length() <= 50){
            return true;
        }
        else{
            return false;
        }
    }

}