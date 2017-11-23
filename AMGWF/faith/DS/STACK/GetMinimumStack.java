package faith.DS.STACK;

import java.util.EmptyStackException;

/*
 * 
 * Author @ SD
 * 
 * Take Auxilary stack and push the minimum every by 
 * comparing with peek element in min stack.
 */

public class GetMinimumStack {

    GenericStackClass<Integer> mainStack = new GenericStackClass<>();
    GenericStackClass<Integer> minStack = new GenericStackClass<>();

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        GetMinimumStack gs = new GetMinimumStack();

        gs.push(2);
        gs.push(5);
        gs.push(3);
        gs.push(1);
        gs.push(8);

        System.out.println(gs.getMinimum());
    }

    public void push(Integer ele) throws Exception {

        mainStack.push(ele);
        if (minStack.isEmpty() || minStack.peek() >= ele) {
            minStack.push(ele);
        } /*else
            minStack.push(minStack.peek());*/
    }

    public int pop() {
        if (mainStack.isEmpty())
            throw new EmptyStackException();
        
        if(minStack.top==mainStack.top) minStack.pop();
        return mainStack.pop();
    }

    public int getMinimum() {
        if (minStack.isEmpty())
            throw new EmptyStackException();
        return minStack.pop();
    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

}
