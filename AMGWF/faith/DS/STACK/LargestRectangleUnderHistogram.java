package faith.DS.STACK;

public class LargestRectangleUnderHistogram {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        int[] arr= {3,2,5,6,1,4,4};
        
        GenericStackClass<Integer> stack=new GenericStackClass<>();
        
        int maxArea=0,i=0;
        
        while(i<arr.length) {
            
            if(stack.isEmpty() || arr[stack.peek()]<=arr[i]) {
                stack.push(i++);
                System.out.print("top: "+stack.peek());
                System.out.print("  arr: "+arr[i-1]);
            }else {
                int top=stack.pop();
                maxArea=Math.max(maxArea, stack.isEmpty()?i:i-stack.peek()-1);
                System.out.print("  ma: "+maxArea);
            }
            System.out.println();
        }
        
        while(!stack.isEmpty()) {
            int top=stack.pop();
            maxArea=Math.max(maxArea, stack.isEmpty()?i:i-stack.peek()-1);
            }
        
        System.out.println("ans:" + maxArea);
    }

}
