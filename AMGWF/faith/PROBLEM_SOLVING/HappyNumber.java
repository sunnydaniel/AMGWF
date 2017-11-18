package faith.PROBLEM_SOLVING;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        long start=System.nanoTime();
       System.out.println(happy(3  ));
       long stop=System.nanoTime();
       
       System.out.println(stop-start);
      }

    private static boolean happy(int n) {
        // TODO Auto-generated method stub
        Set<Integer> inLoop = new HashSet<Integer>();
        int squared=0;
        //List<Integer>list =new ArrayList<>();
       while(inLoop.add(n)) {
           squared=0; 
           while(n>0) {
               squared+=(n%10)*(n%10);
               n/=10;
           }
           if(squared==1) return true;
           else n=squared;
           
          // if(list.contains(n)) break;
          /* squared=0;
           while(n>0) {
               remain=n%10;
               squared=squared+remain*remain;
               n/=10;
           }
           System.out.print(" "+squared);       
           if(squared==1) return true;
           else n=squared;*/
           System.out.print(" "+n);
                   //count++;
       }
       //System.out.println(inLoop);
       return false;
    }
}
