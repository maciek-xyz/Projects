package Lesson8;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        LinkedList<Integer> numbers = new LinkedList<>();

        for (int i = 0; i < 100_00; i++) {
            numbers.add(0,i);
            System.out.println(numbers);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
