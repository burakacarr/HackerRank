import java.util.*;

public class JavaStringIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length();
        System.out.println(sum);

        // Determine if A is lexicographically larger than B
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Capitalize the first letter in A and B and print them on a single line
        String capStr1 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capStr2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capStr1 + " " + capStr2);
    }
}