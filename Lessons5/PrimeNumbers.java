package Lesson5;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int value = 2; value <= 100 ; value++) {
            int counter = 0;
            for (int d = value; d >= 1 ; d--) {
                if (value % d == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println(value++);
            }

        }
    }
}

