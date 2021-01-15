package Lesson8;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class OnlineStoreDemo {
    public static void main(String[] args) {

        Item monitor = new Item("Monitor", 458);
        Item computer = new Item("Computer", 2500);
        Item keyboard = new Item("Keyboard",100);
        Item mouse = new Item("Mouse", 60);
        Item printer = new Item("Printer", 349);
        Item xbox = new Item("Xbox one console", 1200);
        Item ps4 = new Item("SONY PlayStation 4", 1289);
        Item ps5 = new Item("SONY PlayStation 5", 1999);
        Item headphones = new Item("HEadphones", 199);
        Item microphone = new Item("Microphone", 40);
        Item laptop = new Item("Laptop", 3100);

        TreeSet<Item> catalogue = new TreeSet<>(List.of(monitor, computer, keyboard, mouse, printer, xbox, ps4, ps5,
                headphones, microphone, laptop));


        System.out.println("============SORTED BY ITEM NAME===============");
        TreeSet<Item> itemName = new TreeSet<>();
        itemName.addAll(catalogue);
        System.out.println(itemName);

        System.out.println("============SORTED BY ITEM NAME IN REVERSE ORDER=================");
        TreeSet<Item> itemNameReverse = new TreeSet<>();
        itemNameReverse.addAll(catalogue);
        System.out.println(itemNameReverse.descendingSet());

        System.out.println("============SORTED BY PRICE FROM THE CHEAPEST=================");
        TreeSet<Item> itemsFromTheCheapest = new TreeSet<>(new ItemByPriceComparator());
        itemsFromTheCheapest.addAll(catalogue);
        System.out.println(itemsFromTheCheapest);

        System.out.println("============SORTED BY PRICE FROM THE MOST EXPENSIVE=================");
        TreeSet<Item> itemsFromTheMostExp = new TreeSet<>(new ItemByPriceComparator().reversed());
        itemsFromTheMostExp.addAll(catalogue);
        System.out.println(itemsFromTheMostExp);


    }
}
