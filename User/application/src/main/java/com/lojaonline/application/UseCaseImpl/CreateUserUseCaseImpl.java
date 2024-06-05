package com.lojaonline.application.UseCaseImpl;

import com.lojaonline.application.gateway.CreateUserGateWay;
import com.lojaonline.core.domain.User;
import com.lojaonline.usecase.usecases.CreateUserUSeCase;
import com.lojaonline.usecase.usecases.EmailValidUseCase;
import com.lojaonline.usecase.usecases.PasswordValidUseCase;


public class CreateUserUseCaseImpl implements CreateUserUSeCase {
    private CreateUserGateWay createUserGateWay;
    private EmailValidUseCase emailValidUseCase;
    private PasswordValidUseCase passwordValidUseCase;

    public CreateUserUseCaseImpl( CreateUserGateWay createUserGateWay,EmailValidUseCase emailValidUseCase, PasswordValidUseCase passwordValidUseCase) {
        this.emailValidUseCase = emailValidUseCase;
        this.passwordValidUseCase = passwordValidUseCase;
        this.createUserGateWay =  createUserGateWay;
    }


    @Override
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
