package faith.DS.STACK;

public class StackSortAccending {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        GenericStackClass<Integer> stack1=new GenericStackClass<>();
        GenericStackClass<Integer> stack2=new GenericStackClass<>();
        
        stack1.push(3);
        stack1.push(5);
        stack1.push(2);
        stack1.push(4);
        
        
        while(!stack1.isEmpty()) {
            
            int top=stack1.pop();
            while(!stack2.isEmpty() && stack2.peek()> top) {
                stack1.push(stack2.pop());
            }
            stack2.push(top);    
        }
        
        while(!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
        
    }

}
