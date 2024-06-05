package com.lojaonline.usecase.usecases;

import com.lojaonline.core.domain.User;

public interface UserAuthUseCase {
    boolean auth(User name, User password);
}
