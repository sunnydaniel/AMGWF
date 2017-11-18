package faith.DS.STACK;

import java.util.EmptyStackException;

public class StackArray {

    private int[] stack=new int[6];
    private int top=0,moving=0;
    private int length=0;
    
    public void push(int x) throws Exception {
        length++;
        if(length==stack.length) throw new Exception("Stack Full");
        stack[++top]=x;
    }
    
    public int pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        int out=stack[top];
        stack[top--]=Integer.MIN_VALUE;
        return out;
    }
    private boolean isEmpty() {
        // TODO Auto-generated method stub
        return length==0;
    }
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        
        StackArray sa=new StackArray();
        sa.push(3);
        sa.push(7);
        sa.pop();
        sa.push(9);
        sa.push(11);
        sa.push(13);
      
        sa.printStack();

    }
    private void printStack() {
        // TODO Auto-generated method stub
        for (int v : stack) {
           System.out.println(v); 
        }
    }
}
