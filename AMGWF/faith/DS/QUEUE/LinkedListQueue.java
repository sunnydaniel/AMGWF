package faith.DS.QUEUE;

import faith.DS.LINKEDLIST.GenericNode;

public class LinkedListQueue<E> implements GenericQueue<E> {

    GenericNode<E> rear,front;
    int length;
    
    LinkedListQueue(){
        rear=front=null;
        length=0;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        LinkedListQueue<Integer> llq=new LinkedListQueue<>();
        llq.enqueue(23);
        llq.enqueue(24);
        llq.enqueue(25);
        llq.enqueue(26);
        
        System.out.println(llq.toString());
        
    }

    public void enqueue(E val) {
        // TODO Auto-generated method stub
        GenericNode<E> node=new GenericNode<>();
        node.setElement(val);
        if(isEmpty()) {
            front=node;
        }else rear.setNext(node);
        rear=node;
        length++; 
    }
    
    @Override
    public E dequeue() {
        // TODO Auto-generated method stub
        
        if(isEmpty()) throw new IllegalStateException("Queue is empty !");
        
        E data=front.getElement();
        front=front.getNext();
        
        length--;
        if(isEmpty()) rear=null;
        return data;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return length;   
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return length==0;
    }
    
    public String toString() {
        
        String result="[";
        GenericNode<E> temp=front;
        while(temp!=null) {
            result+=temp.getElement()+",";
            temp=temp.next;
        }
        result+="]";
        return result;
    }

}
