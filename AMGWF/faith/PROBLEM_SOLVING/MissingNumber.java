package faith.PROBLEM_SOLVING;

public class MissingNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] nums = { 0, 1 ,2};

        /*
         * Commented is for Sorted array only.....
         */
        /*int output = 0, back = nums.length - 1;

        if (nums.length < 2) {

            if (nums[0] == 0)
                output = 1;
            else
                output = 0;

        } else {

            for (int i = 0; i < nums.length / 2; i++) {

                if (!(nums[i + 1] - nums[i] == 1)) {
                    output = nums[i] + 1;
                    break;
                } else if (!(nums[back] - nums[back - 1] == 1)) {
                    output = nums[back] - 1;
                    break;
                } else if (i + 1 == nums.length / 2) {
                    output = nums[back] + 1;
                }
            }
        }
        System.out.println(output);*/
        
        
        int tot=nums.length;
        for (int i = 0; i < nums.length; i++) {
            tot+=i-nums[i];             // 3=3+0-0 ==> 3=3+1-1==> 3=3+2-3 ==>return 2
        }
        System.out.println(tot);
        
    }

}
