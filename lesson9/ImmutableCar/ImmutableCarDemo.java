package Lesson9;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ImmutableCarDemo {
    public static void main(String[] args){

        Wheel wheel1 = new Wheel(15, 20);
        Wheel wheel2 = new Wheel(25, 30);

        List<Wheel> wheels = Arrays.asList(wheel1, wheel2);

        Engine engine = new Engine("Diesel", 150, 100);

        Car car = new Car("Opel", "Corsa", engine, wheels);

        System.out.println(car);
        engine.setHorsePower(300);
        System.out.println(engine.getHorsePower());
        System.out.println(car.getEngine().getHorsePower());
        System.out.println(car.getWheels().get(0));

        wheel1.setRadius(100);
        System.out.println(car);


    }
}
