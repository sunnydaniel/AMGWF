package faith.DS.LINKEDLIST;

import java.util.Scanner;

public class SinglyLinkList {

    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        LinkNode front= new LinkNode(27, null);
        front.next=new LinkNode(28, null);
        front.next.next=new LinkNode(29, null);
        
        
        Scanner scan= new Scanner(System.in);
        
        String j=scan.nextLine();
        switch (j) {
        case "1":   // traverse
            
            System.out.println("whole predifined List");
            while(front!=null){
                System.out.println(front);
                front=front.next;
            }
                 
            break;
        case "2":           //Insertion
            
            System.out.println("Basic Insertion in singly linked list ");
            System.out.println("insert an element u wish");
            Scanner input=new Scanner(System.in);    
            int ele=input.nextInt();
            LinkNode check=front;
            System.out.println("Before Insertion");
            while(front.next!=null){
                System.out.println(front);
                front=front.next;
            }
                //System.out.println(front);
              front.next=new LinkNode(ele, null);
               
               
            System.out.println("After Insertion");
            while(check!=null){
                System.out.println(check);
                check=check.next;
            }        
            break;
        case "3":   //insert in ith index
            
            
            int newele= scan.nextInt();
            LinkNode newnode=new LinkNode(newele, null);
            int position=scan.nextInt(),i=1;
            System.out.println("Inserting at "+position+"th position");
            
            while(i<position-1){
                
                front=front.next;
                i++;
            }
            LinkNode nextnextnode=front.next;
            newnode.next=nextnextnode;
            front.next=newnode;
            
            while(front!=null){
                
                System.out.println(front);
                front=front.next;
            }
            
            break;
        default:               //Deletion 
            
            System.out.println("Deleting 28 from 27,28,29");
            while(front!=null){
                //System.out.println(front);
                if(front.data==28){
                    front=front.next;
                }
                System.out.println(front);
                front=front.next;
            }
            break;
        }
        
    }

}
