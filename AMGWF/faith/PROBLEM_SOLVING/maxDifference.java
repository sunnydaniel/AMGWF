package faith.PROBLEM_SOLVING;

public class maxDifference {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        
        
        int[] a={2,3,10,2,4,8,1};
        

        int maxdif=0;
        for(int i=1;i<a.length;i++){       
            for(int j=i-1;j>=0;j--){
                int dif=0;
                if(a[j]<a[i]){  dif =a[i]-a[j];}
                if(maxdif<dif) maxdif=dif;
            }
        }
        System.out.println(maxdif);
    }

}
