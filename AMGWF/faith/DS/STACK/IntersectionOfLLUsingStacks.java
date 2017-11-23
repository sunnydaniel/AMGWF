package faith.DS.STACK;

import java.util.LinkedList;

public class IntersectionOfLLUsingStacks {

    
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
    GenericStackClass<Integer> stack1=new GenericStackClass<>();
    GenericStackClass<Integer> stack2=new GenericStackClass<>();
    
    LinkedList<Integer>l1=new LinkedList<>();
    LinkedList<Integer>l2=new LinkedList<>();
    
    
    l1.add(1);
    l1.add(13);
    l1.add(12);
    l1.add(14);
    l1.add(15);
    
    l2.add(2);
    l2.add(5);
    l2.add(16);
    l2.add(14);
    l2.add(15);
    
    int i=0;
    int temp=0;
    for (int j = 0; j < l1.size(); j++){
        stack1.push(l1.get(j));
        stack2.push(l2.get(j));
        
        
        if(stack1.peek()==stack2.peek()) {
            temp=stack1.pop(); 
            break;
        }
    }
    
    System.out.println(temp + " is the merging point");
   }
}
