package Loops;/**/

public class Armstrong {
    public static void main(String[] args) {
        int a = 153,num, result =0, reminder;
        num=a;
        while (a != 0) {
            reminder = a % 10;

            result += Math.pow(reminder, 3);
            //System.out.println(reminder);
            //System.out.println(result);

            a = a / 10;
           // System.out.println(a);

        }
       // System.out.println(num);
        if(num==result){
            System.out.println("Given number is Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}


