package faith.DS.QUEUE;

public class StackUsingTwoQueues {

    LinkedListQueue<Integer> llq1=new LinkedListQueue<>();
    LinkedListQueue<Integer> llq2=new LinkedListQueue<>();
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        StackUsingTwoQueues stack=new StackUsingTwoQueues();
        
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    private void push(int data) {
        // TODO Auto-generated method stub
        
        if(llq1.isEmpty()) {
            llq2.enqueue(data);
        }else llq1.enqueue(data);
    }

    private int pop() {
        // TODO Auto-generated method stub
        
        if(llq2.isEmpty()){
            
            int i=0,size=llq1.size();
            
            while(i<size-1) {
                llq2.enqueue(llq1.dequeue());
                i++;
            }
           return llq1.dequeue(); 
        }else {
          
            if(llq1.isEmpty()){
                
                int i=0,size=llq2.size();
                
                while(i<size-1) {
                    llq1.enqueue(llq2.dequeue());
                    i++;
                }   
        }
            return llq2.dequeue();
    }
  }
}
