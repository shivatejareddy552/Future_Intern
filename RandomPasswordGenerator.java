
import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {

    // Character pools for different types of characters
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{};:,.<>?/";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for password criteria
        System.out.println("Enter desired password length: ");
        int length = scanner.nextInt();

        System.out.println("Include uppercase letters? (true/false): ");
        boolean includeUppercase = scanner.nextBoolean();

        System.out.println("Include lowercase letters? (true/false): ");
        boolean includeLowercase = scanner.nextBoolean();

        System.out.println("Include digits? (true/false): ");
        boolean includeDigits = scanner.nextBoolean();

        System.out.println("Include special characters? (true/false): ");
        boolean includeSpecial = scanner.nextBoolean();

        // Generate password
        String password = generatePassword(length, includeUppercase, includeLowercase, includeDigits, includeSpecial);

        System.out.println("Generated password: " + password);
    }

    // Method to generate a random password
    private static String generatePassword(int length, boolean includeUppercase, boolean includeLowercase,
                                           boolean includeDigits, boolean includeSpecial) {
        StringBuilder charPool = new StringBuilder();

        // Build the character pool based on user selection
        if (includeUppercase) {
            charPool.append(UPPERCASE);
        }
        if (includeLowercase) {
            charPool.append(LOWERCASE);
        }
        if (includeDigits) {
            charPool.append(DIGITS);
        }
        if (includeSpecial) {
            charPool.append(SPECIAL_CHARS);
        }

        // If no character types were selected, return an error message
        if (charPool.length() == 0) {
            return "Please select at least one character set.";
        }

        // Generate the random password
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charPool.length());
            password.append(charPool.charAt(index));
        }

        return password.toString();
    }
}
