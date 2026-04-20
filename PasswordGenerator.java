import java.util.Random;

public class PasswordGenerator {

    // Method to generate password
    public static String generatePassword(int length) {

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "@#$%&*!";

        // Combine all characters
        String allChars = upper + lower + numbers + symbols;

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Generate password
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        int length = 10; // Password length
        String password = generatePassword(length);

        System.out.println("Generated Password: " + password);
    }
}