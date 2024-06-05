package com.lojaonline.usecase.usecases;

import com.lojaonline.core.domain.User;

public interface PasswordValidUseCase {
    boolean passwordValid(String password);

    boolean isValid(String password);
}
