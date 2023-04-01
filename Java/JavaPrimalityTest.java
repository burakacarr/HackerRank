import java.math.*;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        scanner.close();
        String result = isPrime(n) ? "prime" : "not prime";
        System.out.println(result);
    }

    public static boolean isPrime(BigInteger n) {
        return n.isProbablePrime(10);
    }
}

