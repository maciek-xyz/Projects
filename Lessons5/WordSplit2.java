package Lesson5;

public class WordSplit2 {
    public static void main(String[] args) {
        String text = args[0];
        for (String arg : args) {
            for (int i = 0; i < text.length(); i++) {
                char print = text.charAt(i);
                System.out.println(print);
            }
        }
    }
}
