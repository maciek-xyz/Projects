package Lesson5;

public class WordSplit {
    public static void main(String[] args) {

        String text = args[0];
        char[] a = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            System.out.println(a[i]);
            
        }
    }
}
