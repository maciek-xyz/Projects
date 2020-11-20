package Lesson8;

public class Factorial {
    public static void main(String[] args) {

        int x1 = 1;
        int x2 = 1;
        int factorial = 1;
        System.out.print(x1 + ", " + x2);

        for (int i = 2; i < 11 ; i++) {
            factorial = factorial * i;
            System.out.print(", " + factorial);

        }
    }
}
