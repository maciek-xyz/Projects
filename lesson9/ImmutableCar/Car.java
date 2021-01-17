package Lesson9;

import java.util.*;

public final class Car {
    private final String manufacturer;
    private final String model;
    private final Engine engine;
    private final List<Wheel> wheels;

    public Car(String manufacturer, String model, Engine engine, List<Wheel> wheels) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = new Engine(engine.getType(), engine.getHorsePower(), engine.getVolume());
        this.wheels = new ArrayList<>();
        for (Wheel wheel : wheels) {
            this.wheels.add(deepCopy(wheel));
        }
    }

    public Wheel deepCopy(Wheel wheel) {
        return new Wheel(wheel.getRadius(), wheel.getWidth());
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Wheel> getWheels() {
        return Collections.unmodifiableList(wheels);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}
