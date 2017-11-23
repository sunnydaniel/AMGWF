package faith.DS.QUEUE;

import faith.DS.STACK.GenericStackClass;

public class ReverseQueue {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        LinkedListQueue<Integer> llq=new LinkedListQueue<>();
        
        llq.enqueue(2);
        llq.enqueue(3);
        llq.enqueue(4);
        llq.enqueue(5);
        llq.enqueue(6);
        
        GenericStackClass<Integer> stack=new GenericStackClass<>();
        while(!llq.isEmpty()) {
            stack.push(llq.dequeue());
        }
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}
