package faith.DS.QUEUE;

public class CircularArrayQueue {

    
    private int[] queue;
    private int size,front,rear;
    
    private static final int CAPACITY=12;
    
    public CircularArrayQueue() {
        queue= new int[CAPACITY];
        size=front=rear=0;
    } 
    
    public CircularArrayQueue(int cap) {
        queue=new int[cap];
        size=front=rear=0;
    }
    
    public void enqueue(int data) {
        if(size==CAPACITY) throw new IllegalStateException("Queue is full!");  //expand() size<<1 (2*length) for dynamic array increase 
        else {
            size++;
            
            
            queue[rear]=data;
            rear=(rear+1)%CAPACITY;
            //System.out.println("enqueue: "+rear);
            }
        }
        
    public void dequeue() {
            if(size==0) throw new IllegalStateException("Queue is Empty!");
            else {
                size--;
                int data=queue[(front%CAPACITY)];
                queue[front]=Integer.MIN_VALUE;
                front=(front+1)% CAPACITY;
                //System.out.println("dequeue: "+front);
            }       
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==CAPACITY;
    }
    public String toString() {
        
        String list="[";
        for (int i = 0; i < size; i++) {
            
            list+=Integer.toString(queue[(front+i)%CAPACITY])+",";
            //System.out.println(queue[i]);
        }
        list+="]";
        return list;
    }
    
    public static void main(String[] args) {
        
        CircularArrayQueue Q=new CircularArrayQueue(5);
        Q.enqueue(2);
        Q.enqueue(3);
        Q.enqueue(4);
        Q.enqueue(26);
        
        Q.dequeue();
        
        System.out.println(Q.toString());
    }

}
