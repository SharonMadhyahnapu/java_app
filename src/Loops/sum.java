package Loops;

public class sum {
    public static void main(String[] args) {
        int n=153,result=0,reminder;
        while(n>0) {
            reminder = n % 10;
            result=result+reminder;
            n=n/10;
        }
        System.out.println(result);
    }

}
