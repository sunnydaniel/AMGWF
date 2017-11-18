package faith.PROBLEM_SOLVING;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MinMaxSum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
       /* long[] arr={942381765, 627450398, 954173620, 583762094, 236817490};
        Arrays.sort(arr);*/
        
        //Scanner in = new Scanner(System.in);
        
        
        Scanner scan=new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = scan.nextLong();
        }
        
        Arrays.sort(arr);
        long min=arr[0]+arr[1]+arr[2]+arr[3];
        long max=arr[1]+arr[2]+arr[3]+arr[4];
        System.out.println(min +" "+ max);
        
        
        
    }
    
}
