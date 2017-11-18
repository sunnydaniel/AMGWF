package faith.PROBLEM_SOLVING;

public class OrderStrings {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n=3;
        String x1="122";
        String x2="13";
        String x3="12";
        
        /// put all the input strings to an array by using a scanner
        //
        
        
        String rule="1 false lexicographic";
        String[] arrRule=rule.split(" ");
        
        for (int i = 0; i < n; i++) {
            if(arrRule[2].equals("lexicographic")) {    // lexicographic
                
                
                // Do sorting using compare method "x1.compareTo(x2);"
                
            }else {         // numeric 
                
                // equals method.
            }
        }
        
        
        System.out.println(x1.compareTo(x2));
        
        
        
    }

}
