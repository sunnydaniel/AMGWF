package faith.PROBLEM_SOLVING;

import java.util.Scanner;

public class BinaryWatch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input =new Scanner(System.in);
        
        int n=input.nextInt();
        
        possibleTimes(n);
        
    }
    private static void possibleTimes(int n) {
        // TODO Auto-generated method stub
        
        int[] hr={8,4,2,1};
        int[] min={32,16,8,4,2,1};
        if(n<=3){
           
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < min.length; j++) {
                    
                }
            }
            
        }
        
        if(n<=5){
            
            
        }
    }

}
