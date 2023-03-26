import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String name = scanner.next();
            int value = scanner.nextInt();
            System.out.printf("%-15s%03d%n", name, value);
        }
        System.out.println("================================");

        scanner.close();

        /*
        %s is used for string so,
        %-15s --> is used for -15 spaces right side for string

        %d is used for int
        %03 --> used for 3 spaces left side for int with starting 0
        * */
    }
}