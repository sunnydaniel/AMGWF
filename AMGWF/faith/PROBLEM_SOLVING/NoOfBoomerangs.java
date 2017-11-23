package faith.PROBLEM_SOLVING;

public class NoOfBoomerangs {
    
    public static void main(String[] args) {
        
        int[][] tupple= {{1,0},{0,0},{2,0}};
        
        for (int i = 0; i < tupple.length; i++) {
            for (int j = 0; j < tupple[0].length; j++) {    
                System.out.print(tupple[i][j]);     
            }
            System.out.println();
        }   
    }
}
