package faith.PROBLEM_SOLVING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DegreeOfanArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arr = {1,2,2,3,1,4,2};
        long start = System.currentTimeMillis();
        System.out.print(findShortestSubArray(arr));
        long stop=System.currentTimeMillis();
        System.out.println(" "+( stop-start));
        System.out.println();
        long start1 = System.currentTimeMillis();
        System.out.print(findShortestSubArrayM2(arr));
        long start2 = System.currentTimeMillis();

        System.out.println(" "+(start2-start1));
    }

    private static int findShortestSubArrayM2(int[] nums) {
        
        Map<Integer,Integer> left=new HashMap<>(),right =new HashMap<>(),count=new HashMap<>();
        
        if(nums.length==0 || nums==null) return 0;
        for (int i = 0; i < nums.length; i++) {
            int x=nums[i];
            if(left.get(x)==null) { left.put(x, i);}
            right.put(x, i);
            count.put(x,count.getOrDefault(x, 0)+1);
        }
        
        int deg=Collections.max(count.values());
        int small=nums.length;
        for (int i : count.keySet()) {
            
            if(count.get(i)==deg) {
                small=Math.min(small,right.get(i)-left.get(i)+1);
            }
        }
        
        return small;
    }

    private static int findShortestSubArray(int[] nums) {
        // TODO Auto-generated method stub
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> sublist = new ArrayList<Integer>();

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int x=nums[i];
            map.put(x, (map.getOrDefault(x, 0)+1));
        }
        int deg = Collections.max(map.values());
        int nextLen = deg;

        int small = Integer.MAX_VALUE;
        int listSize=list.size(),numsSize=nums.length;
        
        for (int j = 0; j < numsSize - (deg - 1); j++) {
            int tail = nextLen, head = 0;
            for (int j2 = 0; j2 < listSize - (nextLen - 1); j2++) {
                
                sublist = list.subList(head, tail);
                int sublistSize=sublist.size();
                
                map = new HashMap<Integer, Integer>();
                for (int i = 0; i <sublistSize ; i++) {
                    map.put(sublist.get(i), (map.containsKey(sublist.get(i)) ? map.get(sublist.get(i)) : 0) + 1);
                }
                if (Collections.max(map.values()) == deg) {

                    small = small > sublist.size() ? sublist.size() : small;
                }
                // System.out.print(" =>" + list.subList(head, tail));
                head++;
                tail++;

            }
            // System.out.println();
            // System.out.println();
            nextLen++;
        }
        return small;
    }
    
    
}
