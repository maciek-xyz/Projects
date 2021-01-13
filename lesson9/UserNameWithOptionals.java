package Lesson9;

import java.time.LocalDate;
import java.util.Date;

public class UserNameWithOptionals {
    public static void main(String[] args) {

        UserName userName1 = new UserName("Jan", "Kowalski", LocalDate.of(1990,03,29));

        String firstLetter = generateUserName(userName1.getName(), x -> String.valueOf(x.charAt(0))).toLowerCase();
        String secondName = generateUserName(userName1.getSecondName(), x -> x.toLowerCase());
        int year = generateBirthday(userName1.getDate(), x -> {
            if (x == null) {
                return 2021;
            } else {
                return x.getYear();
            }
                });


        System.out.println("UserName: " + firstLetter + secondName + year);
    }

    static String generateUserName(String string, GenerateUserName generateUserName) {
        return generateUserName.doSomething(string);
    }

    static int generateBirthday(LocalDate year, GenerateBirthday generateBirthday){
        return generateBirthday.doSomething(year);

    }

}
