package com.lojaonline.core.domain;

public class Password {
    public static final String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String lowercase = "abcdefghijklmnopqrstuvwxyz";
    public static final String number = "012345678";
    public static final String specialCharacter = "!@#$%^&*()_+";

    public static boolean isValid(String password) {
        if (password.length() > 8) {
            password.contains(uppercase);
            password.contains(lowercase);
            password.contains(number);
            password.contains(specialCharacter);
            return true;
        } else {
            return false;
        }
    }
}
