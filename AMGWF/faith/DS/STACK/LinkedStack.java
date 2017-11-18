package faith.DS.STACK;


import java.util.EmptyStackException;

import faith.DS.LINKEDLIST.ListNode;

public class LinkedStack {

    private ListNode top;
    private int length;
    //private ListNode check;
   
    public void push(int x) {
        ListNode ls=new ListNode(x);
        //if(length==2) {check=top;}
        ls.setNext(top);
        top=ls;
        length++;
    }
    
    public int pop(){
        
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        
        int output=top.getData();
        top=top.getNext();
        return output;
        
    }
    
    private boolean isEmpty() {
        // TODO Auto-generated method stub      
        return length==0;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        LinkedStack stack=new LinkedStack();
        stack.push(0);
        stack.push(1);
        stack.push(2);
      //  stack.pop();
        stack.push(3);
        stack.push(4);
       // stack.pop();
        System.out.println(stack.toString());
        //stack.printStack();
    }
   
    public String toString(){
        String result = "";
        ListNode current = top;
        while (current != null){
            result = result + current.toString() + "\n";
            current = current.getNext();
        }

        return result;
    }
}
