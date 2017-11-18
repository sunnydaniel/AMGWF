package faith.PROBLEM_SOLVING;

import java.util.Arrays;

public class Testing {
    
        public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        int[] arr={-70,-60,-50,2,3,1};
        
        Testing ts=new Testing();
        System.out.println(ts.maximumProduct(arr));
        /*String[] temp=new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String  s=Integer.toString(arr[i]);
            temp[i]=s.replace("-", "");
        }  
        Arrays.sort(temp);
        
        System.out.println(Integer.parseInt(temp[temp.length-1])*Integer.parseInt(temp[temp.length-2])*Integer.parseInt(temp[temp.length-3]));*/
            
            
            
    }
        
        public int maximumProduct(int[] nums) {
            int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
            for (int n : nums) {
                if (n > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = n;
                } else if (n > max2) {
                    max3 = max2;
                    max2 = n;
                } else if (n > max3) {
                    max3 = n;
                }

                if (n < min1) {
                    min2 = min1;
                    min1 = n;
                } else if (n < min2) {
                    min2 = n;
                }
            }
            return Math.max(max1*max2*max3, max1*min1*min2);
        }    
}
