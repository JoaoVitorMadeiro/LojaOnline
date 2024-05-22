package com.lojaonline.core.domain.enums;

public class Email {
    public static boolean isValid(String email) {
        return email.contains("@gmail.com");
    }
}
