package com.lojaonline.usercase.usercases;

import com.lojaonline.core.domain.User;
import com.lojaonline.core.domain.enums.EnumUserType;

public interface CreateAdmUseCase {
    void create(User user, EnumUserType userType);
}
