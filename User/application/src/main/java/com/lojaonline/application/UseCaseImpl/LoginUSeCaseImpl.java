package com.lojaonline.application.UseCaseImpl;

import com.lojaonline.core.domain.User;
import com.lojaonline.usecase.usecases.UserLoginUseCase;
import com.lojaonline.usecase.usecases.EmailValidUseCase;
import com.lojaonline.usecase.usecases.PasswordValidUseCase;

public class LoginUSeCaseImpl implements UserLoginUseCase {
    private EmailValidUseCase emailValidUseCase;
    private PasswordValidUseCase passwordValidUseCase;

    public LoginUSeCaseImpl(EmailValidUseCase emailValidUseCase, PasswordValidUseCase passwordValidUseCase) {
        this.emailValidUseCase = emailValidUseCase;
        this.passwordValidUseCase = passwordValidUseCase;
    }


    @Override
    public void login(User name, User password, User Email, User role) {
        // login user
        if(emailValidUseCase.emailValid(Email.getEmail())){
            throw new RuntimeException("Email invalid");
        }
        if(passwordValidUseCase.passwordValid(password.getPassword())){
            throw new RuntimeException("Password invalid");
        }
    }
}
