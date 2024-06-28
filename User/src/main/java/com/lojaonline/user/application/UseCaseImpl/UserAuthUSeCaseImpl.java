package com.lojaonline.user.application.UseCaseImpl;

import com.lojaonline.user.core.domain.User;
import com.lojaonline.user.usecase.usecases.UserAuthUseCase;

public class UserAuthUSeCaseImpl implements UserAuthUseCase {

    @Override
    public boolean auth(User name, User password) {
        return false;
    }
}
