package Statements;

public class SimpleInterest {
    public static void main(String[]args) {
        int principle = 2000;
        float rate = 2;
        float time = 5;
        float SI = principle * rate * time / 100;
        System.out.println("The Simple Interest is " + SI);

    }
}
