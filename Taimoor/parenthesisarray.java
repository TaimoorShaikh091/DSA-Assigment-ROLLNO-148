import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String expression = "([a + b] * (c + d))";
        boolean balanced = checkBalanced(expression);
        System.out.println("The parentheses are " + (balanced ? "balanced" : "not balanced"));
    }

    public static boolean checkBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.pop();
                if (!isMatchingPair(last, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }
}
