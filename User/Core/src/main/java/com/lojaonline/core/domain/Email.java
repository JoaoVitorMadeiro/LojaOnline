package com.lojaonline.core.domain;

public class Email {
    public static boolean isValid(String email) {
        return email.contains("@gmail.com");
    }
}
