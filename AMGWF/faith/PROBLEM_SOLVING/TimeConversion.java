package faith.PROBLEM_SOLVING;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        DateFormat inputF=new SimpleDateFormat("hh:mm:ssaa");
        
        DateFormat outputF=new SimpleDateFormat("HH:mm:ss");
        Scanner scan=new Scanner(System.in);
        String time=scan.nextLine();
        Date da=null;
        
        try {
            
            da=inputF.parse(time);
            System.out.println(outputF.format(da));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
