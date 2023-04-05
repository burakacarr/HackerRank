import java.io.*;
import java.lang.reflect.*;
import java.util.*;
class Add {
    /**
     * This method calculates the sum of the given numbers and prints the result to the console.
     * @param nums the numbers to add
     */
    public static void add(int... nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            if (i == nums.length - 1) {
                // If we've reached the last number, print the number and the total sum separated by an "=" sign
                System.out.print(nums[i] + "=" + total);
            } else {
                // Otherwise, print the number and a "+" sign
                System.out.print(nums[i] + "+");
            }
        }
        // Print a newline character to separate the results
        System.out.println();
    }
}

public class JavaVarargsSimpleAddition {

    public static void main(String[] args) {
       try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5); 
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());
                
            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
    
    

}


