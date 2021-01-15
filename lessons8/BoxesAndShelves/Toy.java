package Lesson9.BoxesAndShelves;

public class Toy extends Item {

    public Toy(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
