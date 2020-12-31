package Lesson9;

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
        if (workingDay == true) {
            return false;
        } else {
            return true;
        }
    }

    public static DayOfWeek getWeekends() {
        for (DayOfWeek dayOfWeek : values()) {
            if (!dayOfWeek.isWorkingDay()) {
                System.out.println(dayOfWeek);
            }
        }
        return null;
    }

    public static DayOfWeek getWorkingDays(){
        for (DayOfWeek dayOfWeek : values()) {
            if (dayOfWeek.isWorkingDay()) {
                System.out.println(dayOfWeek);
            }
        }
        return null;
    }

    public static DayOfWeek fromEnglishName(String englishName) {
        for (DayOfWeek dayOfWeek : values()) {
            if (englishName == dayOfWeek.englishName) {
                return dayOfWeek;
            }
        }
        return null;
    }

    public static DayOfWeek fromPolishName(String polishName) {
        for (DayOfWeek dayOfWeek : values()) {
            if (polishName == dayOfWeek.polishName) {
                return dayOfWeek;
            }
        }
        return null;
    }
}
