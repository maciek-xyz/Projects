package Lesson8;

public class FactorialRecursive {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.print(factorial(i) + ", ");
        }

    }

    public static int factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
