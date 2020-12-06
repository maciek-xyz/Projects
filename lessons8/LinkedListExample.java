package Lesson8;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        LinkedList<Integer> numbers = new LinkedList<>();

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
