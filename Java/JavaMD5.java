import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class JavaMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // Read input from user
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        scanner.close();

        // Compute MD5 hash of input string
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(str.getBytes());
        byte[] digest = md.digest();

        // Print hash as hexadecimal string
        for (byte b : digest) {
            System.out.format("%02x", b);
        }
    }
}
