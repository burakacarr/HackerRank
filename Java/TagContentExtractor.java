import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Solution assumes we can't have the symbol "<" as text between tags */
public class TagContentExtractor {
    private static final String TAG_REGEX = "<(.+?)>([^<]+)</\\1>";
    private static final Pattern TAG_PATTERN = Pattern.compile(TAG_REGEX);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = Integer.parseInt(scanner.nextLine());
        while (numTestCases-- > 0) {
            String input = scanner.nextLine();
            extractTags(input);
        }
        scanner.close();
    }

    private static void extractTags(String input) {
        Matcher matcher = TAG_PATTERN.matcher(input);
        boolean matchFound = false;
        while (matcher.find()) {
            System.out.println(matcher.group(2));
            matchFound = true;
        }
        if (!matchFound) {
            System.out.println("None");
        }
    }
}
