package Lesson9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public enum DayOfWeek {


    MON("Monday", "Poniedziałek", true),
    TUE("Tuesday", "Wtorek", true),
    WED("Wednesday", "Środa", true),
    THU("Thursday", "Czwartek", true),
    FRI("Friday", "Piątek", true),
    SAT("Saturday", "Sobota", false),
    SUN("Sunday", "Niedziela", false);

    private final String englishName;
    private final String polishName;
    private final boolean workingDay;

    DayOfWeek(String englishName, String polishName, boolean workingDay) {
        this.englishName = englishName;
        this.polishName = polishName;
        this.workingDay = workingDay;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }

    public boolean isWeekend() {
        return !workingDay;
    }

    public static List<DayOfWeek> getWeekends() {
        List<DayOfWeek> weekendList = new ArrayList<>();
        for(DayOfWeek dayOfWeek: values()) {
            if (!dayOfWeek.isWorkingDay()){
                weekendList.add(dayOfWeek);
            }
        }
        return weekendList;
    }

    public static List<DayOfWeek> getWorkingDay(){
        List<DayOfWeek> workingList = new ArrayList<>();
        for(DayOfWeek dayOfWeek: values()) {
            if (dayOfWeek.isWorkingDay()){
                workingList.add(dayOfWeek);
            }
        }
        return workingList;
    }

    public static DayOfWeek fromEnglishName(String englishName) {
        for (DayOfWeek dayOfWeek : values()) {
            if (englishName.equals(dayOfWeek.englishName)) {
                return dayOfWeek;
            }
        }
        return null;
    }

    public static DayOfWeek fromPolishName(String polishName) {
        for (DayOfWeek dayOfWeek : values()) {
            if (polishName.equals(dayOfWeek.polishName)) {
                return dayOfWeek;
            }
        }
        return null;
    }
}
