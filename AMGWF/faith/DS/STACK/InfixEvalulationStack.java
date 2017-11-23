package faith.DS.STACK;

public class InfixEvalulationStack {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        GenericStackClass<Character> operatorStack = new GenericStackClass<>();
        GenericStackClass<Integer> operandStack = new GenericStackClass<>();

        String exp = "(2+4)*(4)";
        for (int i = 0; i < exp.length(); i++) {
            char x = exp.charAt(i);
            if (Character.isLetterOrDigit(x)) {
                operandStack.push(Integer.parseInt(Character.toString(x)));
            } else if (x == '(') {
                operatorStack.push(x);
            } else if (x == '+' || x == '-' || x == '*' || x == '/') {
                while (precedence(x) <= precedence(operatorStack.peek())) {
                    char op = operatorStack.pop();
                    if (op == '+') {
                        int tot = operandStack.pop() + operandStack.pop();
                        operandStack.push(tot);
                    } else if (op == '-') {
                        int tot = operandStack.pop() + operandStack.pop();
                        operandStack.push(tot);
                    } else if (op == '*') {
                        int tot = operandStack.pop() + operandStack.pop();
                        operandStack.push(tot);
                    }
                    if (op == '/') {
                        int tot = operandStack.pop() + operandStack.pop();
                        operandStack.push(tot);
                    }
                }
            } else if (x == ')') {
                char op =operatorStack.pop();
                while(!(op=='(')) {
                   
                    if (op == '+') {
                        int tot = operandStack.pop() + operandStack.pop();
                        operandStack.push(tot);
                    } else if (op == '-') {
                        int tot = operandStack.pop() + operandStack.pop();
                        operandStack.push(tot);
                    } else if (op == '*') {
                        int tot = operandStack.pop() + operandStack.pop();
                        operandStack.push(tot);
                    }
                    if (op == '/') {
                        int tot = operandStack.pop() + operandStack.pop();
                        operandStack.push(tot);
                    }
                }
                
            }

        }
        System.out.println(operandStack.pop());
    }

    private static int precedence(char x) {
        // TODO Auto-generated method stub

        switch (x) {
        case '+':
        case '-':
            return 1;

        case '*':
        case '/':
            return 2;

        case '^':
            return 3;
        }
        return -1;
    }

}
