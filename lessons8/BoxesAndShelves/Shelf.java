package Lesson9.BoxesAndShelves;


import java.util.ArrayList;
import java.util.List;

public class Shelf <Box>{

    private List<Box> items;

    public Shelf() {
        items = new ArrayList<>();
    }

    void addBox(Box box){
        items.add(box);
    }
    List<Box> getItem() {
        return items;
    }

}
