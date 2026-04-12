package br.com;

public class PasswordValidator {

    public boolean isValid(String password) {
        if (password == null) return false;
        if (password.length() < 8) return false;

        boolean hasUpperChar = false;
        boolean hasLowerChar = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        String specialCharacters = "!@#$%^&*";

        char[] chars = password.toCharArray();

        for (char c : chars) {
            if (c == ' ') return false;
            if (c >= 'A' && c <= 'Z') hasUpperChar = true;
            else if (c >= 'a' && c <= 'z') hasLowerChar = true;
            else if (c >= '0' && c <= '9') hasDigit = true;

            else {
                for (int j = 0; j < specialCharacters.length(); j++) {
                    if (c == specialCharacters.charAt(j)) {
                        hasSpecial = true;
                        break;
                    }
                }
            }
        }

        return hasUpperChar && hasLowerChar && hasDigit && hasSpecial;
    }
}