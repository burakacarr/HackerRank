import java.util.*;

public class JavaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        Map<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int phone = scanner.nextInt();
            scanner.nextLine(); // consume newline
            phoneBook.put(name, phone);
        }
        while (scanner.hasNext()) {
            String query = scanner.nextLine();
            Integer phone = phoneBook.get(query);
            if (phone == null) {
                System.out.println("Not found");
            } else {
                System.out.println(query + "=" + phone);
            }
        }
        scanner.close();
    }
}

