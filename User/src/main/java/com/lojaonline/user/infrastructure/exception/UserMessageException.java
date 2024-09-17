package com.lojaonline.user.infrastructure.exception;

public class UserMessageException {

    private String token;
    private String userEntity;

    public UserMessageException( String token, String userEntity){
        this.token = token;
        this.userEntity = userEntity;
    }

    public String getToken(){
        return token;
    }

    public String getUserEntity(){
        return userEntity;
    }

    public void setToken(String token){
        this.token = token;
    }

    public void setUserEntity(String userEntity){
        this.userEntity = userEntity;
    }
}
