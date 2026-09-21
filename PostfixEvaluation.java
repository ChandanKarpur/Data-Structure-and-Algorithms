import java.util.Stack;

public class PostfixEvaluation {

    public static int evaluatePostfix(String expression) {

        Stack<Integer> stack = new Stack<>();

        String[] tokens = expression.split(" ");

        for (String token : tokens) {

            // If token is a number
            if (token.matches("-?\\d+")) {
                stack.push(Integer.parseInt(token));
            }

            // If token is an operator
            else {
                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;

                    case "-":
                        stack.push(a - b);
                        break;

                    case "*":
                        stack.push(a * b);
                        break;

                    case "/":
                        stack.push(a / b);
                        break;

                    case "%":
                        stack.push(a % b);
                        break;

                    default:
                        System.out.println("Invalid operator");
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String expression = "23 * 54 * + 9 -";

        int result = evaluatePostfix(expression);

        System.out.println("Postfix Expression: " + expression);
        System.out.println("Result: " + result);
    }
}