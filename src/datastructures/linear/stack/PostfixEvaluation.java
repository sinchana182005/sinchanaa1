package datastructures.linear.stack;
import java.util.Stack;

public class PostfixEvaluation {
    static int evaluate(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (char c : exp.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c-'0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (c) {
                    case '+' -> stack.push(a + b);

                    case '-' -> stack.push(a - b);

                    case '*' -> stack.push(a * b);

                    case '/' -> stack.push(a / b);

                }
            }
        }
        return stack.pop();
    }

    static void main(String[] args) {
        String exp = "23*9-3";
        System.out.println(evaluate(exp));
    }
    }

