// Check for Balanced Brackets in an expression (well-formedness)

import java.util.ArrayDeque;

public class string14 {
    public static boolean areBalancedBracket(String expr) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }

            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (x == '{' || x == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (x == '{' || x == '(')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (x == '(' || x == '[')
                        return false;
                    break;
            }

        }
        return (stack.isEmpty());
    }

    public static void main(String args[]) {
        String expr = "({[()})";

        if (areBalancedBracket(expr)) {
            System.out.println("it is balanced");
        } else {
            System.out.println("it is not balanced");
        }

    }
}
