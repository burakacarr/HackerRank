import java.util.*;

class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(Integer... numbers) {
        List<Integer> primes = new ArrayList<>();
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number+ " ");
               
            }
        }
        System.out.println();
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();
        PrimeChecker.printPrimes(n1);
        PrimeChecker.printPrimes(n1, n2);
        PrimeChecker.printPrimes(n1, n2, n3);
        PrimeChecker.printPrimes(n1, n2, n3, n4, n5);
    }
}

