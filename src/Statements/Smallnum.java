package Statements;

public class Smallnum {
    public static void main(String[]args){
        int a=10,b=5,c=20;
        if(a/b==0&&a/c==0)
            System.out.println("a is small");
        else if(b/a==0 && b/c==0)
            System.out.println("b is small");
        else
            System.out.println("c is small");
    }
}
