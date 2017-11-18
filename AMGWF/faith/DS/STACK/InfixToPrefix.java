package faith.DS.STACK;

import java.util.Arrays;

public class InfixToPrefix extends InfixToPostfix{

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        
        String exp="(a+b)*(c+d)";
        
        char[] arr= exp.toCharArray();
              
        arr=reverseIt(arr);
        exp=Arrays.toString(arr).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", "").replaceAll(" ","");
   
        exp=Validate(exp); // From infixToPostfix class
        arr=exp.toCharArray();
        arr=reverseIt(arr);
         
        for (char c : arr) {
            System.out.print(c);
        }
    }

    private static char[] reverseIt(char[] arr) {
        // TODO Auto-generated method stub
        int len=arr.length;
        for (int i = 0; i < (arr.length/2)+1; i++) {
            char head=check(arr[i]);
            char tail=check(arr[len-1]);
            
            arr[i]=tail;
            arr[len-1]=head;
            len--;
        }
        return arr;
    }

    private static char check(char c) {
        // TODO Auto-generated method stub
        
        switch(c) {
        case '(': return ')';
        case ')': return '(';
        }
        return c;
    }
    
    

}
