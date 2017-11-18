package faith.PROBLEM_SOLVING;

public class RiyaStrings {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String input="momragwtbfszfximyfkhjqtzojaalpmgwniazskswxibemrswkbdgxuyrkelvxlkfgsefyxdhydlgzyhrmvjvelhbeocrpuoqribsrrpgtrzmgsotkmonlpbunzqtckuglzkbouaxymwuheejyeizjbrthoiqlhqwfpkijlywbttavaplfnbyxyoatjaprjjqlsbyxhhirjhqsyajqckqhvftvdmhhsggknafdcncngceaiikswsvcfuirgqnyt";
        long start=System.nanoTime();
        System.out.print(orignial(input));
        System.out.println();
        long stop=System.nanoTime();
        System.out.println(stop-start);
    }
    public static String orignial(String input1)
    {
    //Write code here
        
        /*char[] arr = input1.toCharArray();
        
        int len = arr.length;
        if (len <= 2)
            return input1;
        int index = len - 1, lastIndex = len - 1;
        char[] temp = new char[len];

        if (len % 2 != 0)
            temp[len / 2] = arr[0];
        for (int i = 0; i < len / 2; i++) {
            temp[index] = arr[lastIndex];
            temp[i] = arr[lastIndex - 1];
            lastIndex -= 2;
            index--;
        }*/
        
        //char[] arr = input1.toCharArray();
        
        int len = input1.length();
        if (len <= 2) return input1;
        int index = len - 1, lastIndex = len - 1;
        char[] temp = new char[len];

        if (len % 2 != 0)
            temp[len / 2] = input1.charAt(0);
        for (int i = 0; i < len / 2; i++) {
            temp[index] = input1.charAt(lastIndex);
            temp[i] = input1.charAt(lastIndex-1);
            lastIndex -= 2;
            index--;
        }
        
        return new String(temp);
    }
}
