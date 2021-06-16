package com.platzi.javatests;

public class PasswordUtil {

    public  enum SecurityLevel{
        MEAK, MEDIUM, STRING
    }
    public static SecurityLevel assessPassword(String password){

        if (password.length() <8){
            return SecurityLevel.MEAK;
        }
        if (password.matches("[a-zA-A]+")){
            return SecurityLevel.MEAK;
        }
        if (password.matches("[a-zA-Z0-9]+")){
            return SecurityLevel.MEDIUM;
        }
        return SecurityLevel.STRING;
    }
}
