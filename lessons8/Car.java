package Lesson8.CarWithInterfaces;

public class Car {
    private String manufacturer;
    private String model;

    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void tank(){
        System.out.println(getManufacturer() + " " + getModel() + " tanked");
    }

    public void charge(){
        System.out.println(getManufacturer() + " " + getModel() + " charged");
    }
}
