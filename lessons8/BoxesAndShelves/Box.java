package Lesson9.BoxesAndShelves;


import java.util.ArrayList;
import java.util.List;

public class Box<T extends  Item> {
    private List<T> items;

    public Box() {
        items = new ArrayList<>();
    }

    void addItem(T t) {
        items.add(t);
    }

    List<T> getItem() {
        return items;
    }


    @Override
    public String toString() {
        return items + " ";
    }
}