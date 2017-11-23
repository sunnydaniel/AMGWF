package faith.DS.STACK;

public class PlaindromeUsingStack {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
      
        String str="aaaxaaa";
        System.out.println(checkString(str));
        
    }

    private static boolean checkString(String str) throws Exception {
        // TODO Auto-generated method stub
        
        GenericStackClass<Character> stack1=new GenericStackClass<>();
        GenericStackClass<Character> stack2=new GenericStackClass<>();
        int len=str.length()-1;
        for (int i = 0; i < str.length()/2; i++) {
            
            stack1.push(str.charAt(i));
            //System.out.println("1 " +stack1.peek());
            stack2.push(str.charAt(len--));
            //System.out.println("2 " +stack2.peek());
            
            
            if(!stack1.peek().equals(stack2.peek())) return false;
        }
        return true;
    }

}
