package Lesson8.CarWithInterfaces;

public class HybridCar extends Car implements Tankable, Chargable {

    public HybridCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

}
