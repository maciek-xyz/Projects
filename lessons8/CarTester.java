package Lesson8.CarWithInterfaces;

public class CarTester {
    public static void main(String[] args) {

        Car[] car = new Car[3];

        car[0] = new FuelCar("Fod","Focus");
        car[1] = new HybridCar("Toyota", "Yaris");
        car[2] = new ElectricCar("Kia", "e-Niro");

        for (int i = 0; i < car.length; i++) {
            if (car[i] instanceof Tankable && car[i] instanceof Chargable) {
                car[i].tank();
                car[i].charge();
            } else if (car[i] instanceof Chargable) {
                car[i].charge();
            } else if (car[i] instanceof Tankable) {
                car[i].tank();
            }

        }

    }
}
