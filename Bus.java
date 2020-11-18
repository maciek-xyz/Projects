package Lesson7.TaskInheritance;

public class Bus extends PublicTransport {
    public Bus(int lineNumber, int countOfPeople, String destination) {
        super(lineNumber, countOfPeople, destination);
    }

    @Override
    public void setOff() {
        System.out.print("Bus: ");
        super.setOff();

    }
}
