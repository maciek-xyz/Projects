package Lesson7.TaskInheritance;

public class PolymorphismTester {
    public static void main(String[] args) {
      PublicTransport[] transport = new PublicTransport[4];

      transport[0] = new Airplane(12,60,"Chicago");
      transport[1] = new Bus(4,18,"Cracow");
      transport[2] = new Train(24,45, "Warsaw");
      transport[3] = new Tram(32,30, "Main station");

        for (int i = 0; i < transport.length; i++) {
            transport[i].setOff();

        }

    }
}
