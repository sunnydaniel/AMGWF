/*
 * @SD 
 * 
 * 27/10/2017
 * -- Diagonal Difference (Hacker Rank)
 */

package faith.PROBLEM_SOLVING;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());
        
        /*
         *  no brainer way
         */
        /*int[][] arr=new int[n][n]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j]=scan.nextInt();
            }
        }
        int Rtot=0,Ltot=0;
        for (int i = 0; i < n; i++) {
            
            Rtot=Rtot+arr[(n-1)-i][(n-1)-i];
            Ltot=Ltot+arr[(n-1)-i][(n-1)-((n-1)-i)];
        }
        
       // System.out.println(Rtot);
        //System.out.println(Ltot);
        System.out.println(Math.abs(Rtot-Ltot));
        
        */
        
        
        /*
         * Brainer Way ;)
         */
        
        int diag1=0,diag2=0;
        
        for (int i = 0; i < n; i++) {
            String str[]=scan.nextLine().split(" ");
            diag1=diag1+Integer.parseInt(str[i]);
            diag2=diag2+Integer.parseInt(str[(n-1)-i]);
        }
        System.out.println(Math.abs(diag1-diag2));
    }
}
