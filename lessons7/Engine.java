package Lesson7;

public class Engine {
    private String nameEngine;
    private int horsePower;
    private double capacity;
    private boolean isStarted;

    private int maxSpeed;
    private double usesFuel;


    public Engine(String nameEngine, int horsePower, double capacity) {
        this.nameEngine = nameEngine;
        this.horsePower = horsePower;
        this.capacity = capacity;
        isStarted = false;
    }

    public String getNameEngine() {
        return nameEngine;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public double getCapacity() {
        return capacity;
    }

    public boolean isStarted() {
        return isStarted ;
    }

    public void start() {
        isStarted = true;
    }

    public void stop() {
        isStarted = false;
    }

    public int maxSpeed() {
        maxSpeed = 2 * getHorsePower();
        return maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double usesFuel() {
        usesFuel = getCapacity()/10000;
        return usesFuel;
    }

}
