package com.lojaonline.core.domain.enums;

public class Password {
    private static final String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String lowercase = "abcdefghijklmnopqrstuvwxyz";
    private static final String number = "012345678";
    private static final String specialCharacter = "!@#$%^&*()_+";
    public static boolean isValid(String password) {
        if(password.length() > 8) {
            password.contains(uppercase);
            password.contains(lowercase);
            password.contains(number);
            password.contains(specialCharacter);
            return true;
        }
        else{
            return false;
        }
    }
}
