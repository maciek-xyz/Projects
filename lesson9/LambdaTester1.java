package Lesson9;

public class LambdaTester1 {
    public static final String text = "This is a test text";

    public static void main(String[] args) {
        System.out.println("=============UPPER CASE=========");
        System.out.println(modifyString(text, x -> x.toUpperCase()));

        System.out.println("===========LOWER CASE============");
        System.out.println(modifyString(text, x -> x.toLowerCase()));

        System.out.println("=============FIRST LETTER===========");
        System.out.println(modifyString(text, x -> String.valueOf(x.charAt(0))));

        System.out.println("============LAST LETTER=============");
        System.out.println(modifyString(text, x -> String.valueOf(x.charAt(x.length()-1))));

        System.out.println("============LENGTH TEXT==============");
        System.out.println(countString(text, x -> x.length()));

        System.out.println("===========COUNT OF WORDS=========");
        System.out.println(countString(text, x -> x.split(" ").length));

    }

    public static String modifyString(String string, TextModification textModification) {
        return textModification.doSomething(string);
    }

    public static Integer countString(String string, TextCounting textCounting) {
        return textCounting.doSomething(string);
    }
}
