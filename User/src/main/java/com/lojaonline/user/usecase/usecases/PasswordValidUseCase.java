package com.lojaonline.user.usecase.usecases;

public interface PasswordValidUseCase {
    boolean passwordValid(String password);

    boolean isValid(String password);
}
