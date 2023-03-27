import java.util.*;

public class JavaStaticInitializer {
    static int input1,input2;
    static boolean flag;

    static{
        Scanner scanner = new Scanner(System.in);
        input1 = scanner.nextInt();
        input2 = scanner.nextInt();
        flag = input1 > 0 && input2 > 0;
        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            //throw new IllegalArgumentException("Breadth and height must be positive");

        }
    }

    public static void main(String[]args){
        if(flag){
            int area=input1*input2;
            System.out.println(area);
        }
    }
}


