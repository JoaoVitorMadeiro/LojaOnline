package com.lojaonline.usercase.usercases;

import com.lojaonline.core.domain.User;

public interface PasswordValidUseCase {
    void passwordValid(User password, User confirmPassword);
}
