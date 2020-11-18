package Lesson7.TaskInheritance;

public class Airplane extends PublicTransport{

    public Airplane(int lineNumber, int countOfPeople, String destination) {
        super(lineNumber, countOfPeople, destination);
    }

    @Override
    public void setOff() {
        System.out.print("Airplane: ");
        super.setOff();
    }
}
