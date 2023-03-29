import java.util.*;

public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        String substring = S.substring(start, end); // extract substring
        System.out.println(substring); // print substring
    }
}