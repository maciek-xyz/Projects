package Lesson7;

public class Engine {
    private String nameEngine;
    private int horsePower;
    private double capacity;
    private boolean isStarted;
    private Car car;

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
        if (!isStarted) {
            System.out.println(nameEngine + " engine has been started.");
            isStarted = true;
        } else {
            System.out.println("Engine has been already started.");
        }
    }

    public void stop() {
        if (isStarted) {
            System.out.println(nameEngine + " engine has been stopped.");
            isStarted = false;
        } else{
            System.out.println("Engine has been already stopped.");
        }
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
