package com.yy.chapter20注解;

import java.util.List;

/**
 * 使用自定义注解
 * */
public class PasswordUtils {
    @UseCase(id = 47 ,description = "Password must  contain at least one numeric ")
    public boolean validatePassword(String password){
        return password.matches("\\w*\\d\\w*");
    }
    @UseCase(id = 48)
    public String encryptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }
    @UseCase(id = 49 , description = "New password can not equal previously used ones")
    public boolean CheckForNewPassword(List<String> prevPasswords,String password){
        return !prevPasswords.contains(password);
    }
}
