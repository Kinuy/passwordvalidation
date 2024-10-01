package org.example;
import java.util.regex.Pattern;

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

    public static boolean checkPasswordContainsUpperAndLowerCaseLetters(String password) {
        for (char l : password.toCharArray()) {
            // check for lower case
            if (Character.isLowerCase(l)) {
                for (char u : password.toCharArray()) {
                    // check for upper case
                    if (Character.isUpperCase(u)) {
                        return true;
                    }
                }
            }
            // check for upper case
            else{
                for (char u : password.toCharArray()) {
                    // check for lower case
                    if (Character.isLowerCase(u)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean checkPasswordContainsCommonlyUsedPasswords(String password) {
        String[] commonlyUsedPassword = {"Password1", "Aa345678"};
        for (String c : commonlyUsedPassword) {
            if (password.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPasswordContainsSpecialCharacters(String password) {
        if (Pattern.matches("[a-zA-Z]+", password)){
            return false;
        }
        else{
            return true;
        }
    }
}