package Loops;

public class Pascal {
    public static void main(String[] args) {
        int r = 5, i;
        for ( i= 1; i<= r; i++) {

            for (int k=1; k <= r-i; k++) {

                System.out.print(" ");
            }

            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / j;

            }
            System.out.println();
        }
    }
}

