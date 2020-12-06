package Lesson8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100_000; i++) {
            numbers.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        long secondStartTime = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            System.out.println(numbers.get(i));
        }
        long secondEndTime = System.currentTimeMillis();
        System.out.println(secondEndTime - secondStartTime);

        }

    }

