package com.lojaonline.usercase.usercases;

import com.lojaonline.core.domain.enums.Email;

public interface EmailValidUseCase {
    boolean emailValid(Email email);
}
