package faith.ALGO.SEARCHandSORT;

public class SelectionSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        int[] arr={2,4,3,1,5,6};
        
        for (int i = 0; i < arr.length-1; i++) {
            
            int imin=i;
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[j]<arr[i]){
                    imin=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[imin];
            arr[imin]=temp;
        }
        
        /// Sorted Array 
        System.out.println("Selection Sort");
        for (int i : arr) {
            System.out.print(i);
        }

    }

}
