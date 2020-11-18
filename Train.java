package Lesson7.TaskInheritance;

public class Train extends PublicTransport {
    public Train(int lineNumber, int countOfPeople, String destination) {
        super(lineNumber, countOfPeople, destination);
    }

    @Override
    public void setOff() {
        System.out.print("Train: ");
        super.setOff();
    }
}
