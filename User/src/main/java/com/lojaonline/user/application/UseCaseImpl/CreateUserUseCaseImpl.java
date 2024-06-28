package com.lojaonline.user.application.UseCaseImpl;


import com.lojaonline.user.core.domain.User;
import com.lojaonline.user.usecase.usecases.CreateUserUSeCase;
import com.lojaonline.user.usecase.usecases.EmailValidUseCase;
import com.lojaonline.user.usecase.usecases.PasswordValidUseCase;
import com.lojaonline.user.application.gateway.CreateUserGateWay;

public class CreateUserUseCaseImpl implements CreateUserUSeCase {
    private CreateUserGateWay createUserGateWay;
    private EmailValidUseCase emailValidUseCase;
    private PasswordValidUseCase passwordValidUseCase;

    public CreateUserUseCaseImpl( CreateUserGateWay createUserGateWay,EmailValidUseCase emailValidUseCase, PasswordValidUseCase passwordValidUseCase) {
        this.emailValidUseCase = emailValidUseCase;
        this.passwordValidUseCase = passwordValidUseCase;
        this.createUserGateWay =  createUserGateWay;
    }



    public void create(User user) {
        if(emailValidUseCase.emailValid(user.getEmail())){
            throw new RuntimeException("Email invalid");
        }
        if(passwordValidUseCase.passwordValid(user.getPassword())){
            throw new RuntimeException("Password invalid");
        }
        var userSaved = createUserGateWay.userSaved(user);
    }
}
