package com.lojaonline.infrastructure.service;

public class PermissionService {

    public boolean hasPermission(String userType) {
        return userType.equals("ADMIN");
    }

}
