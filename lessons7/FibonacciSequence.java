package Lesson7;

public class FibonacciSequence {
    public static void main(String[] args) {

       int firstValue = 0;
       int secondValue = 1;
        System.out.print(firstValue + ", " + secondValue);
        for (int i = 2; i < 10; i++) {
            int thirdValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = thirdValue;
            System.out.print(", " + thirdValue);

        }
    }
}
