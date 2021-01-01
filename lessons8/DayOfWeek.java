package Lesson9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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

    public static Collection<DayOfWeek> getWeekends() {
        List<DayOfWeek> weekendList = new ArrayList<>();
        weekendList.add(SUN);
        weekendList.add(SAT);
        return weekendList;

    }

    public static Collection<DayOfWeek> getWorkingDays(){
        List<DayOfWeek> workingList = new ArrayList<>();
        workingList.add(MON);
        workingList.add(TUE);
        workingList.add(WED);
        workingList.add(THU);
        workingList.add(FRI);
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
