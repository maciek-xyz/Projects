package Lesson9.BoxesAndShelves;

public class Food extends Item {

    public Food(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
