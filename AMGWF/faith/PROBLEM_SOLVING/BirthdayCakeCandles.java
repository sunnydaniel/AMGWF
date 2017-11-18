package faith.PROBLEM_SOLVING;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        int max=ar[0],count=0;
        for(int x = 0; x < n; x++){
            ar[x] = in.nextInt();
            if(ar[x]>max){ 
                count=1;
                max=ar[x];
            }else if(ar[x]==max) count++;
        }
        System.out.println(count);
    }

}
