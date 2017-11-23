package faith.DS.STACK;

public class StackReverse {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        GenericStackClass<Integer> stack = new GenericStackClass<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        reverseIt(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            // if(stack.peek()==5) break;
        }

    }

    private static void reverseIt(GenericStackClass<Integer> stack) {
        // TODO Auto-generated method stub

        if (stack.isEmpty())
            return;
        int temp = stack.pop();
        reverseIt(stack);
        InverseIt(stack, temp);

    }

    private static void InverseIt(GenericStackClass<Integer> stack, Integer pop) {
        // TODO Auto-generated method stub

        if (stack.isEmpty()) {
            stack.push(pop);
            return;
        }
        int temp = stack.pop();
        InverseIt(stack, pop);
        stack.push(temp);
    }

}
