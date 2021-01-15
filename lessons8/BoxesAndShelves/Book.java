package Lesson9.BoxesAndShelves;

public class Book extends Item {

    public Book(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
