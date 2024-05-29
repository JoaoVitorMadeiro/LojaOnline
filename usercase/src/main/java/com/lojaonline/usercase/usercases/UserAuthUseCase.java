package com.lojaonline.usercase.usercases;

import com.lojaonline.core.domain.User;

public interface UserAuthUseCase {
    boolean auth(User name, User password);
}
