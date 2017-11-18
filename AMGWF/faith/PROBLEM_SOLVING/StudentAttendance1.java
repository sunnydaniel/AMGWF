package faith.PROBLEM_SOLVING;

public class StudentAttendance1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        String s="LALL";
        System.out.println(check(s));     
    }

    private static boolean check(String s) {
        // TODO Auto-generated method stub
        char[] ar=s.toCharArray();
        int lc=0,ac=0;
        for (char c : ar) {
            if(c=='L')lc++;
            if(c=='A')ac++;
            
            if(lc>2||ac>1) return false;
        }
       if(s.contains("LL") || (lc<=2 && ac <=1)) return true;
       else return false; 
    }
}