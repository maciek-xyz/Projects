package Lesson8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100_00; i++) {
            numbers.add(0,i);
            System.out.println(numbers);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

    }

}