package Lesson9.BoxesAndShelves;

public class Box<T> {
    private T item;

    void addItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

}