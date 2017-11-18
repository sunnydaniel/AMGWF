package faith.DS.LINKEDLIST;

public class ListNode {


    private ListNode next;
    private int data;
    public ListNode(int data) {
        // TODO Auto-generated constructor stub
        this.data=data;
        this.next=null;
    }
    public ListNode getNext(){
        return next;
    }

    // Sets the node that follows this one.
    public void setNext (ListNode node){
        next = node;
    }

    // Returns the data stored in this node.
    public int getData(){
        return data;
    }

    // Sets the data stored in this node.
    public void setdata (int elem){
        data = elem;
    }
    
    // Sets the data stored in this node.
    public String toString (){
        return Integer.toString(data);
    }   

}
