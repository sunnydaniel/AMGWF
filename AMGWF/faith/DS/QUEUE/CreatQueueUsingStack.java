package faith.DS.QUEUE;

import faith.DS.STACK.GenericStackClass;

public class CreatQueueUsingStack {

    GenericStackClass<Integer> stack1=new GenericStackClass<>();
    GenericStackClass<Integer> stack2=new GenericStackClass<>();
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        CreatQueueUsingStack queue=new CreatQueueUsingStack();
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.enqueue(0);
        queue.enqueue(34);
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        
    }

    private int dequeue() {
        // TODO Auto-generated method stub
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    private void enqueue(int i) {
        // TODO Auto-generated method stub
        
        stack1.push(i);
    }
    
    

}
