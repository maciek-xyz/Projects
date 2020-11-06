package Lesson7;

public class MobilePhone {
    String brand;
    String model;
    int batteryCapacity;
    int batteryAmount;
    int memory;
    int freeMemory;

    public MobilePhone(String brand, String model, int batteryCapacity, int memory) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.memory = memory;
        System.out.println("Selectd phone to: " + brand + " " + model + ", " + " Battery capacity: " + batteryCapacity + " mAh, " + " Memory " + memory);
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void charge() {
        System.out.println("The phone has been charged. Remain battery capacity: " + batteryCapacity);
    }


    public void installApplication(String applicationName, int amountOfMemory) {
        if (memory > amountOfMemory ) {
            memory = memory - amountOfMemory;
            System.out.println("Application " + applicationName + " has been installed on " + brand + " " + model + "." + " Remain memory: " + memory);
        } else {
            System.out.println("Application " + applicationName + " can't be installed on " + brand + " " + model + "." + " There are not enough memory.");
        }
    }

    public void use (String application, int hours) {
        if (batteryCapacity >= 100 * hours) {
            batteryCapacity = batteryCapacity - 100 * hours;
            System.out.println("Application " + application + " has been ran for " + hours + " hours on " + brand + " " + model + ". Remain battery capacity: " + batteryCapacity + " mAh");
        } else if (batteryCapacity < 100 * hours) {
            hours = batteryCapacity / 100;
            batteryCapacity = batteryCapacity - 100 * hours;
            if (hours != 0) {
                System.out.println("Application " + application + " has been used for " + hours + " hours on " + brand + " " + model + ". Phone has been discharged.");
            } else {
                System.out.println("Application " + application + " can't be run on " + brand + " " + model + ". Phone discharged.");
            }
        }
    }


}
