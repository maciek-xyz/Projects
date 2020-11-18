package Lesson7.TaskInheritance;

public class Tram extends PublicTransport {
    public Tram(int lineNumber, int countOfPeople, String destination) {
        super(lineNumber, countOfPeople, destination);
    }

    @Override
    public void setOff() {
        System.out.print("Tram: ");
        super.setOff();
    }
}
