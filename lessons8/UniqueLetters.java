package Lesson8;


import java.util.HashSet;
import java.util.Scanner;

public class UniqueLetters {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input a text: ");
        String text = scanner.nextLine();
        char[] x = text.toCharArray();
        System.out.println(x);

        HashSet<Character> x1 = new HashSet<>();

        for (char i: x) {
            x1.add(i);
            if (i == ' ') {
                x1.remove(i);
            }
            }
        System.out.println(x1);
        }

    }
