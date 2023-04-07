import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(divide(x, y));
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } finally {
            scanner.close();
        }
    }

    private static int divide(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("/ by zero");
        }
        return x / y;
    }
}

