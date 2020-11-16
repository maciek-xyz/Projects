package Lesson7;
import java.util.Scanner;

public class LongestAndShortest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input some sample text: ");
        String text = scanner.nextLine();
        String[] parts = text.split(" ");
        String shortest = parts[0];
        String longest = parts[0];
        String[] arrShortest = new String[parts.length];

        for (int i = 0; i < parts.length; i++) {
            if (shortest.length() <= parts[i].length()) {
                shortest = shortest;
            } else {
                shortest = parts[i];
            }

        }

        for (int i = 0; i < parts.length; i++) {
            if (longest.length() >= parts[i].length()) {
                longest = longest;
            } else {
                longest = parts[i];
            }

        }
        System.out.println("Result: " + longest + " and " + shortest + ".");
            
    }

}


