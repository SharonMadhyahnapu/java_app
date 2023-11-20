package Loops;

public class Hcf {
    public static void main(String[] args) {
        int a=24,b=36,hcf=0;
        for(int i=1;i<=a/2||i<=b/2;i++){
            if(a%i==0&&b%i==0)
              hcf=i;

        }
        System.out.println(hcf);
    }
}
