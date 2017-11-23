package faith.DS.STACK;

public class InfixToPostfix {

    static int Prec(char ch) {
        switch (ch) {
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

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        String exp = "(A+B/C*(D+E)-F)";
        System.out.println(Validate(exp));
    }

    public synchronized static String Validate(String exp) throws Exception {
        // TODO Auto-generated method stub

        String result = new String();
        GenericStackClass<Character> stack = new GenericStackClass<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)) {             //Operand

                result += c;
            } else if (c == '(') {                          //bracess..

                stack.push(c);
            } else if (c == ')') {                          //bracess..    
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += String.valueOf(stack.pop());

                if (!stack.isEmpty() && stack.peek() != '(')                // This condition is for last brace
                    return "Invalid Expression"; // invalid expression
                else
                    stack.pop();
            } else {                                                            //Operator
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek()))
                    result += String.valueOf(stack.pop());
                stack.push(c); 
            }

        }
        while (!stack.isEmpty())
            result += String.valueOf(stack.pop());

        return result;
    }

}
