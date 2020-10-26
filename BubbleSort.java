import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {5, 9, 1, 8, -2, 3};
        System.out.println(Arrays.toString(array));

        int n = 0;
        boolean sorted = true;
        int counter = 0;

        do {
            sorted = true;
            for (int k = 0; k < array.length - 1 - n; k++) {
                if(array[k] > array[k+1]) {
                    sorted = false;
                    int temp = array[k];
                    array[k] = array[k+1];
                    array[k+1] = temp;
                }
                counter++;
            }
            n++;
        } while (!sorted || n == array.length - 1);

        System.out.println(Arrays.toString(array));
        System.out.printf("Performed %d steps", counter);


    }
}
