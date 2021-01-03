package Lesson7;


public class CarTester {
    public static void main(String[] args) {
        Engine engine = new Engine("Diesel", 100, 2000);
        Car car = new Car("Golf", engine, 40);
        car.stopEngine();
        car.stopEngine();
        car.startEngine();
        car.startEngine();
        car.drive(250,50);
        car.drive(100, 15);
        car.tank();
        car.drive(250, 50);
        car.drive(100,15);
        car.drive(100,40);
        car.drive(100,50);
        car.drive(100,150);
        car.tank();
        car.stopEngine();
        car.startEngine();
        engine.start();
        engine.start();
        car.stopEngine();
        engine.stop();
        engine.stop();
    }
}
