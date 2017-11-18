package faith.PROBLEM_SOLVING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayIntersection {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] nums1 = { -2147483648,1,2,3 };
        int[] nums2 = {1,-2147483648,-2147483648};
        int[] arr=intersect(nums1,nums2);
        
        for (int i : arr) {
            System.out.println(i);
        }
        
        }
   
    public  static int[] intersect(int[] nums1, int[] nums2) {
        
        
        if(nums1.length==0||nums2.length==0) return new int[0];
         int len = nums1.length > nums2.length ? nums1.length : nums2.length;
        int[] least = new int[len];
        int[] biggest = new int[len];

        
        if (nums1.length <= nums2.length) {
            least = nums1;
            biggest = nums2;
        } else {
            least = nums2;
            biggest = nums1;
        }
        
        Arrays.sort(least);
        Arrays.sort(biggest);
        
        
        List<Integer> list =new ArrayList<>();
      //  int[] output=new int[];
        int z=0,pointer=0;
        for (int i = 0; i < least.length; i++) {
            for (int j = pointer; j < biggest.length; j++) {
                
                if(least[i]<biggest[j]) break;
                if (least[i] == biggest[j]) {
                    //output[z] = least[i];
                    list.add(least[i]);
                    z++;
                    pointer=j+1;
                    //if(j<biggest.length)pointer=j+1;
                    break;
                }
            }
        }
        
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        return arr;
        
        
    }
}
