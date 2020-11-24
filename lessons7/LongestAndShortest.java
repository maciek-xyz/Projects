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

        System.out.print("Shortest words: ");

        for (int i = 0; i < parts.length; i++) {
            if (shortest.length() > parts[i].length()) {
                shortest = parts[i];
            }
        }
        for (int i = 0; i < parts.length; i++) {
            if (shortest.length() == parts[i].length()){
                System.out.print(parts[i] + ", ");
            }
        }

        System.out.print("Longest words: ");

        for (int i = 0; i < parts.length; i++) {
            if (longest.length() < parts[i].length()) {
                longest = parts[i];
            }
        }
        for (int i = 0; i < parts.length; i++) {
            if (longest.length() == parts[i].length()){
                System.out.print(parts[i] + ", ");
            }
        }
    }

}


