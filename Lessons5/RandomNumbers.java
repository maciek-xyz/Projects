package Lesson5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i <= array.length - 1 ; i++) {
         array[i] = ThreadLocalRandom.current().nextInt(0,100);
        }

        System.out.println(Arrays.toString(array));
    }
}
