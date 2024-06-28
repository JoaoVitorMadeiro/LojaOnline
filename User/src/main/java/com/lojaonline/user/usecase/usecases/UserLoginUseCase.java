package com.lojaonline.user.usecase.usecases;


import com.lojaonline.user.core.domain.User;

public interface UserLoginUseCase {
    void login(User name, User password, User Email, User role);
}
