package com.lojaonline.user.application.gateway;


import com.lojaonline.user.core.domain.User;

public interface CreateUserGateWay {
    Boolean userSaved(User user);
}
