package faith.DS.STACK;

public class DupsRemoveUsingStack {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        int[] ar= {1,9,6,8,8,8,0,1,1,0,6,5};
        
        DupsRemoveUsingStack ds=new DupsRemoveUsingStack();
       int temp= ds.removeAdjacentDuplicates(ar);
       for (int i = 0; i  <=temp; i++) {
         System.out.println(ar[i]);
           }    
    }   
    
    private int removeAdjacentDuplicates(int[] ar) {
        // TODO Auto-generated method stub
        
            int pointer=-1;
        int i=0;
        
        while(i<ar.length) {
            if(pointer==-1 || ar[pointer]!=ar[i]) {
                pointer++;
                ar[pointer]=ar[i];
                i++;
            }else {
                while(i<ar.length && ar[pointer]==ar[i]) {
                    i++;
                    pointer--;
                    
                    
                }
            }
        }
        return pointer;
        
    }

}
