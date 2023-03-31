import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(isBalanced(scanner.next()));
        }
        scanner.close();
    }

    static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();
        for (char ch : parentheses.toCharArray()) {
            if (isOpenParentheses(ch)) {
                stack.push(ch);
            } else if (isCloseParentheses(ch)) {
                if (stack.isEmpty() || !isMatchingPair(stack.peek(), ch)) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    static boolean isOpenParentheses(char ch) {
        return ch == '(' || ch == '[' || ch == '{';
    }

    static boolean isCloseParentheses(char ch) {
        return ch == ')' || ch == ']' || ch == '}';
    }

    static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}
