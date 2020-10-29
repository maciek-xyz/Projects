package Lesson5;

public class MinimumNumber {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Provided empty arguments!");
            return;
        }

        int min = Integer.parseInt(args[0]);
        for (int i = 0; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);
                if (min > number) {
                    min = number;
                }
        }
        System.out.println(min);
    }
}
