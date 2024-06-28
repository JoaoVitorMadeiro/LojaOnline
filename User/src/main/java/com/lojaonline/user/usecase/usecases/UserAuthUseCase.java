package com.lojaonline.user.usecase.usecases;

import com.lojaonline.user.core.domain.User;

public interface UserAuthUseCase {
    boolean auth(User name, User password);
}
