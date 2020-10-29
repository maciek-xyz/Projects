package Lesson5;
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {

        double discount;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, provide item price: ");
        int price = scanner.nextInt();

        System.out.println("Please, input customer age: ");
        int age = scanner.nextInt();

            if (age < 6) {
                discount = price * 0.2;
                System.out.format("Discounted price is %.2f%n", discount);
            }
            else if (age >= 6 && age <= 18){
                discount = price * 0.75;
                System.out.format("Discounted price is %.2f%n", discount);
            }
            else {
                discount = price * 0.7;
                System.out.format("Discounted price is %.2f%n", discount);
            }
    }
}
