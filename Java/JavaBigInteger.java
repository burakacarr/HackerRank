import java.util.*;
import java.math.*;

public class JavaBigInteger{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        
        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);
        
        System.out.println(sum);
        System.out.println(product);
        
        sc.close();
    }
}
