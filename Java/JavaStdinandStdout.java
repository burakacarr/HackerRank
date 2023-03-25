import java.util.Scanner;

public class JavaStdinandStdout {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                //Enter an integer
                int intValue = scanner.nextInt();

                //Enter a double
                double doubleValue = scanner.nextDouble();

                //Enter a string
                scanner.nextLine();
                String stringValue = scanner.nextLine();

                System.out.println("String: " + stringValue);
                System.out.println("Double: " + doubleValue);
                System.out.println("Int: " + intValue);

                scanner.close();
        }
}
