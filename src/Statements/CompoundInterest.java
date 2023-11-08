package Statements;

public class CompoundInterest {
    public static void main(String[]args){
        int p=2000;
        int t=5;
        double r=0.08;
        int n=12;
        double amount = p* Math.pow(1+(r/n), n*t);
        double interest=amount-p;
        System.out.println("Compound Interest after"+t+"years:"+interest);
        System.out.println("Amount after"+t+"years:"+amount);
    }
}
