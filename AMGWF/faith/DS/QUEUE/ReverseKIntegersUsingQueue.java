package faith.DS.QUEUE;

import faith.DS.STACK.GenericStackClass;

public class ReverseKIntegersUsingQueue {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        LinkedListQueue<Integer> llq=new LinkedListQueue<>();
        
        int k=4;
        llq.enqueue(4);
        llq.enqueue(3);
        llq.enqueue(2);
        llq.enqueue(1);
        llq.enqueue(5);
        llq.enqueue(6);
        llq.enqueue(7);
        llq.enqueue(8);
        llq.enqueue(9);
               
        GenericStackClass<Integer> gsc=new GenericStackClass<>();
           
        reset(llq,gsc,k);
        
        while(!gsc.isEmpty()) {
            llq.enqueue(gsc.pop());
        }
        
        int i=0;
        while(i<(llq.size()-k)) {
            llq.enqueue(llq.dequeue());
            i++;
        }
        
       System.out.println(llq.toString());
    }

    private static void reset(LinkedListQueue<Integer> llq, GenericStackClass<Integer> gsc, int k) {
        // TODO Auto-generated method stub
        int i=0;
        while(i<k) {
            gsc.push(llq.dequeue());          
            i++;
        }
        
    }
    
}
