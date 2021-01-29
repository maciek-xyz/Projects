package Lesson8.Bank.restricted;

public enum TransactionType {
    TOP_UP("Top up"),
    WITH_DRAW("With draw"),
    APPLY_PERCENTS("Apply percents");

    String name;

    TransactionType(String s){
        name = s;
    }

    public String getName(){
        return name;
    }
}
