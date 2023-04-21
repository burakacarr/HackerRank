import java.util.*;
import java.util.Scanner;
// Write your code here. DO NOT use an access modifier in your class declaration.
class Parser{
    static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char last = stack.pop();

                if ((ch == ')' && last != '(') || (ch == '}' && last != '{') || (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    
}
class Solution {
    
    public static void main(String[] args) {
        Parser parser = new Parser();
        
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(parser.isBalanced(in.next()));
        }
        
        in.close();
    }
}
