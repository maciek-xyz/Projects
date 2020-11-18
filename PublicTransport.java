package Lesson7.TaskInheritance;

public class PublicTransport {
    private int lineNumber;
    private int countOfPeople;
    private String destination;

    public PublicTransport(int lineNumber, int countOfPeople, String destination) {
        this.lineNumber = lineNumber;
        this.countOfPeople = countOfPeople;
        this.destination = destination;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getCountOfPeople() {
        return countOfPeople;
    }

    public String getDestination() {
        return destination;
    }

    public void setOff() {
        System.out.println("Line number " + getLineNumber() + " set off to " + getDestination() + ".");
    }
}
