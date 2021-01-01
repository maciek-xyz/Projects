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
        return !workingDay;
    }

    public static String getWeekends() {
        for(DayOfWeek dayOfWeek: values()) {
            if (!dayOfWeek.isWorkingDay()){
                System.out.print(dayOfWeek + ", ");;
            }
        }
        return "";
    }

    public static String getWorkingDay(){
        for(DayOfWeek dayOfWeek: values()) {
            if (dayOfWeek.isWorkingDay()){
                System.out.print(dayOfWeek + ", ");
            }
        }
        return "";
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
