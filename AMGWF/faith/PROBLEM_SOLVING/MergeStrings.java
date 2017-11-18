package faith.PROBLEM_SOLVING;

import java.util.Iterator;

public class MergeStrings {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String a="a";
        String b="de";
        
        String[] x=a.split("");
        String[] z=b.split("");
        
        int len= x.length>z.length?x.length:z.length;
        for(int i=0;i<len;i++){
            
            if(i<x.length){System.out.println(x[i]);}
            if(i<z.length){System.out.println(z[i]);}
            
        }
              
        
        
    }

}
