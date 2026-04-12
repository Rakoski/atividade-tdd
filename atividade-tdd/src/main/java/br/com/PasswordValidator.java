package br.com;

public class PasswordValidator {

    public boolean isValid(String password) {
        if (password == null) return false;

        if (password.length() < 8) return false;

        if (password.contains(" ")) return false;

        boolean hasUpperChar = false;
        boolean hasLowerChar = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        String specialCharacters = "!@#$%^&*";

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpperChar = true;
            else if (Character.isLowerCase(c)) hasLowerChar = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (specialCharacters.indexOf(c) != -1) hasSpecial = true;
        }

        return hasUpperChar && hasLowerChar && hasDigit && hasSpecial;
    }
}