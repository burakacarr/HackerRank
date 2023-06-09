import java.math.BigDecimal;
import java.util.*;
class JavaBigDecimal{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        
        // We want to sort in descending order while preserving the contents 
        // of each String. A comparator can achieve this for us. We convert  
        // to BigDecimal inside our comparator so that the change is not 
        // permanent and our String's form for each number is preserved.
        Comparator<String> customComparator = (s1, s2) -> new 
            BigDecimal(s2).compareTo(new BigDecimal(s1));
        Arrays.sort(s, 0, n, customComparator);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
