import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {

    public static void main(String[] args) {
        // Read input from the user
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();
        
        try {
            // Create a SHA-256 MessageDigest instance
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            
            // Update the MessageDigest with the input bytes
            md.update(key.getBytes());

            // Compute the digest (hash) of the input bytes
            byte[] digest = md.digest();

            // Convert the digest bytes to a hexadecimal string representation
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : digest) {
                stringBuilder.append(String.format("%02x", b));
            }

            // Print the hexadecimal string representation of the digest
            System.out.println(stringBuilder.toString());

        } catch (NoSuchAlgorithmException e) {
            // Handle the exception if the SHA-256 algorithm is not available
            System.out.println(e);
        }
    }
}
