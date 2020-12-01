package Lesson8;


import java.util.*;

public class LetterCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input a text: ");
        String text = scanner.nextLine();
        char[] x = text.toCharArray();

        List<Character> listWords = new ArrayList<>();
        for (char i: x){
            if(i != ' '){
                listWords.add(i);
            }
        }
        System.out.println(listWords);

        Map<Character,Integer> letterCounter = new HashMap<>();
        for (char j: listWords){
            Integer count = letterCounter.get(j);
            if(count != null){
                count++;
            } else {
                count = 1;
            }
            letterCounter.put(j,count);
        }
        System.out.println(letterCounter);

    }


}



