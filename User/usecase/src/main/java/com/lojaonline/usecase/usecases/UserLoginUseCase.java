package com.lojaonline.usecase.usecases;

import com.lojaonline.core.domain.User;

public interface UserLoginUseCase {
    void login(User name, User password, User Email, User role);
}
