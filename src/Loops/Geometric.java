package Loops;

public class Geometric {
    public static void main(String[] args) {
      int a=3,r=2,n=0,c=5;
      for(int i=0;i<=c;i++){
          int b=(int)Math.pow(r,i);
//         n=a*b;
//          System.out.print(n+" ");
          System.out.print("a*"+b+" ");
      }
    }
}
