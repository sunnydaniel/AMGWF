package faith.PROBLEM_SOLVING;

import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        int[] arr=new int[n];
        double pf=0,nf=0;
        
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
            if(arr[i]<0){nf++;}
            else if(arr[i]>0){pf++;}
            
        }
        
        System.out.println(String.format("%.6f",pf/n));
        System.out.println(String.format("%.6f",nf/n));
        System.out.println(String.format("%.6f",(n-(pf+nf))/n));
        
    }

}
