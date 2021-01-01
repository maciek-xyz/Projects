package Lesson9;

public class DayOfWeekDemo {

    public static void main(String[] args) {
        System.out.println(DayOfWeek.SUN.getPolishName());
        System.out.println(DayOfWeek.WED.isWeekend());
        System.out.println(DayOfWeek.getWeekends());
        System.out.println(DayOfWeek.getWorkingDay());
        System.out.println(DayOfWeek.fromEnglishName("Wednesday"));
        System.out.println(DayOfWeek.fromPolishName("Piątek"));

    }
}
