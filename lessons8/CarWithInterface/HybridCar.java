package Lesson8.CarWithInterfaces;

public class HybridCar extends Car implements Tankable, Chargable {

    public HybridCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void charge() {
        System.out.println(getManufacturer() + " " + getModel() + " charged");
    }

    @Override
    public void tank() {
        System.out.println(getManufacturer() + " " + getModel() + " tanked");
    }
}
