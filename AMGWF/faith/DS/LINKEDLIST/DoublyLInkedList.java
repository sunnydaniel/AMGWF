package faith.DS.LINKEDLIST;

import javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction;

public class DoublyLInkedList {
    
    private DoubLinkNode head,tail;
    private int length;
    
    
    class DoubLinkNode
    {
        DoubLinkNode next,prev;
        int data;
        
        public DoubLinkNode(int data) {
            
           /* this.next=next;
            this.prev=prev;*/
            this.data=data;
        }
        
    }
    
    public DoublyLInkedList() {
        // TODO Auto-generated constructor stub
        this.head=null;
        this.tail=null;
        this.length=0;
        
    }
    
    public boolean isEmpty(){
        return length==0;
    }
    
    public int Listlength(){
        return length;
    }
    
    public void insertEle(int data){
        DoubLinkNode newNode=new DoubLinkNode(data);
        
        if(isEmpty()){
            head=newNode;
        }else {tail .next = newNode;}
        
        newNode.prev=tail;
        tail=newNode;
        length++;
    }
    
    public void traverseEle(){
    
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    

    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        DoublyLInkedList dl=new DoublyLInkedList();
        dl.insertEle(10);
        dl.insertEle(11);
        dl.insertEle(12);
        dl.insertEle(13);
        dl.insertEle(14);
        dl.insertEle(15);
        
        dl.traverseEle();
        
        
    }

}


