package Lesson7;


public class Car {
    private Engine engine;
    private String name;
    private double fuelTankCapacity;
    private double remainingFuelAmount;




    public Car(String name, Engine engine, double fuelTankCapacity) {
        this.name = name;
        this.engine = engine;
        this.fuelTankCapacity = fuelTankCapacity;
        remainingFuelAmount = fuelTankCapacity;
    }

    public Engine getEngine() {
        return engine;
    }

    public void startEngine(){
        //engine.start();
        if (engine.isStarted()) {
            System.out.println(engine.getNameEngine() + " engine has been started already in " + name + ".");
        } else {
            System.out.println("Car " + name + " is starting " + engine.getNameEngine() + " engine.");
            engine.start();
            //System.out.println(engine.getNameEngine() + " engine has been started.");
        }
    }

    public void stopEngine() {
        //engine.stop();
        if (engine.isStarted()) {
            System.out.println("Car " + name + " is stopping " + engine.getNameEngine() + " engine.");
            engine.stop();
        } else {
            System.out.println(engine.getNameEngine() + " engine has been stopped already in " + name + ".");
        }
    }

    public void drive(int speed, double kilometers) {
            remainingFuelAmount = remainingFuelAmount - (kilometers * engine.usesFuel());
            if (remainingFuelAmount >= kilometers * engine.usesFuel()) {
                if (speed <= engine.maxSpeed()) {
                    System.out.println("Car " + name + " has been driven for " + kilometers + " km with speed " + speed + " km/h. Remaining fuel: " + remainingFuelAmount);
                } else {
                    System.out.println("Car " + name + " has been driven for " + kilometers + " km with speed " + engine.maxSpeed() + " km/h. Remaining fuel: " + remainingFuelAmount);
                }
            } else if (remainingFuelAmount < kilometers * engine.usesFuel() && remainingFuelAmount >= 0) {
                if (speed <= engine.maxSpeed()) {
                    System.out.println("Car " + name + " has been driven for " + remainingFuelAmount / engine.usesFuel() + " km with speed " + speed + " km/h. Tank is empty");
                } else {
                    System.out.println("Car " + name + " has been driven for " + remainingFuelAmount / engine.usesFuel() + " km with speed " + engine.maxSpeed() + " km/h. Tank is empty.");
                }
            } else if (remainingFuelAmount < 0) {
                System.out.println("Car " + name + " can't be driven. Tank is empty.");
            }
        }

    public void tank(){
        remainingFuelAmount = fuelTankCapacity;
        System.out.println("Car " + name + " has been tanked up.");
    }

    public String getName() {
        return name;
    }
}
