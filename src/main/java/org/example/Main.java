package org.example;

public class Main {
    /*    public static void main(String[] args) {

            System.out.println("Hello world!");
        }*/
    public static boolean checkPasswordLength(String password) {
        return password.length() == 8;
    }

    public static boolean checkPasswordContainsDigits(String password) {

        return password.matches(".*\\d.*");
    }
    public static boolean checkPasswordContainsUpperAndLowerCaseLetters(String password){
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c) || Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkPasswordContainsCommonlyUsedPasswords(String password){
        String[] commonlyUsedPassword = {"Password1","Aa345678"};
        for (String c : commonlyUsedPassword) {
            if (password.equals(c)) {
                return true;
            }
        }
        return false;
    }
}