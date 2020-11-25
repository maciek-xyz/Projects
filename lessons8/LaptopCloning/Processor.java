package Lesson8;

public class Processor {
    private String name;
    private int frequency;
    private int numberOfCores;

    public Processor(String name, int frequency, int numberOfCores) {
        this.name = name;
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }
}
