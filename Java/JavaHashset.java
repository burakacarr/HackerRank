import java.util.*;

public class JavaHashset{

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
    Set<String> pairs = new HashSet<>();
    for (int i = 0; i < t; i++) {
        String pair = pair_left[i] + " " + pair_right[i];
        pairs.add(pair);
        System.out.println(pairs.size());
    }

//Write your code here

   }
}
