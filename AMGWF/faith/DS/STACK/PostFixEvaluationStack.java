package faith.DS.STACK;

import java.util.Stack;

public class PostFixEvaluationStack {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String exp = "123*+5-";

        System.out.println(evaluate(exp));

    }

    private static int evaluate(String exp) {
        // TODO Auto-generated method stub

        GenericStackClass<Integer> stack=new GenericStackClass<>();
        //Stack<Character> stack= new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char x = exp.charAt(i);
            if (Character.isLetterOrDigit(x)) {
                stack.push(Integer.parseInt(Character.toString(x)));
            } else {
                if (x == '+') {
                    int tot = stack.pop() + stack.pop();
                    stack.push(tot);
                } else if (x == '-') {
                    int tot = stack.pop() - stack.pop();
                    stack.push(tot);
                } else if (x == '*') {
                    int tot = stack.pop() * stack.pop();
                    stack.push(tot);
                }
                if (x == '/') {
                    int tot = stack.pop() / stack.pop();
                    stack.push(tot);
                }

            }
        }
        return stack.pop();
    }

}
