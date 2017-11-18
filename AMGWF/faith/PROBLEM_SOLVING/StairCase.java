package faith.PROBLEM_SOLVING;

import java.util.Scanner;

public class StairCase {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input =new Scanner(System.in);
        
        int size=input.nextInt();
        int j=size-1;
        for (int i = 0; i < size; i++) {
            
            for (int x=j; x >0; x--) {
                System.out.print(" ");
            }
            for (int k = 1; k <i ; k++) {
                System.out.print("#");
            }
            j--;
            System.out.println();
        }
    }
}
