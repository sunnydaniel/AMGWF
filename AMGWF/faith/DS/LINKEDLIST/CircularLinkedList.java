package faith.DS.LINKEDLIST;

public class CircularLinkedList {

    private Node last;
    private int length;
    
    class Node{
        
        Node next;
        int data;
        public Node(int data) {
            // TODO Auto-generated constructor stub
            this.data=data;
        }
    }
    public CircularLinkedList() {
        // TODO Auto-generated constructor stub
        last=null;
        length=0;
    }
    
    public int length(){
    return length;
    }
    
    public boolean isEmpty(){
        return length==0;
    }
    
    public void createCLL(){
        Node first=new Node(1);
        Node second=new Node(10);
        Node third=new Node(100);
        Node fourth=new Node(1000);
        Node fifth=new Node(10000);
        
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=first;
        
        last=fifth;
        
        Node temp=last.next;
        while(temp!=last){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        CircularLinkedList cll=new CircularLinkedList();
        cll.createCLL();
        
        
        
        
        
        
    }

}
