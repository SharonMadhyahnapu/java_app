package Loops;

public class Fibnacci {
    public static void main(String[] args) {
        int num=0,i=1,result=0,n;
        System.out.print(num+" "+ i);
      for(n=1;n<10;n++) {
          result = num + i;
          System.out.print(" " + result);
          num=i;
          i=result;
      }


      }


    }

