package Lesson8;

public class Laptop {
    private String name;
    private Processor processor;
    private HardDrive hardDrive;
    private int displaySize;
    private int weight;
    private int ramAmount;

    public Laptop(String name, Processor processor, HardDrive hardDrive, int displaySize, int weight, int ramAmount) {
        this.name = name;
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.displaySize = displaySize;
        this.weight = weight;
        this.ramAmount = ramAmount;
    }

    public static Laptop copy(Laptop another){
        HardDrive copyHardDrive = new HardDrive(another.hardDrive.getName(), another.hardDrive.getType(), another.hardDrive.getCapacity());
        Processor copyProcessor = new Processor(another.processor.getName(),another.processor.getFrequency(),another.processor.getNumberOfCores());
        Laptop copy = new Laptop(another.name, copyProcessor,copyHardDrive, another.displaySize, another.weight, another.ramAmount);
        return copy;
    }

    public String getName() {
        return name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public int getWeight() {
        return weight;
    }

    public int getRamAmount() {
        return ramAmount;
    }
}
