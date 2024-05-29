package com.lojaonline.usercase.usercases;

import com.lojaonline.core.domain.User;

public interface UserLoginUseCase {
    void login(User name, User password, User Email, User role);
}
