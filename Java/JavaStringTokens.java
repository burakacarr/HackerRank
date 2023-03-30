import java.util.Scanner;

public class JavaStringTokens {
   
    private static final String NON_LETTER_REGEX = "[^a-zA-Z]+";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String inputWithoutLeadingNonLetters = removeLeadingNonLetters(input);
        String[] words = inputWithoutLeadingNonLetters.split(NON_LETTER_REGEX);

        if (inputWithoutLeadingNonLetters.isEmpty()) {
            System.out.println(0);
            return;
        }
       
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static String removeLeadingNonLetters(String input) {
        int i;
        for (i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                break;
            }
        }
        return input.substring(i);
    }
}