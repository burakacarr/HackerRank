import java.util.Scanner;

public class JavaAnagrams {

  static boolean isAnagram(String a, String b) {
    a = a.toUpperCase();
    b = b.toUpperCase();
    int[] aCount = new int[26];
    int[] bCount = new int[26];

    for (int i = 0; i < a.length(); i++) {
        char c = a.charAt(i);
        if (c >= 'A' && c <= 'Z') {
            aCount[c - 'A']++;
        }
    }
    for (int i = 0; i < b.length(); i++) {
        char c = b.charAt(i);
        if (c >= 'A' && c <= 'Z') {
            bCount[c - 'A']++;
        }
    }

    for (int i = 0; i < 26; i++) {
        if (aCount[i] != bCount[i]) {
            return false;
    }
    }
    return true;
}

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

