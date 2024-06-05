package com.lojaonline.application.UseCaseImpl;

import com.lojaonline.core.domain.User;
import com.lojaonline.usecase.usecases.UserAuthUseCase;

public class UserAuthUSeCaseImpl implements UserAuthUseCase {

    @Override
    public boolean auth(User name, User password) {
        return false;
    }
}
