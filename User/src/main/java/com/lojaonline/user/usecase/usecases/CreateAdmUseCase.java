package com.lojaonline.user.usecase.usecases;

import com.lojaonline.user.core.domain.enums.EnumUserType;
import com.lojaonline.user.core.domain.User;


public interface CreateAdmUseCase {
    void create( User user, EnumUserType userType);
}
