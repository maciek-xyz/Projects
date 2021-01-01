package Lesson8;


import java.util.*;


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

        Map<String, Integer> c = new TreeMap<>();
        c.put(monitor.getName(), monitor.getPrice());
        c.put(computer.getName(), computer.getPrice());
        c.put(keyboard.getName(), keyboard.getPrice());
        c.put(mouse.getName(), mouse.getPrice());
        c.put(printer.getName(), printer.getPrice());
        c.put(xbox.getName(), xbox.getPrice());
        c.put(ps4.getName(), ps4.getPrice());
        c.put(ps5.getName(), ps5.getPrice());
        c.put(headphones.getName(), headphones.getPrice());
        c.put(microphone.getName(), microphone.getPrice());
        c.put(laptop.getName(), laptop.getPrice());

        System.out.println("=========================================");

        Map<String, Integer> catalogue = new TreeMap<>();
        catalogue.putAll(c);
        System.out.println(catalogue); //sorted by item name

        System.out.println("========================================");

        catalogue = new TreeMap<>(Collections.reverseOrder());
        catalogue.putAll(c);
        System.out.println(catalogue); //sorted by item name by reverse order

        System.out.println("=======================================");


        Comparator<String> comparator = new ItemByPrice<>((TreeMap<String, Integer>) catalogue);
        TreeMap<String, Integer> newCatalogue = new TreeMap<String, Integer>(comparator);
        newCatalogue.putAll(catalogue);
        System.out.println(newCatalogue); // sorted from the cheapest

        System.out.println("========================================");

        newCatalogue = new TreeMap<>(comparator.reversed());
        newCatalogue.putAll(catalogue);
        System.out.println(newCatalogue); // sorted from the most expensive

    }
}
