package reham_package;

public class Week09_PasswordValidation_RR {

    public static void main(String[] args) {
        // Test cases
        System.out.println(isValidPassword("Abc@123")); // true (Valid)
        System.out.println(isValidPassword("abc123"));  // false (No uppercase, no special char)
        System.out.println(isValidPassword("ABC123@")); // false (No lowercase)
        System.out.println(isValidPassword("Abc123"));  // false (No special character)
        System.out.println(isValidPassword("A@1cde"));  // true (Valid)
    }


    public static boolean isValidPassword(String password) {
        // Condition 1: At least 6 characters and no spaces
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Condition 2-5: Check for uppercase, lowercase, digit, and special character
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
        String specialCharacters = "!@#$%^&*()-+";

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else if (specialCharacters.contains(String.valueOf(ch))) hasSpecial = true;
        }

        // Return true only if all conditions are met
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }




}
