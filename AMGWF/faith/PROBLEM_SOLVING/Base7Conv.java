package faith.PROBLEM_SOLVING;

public class Base7Conv {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int num = 9999999;
        String z = Integer.toString(num).replace("-", "");
        int len = z.length();
        int cal = z.length();
        int temp=0;
        StringBuilder sb = new StringBuilder();
        
        System.out.println(2%7);

        for (int i = len; i >=0; i--) {

           /* if (num < Math.pow(7, i)&&i<len) {
                //x=x*10;
                sb.append(0);
            }else*/ /*if(!(num < Math.pow(7, i)&&i==len)){
                sb.append((Integer.valueOf((int) (num / Math.pow(7, i)))));
                num = (int) (num % Math.pow(7, i));
            }*/
            num=num/7;
            temp=temp+num%7;
        }
        if(num==-Integer.parseInt(z)){System.out.println("true");}
        System.out.println(num);
        

    }

}
