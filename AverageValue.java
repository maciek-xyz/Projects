package Lesson5;

public class AverageValue {
    public static void main(String[] args) {

        double sum = 0;

        for (String arg : args) {
            double doubleNumber = Double.parseDouble(arg);
            sum = sum + doubleNumber;
        }
        double average = sum / args.length;
        System.out.println(average);
    }
}
