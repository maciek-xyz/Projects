package Lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PartsCatalogue {
    public static void main(String[] args) {
        Map<Integer, String> catalogue = new HashMap<>();
        catalogue.put(1,"Accumulator, 4 Ride ");
        catalogue.put(2,"Filter, HIFLO ");
        catalogue.put(3,"Brake pads, INPARTS ");
        catalogue.put(4,"Tire, Michelin ");
        catalogue.put(5,"Steering wheel, LUCAS ");
        catalogue.put(6,"Clutch lever, VICMA ");
        catalogue.put(7,"Chain, INPARTS ");
        catalogue.put(8,"Bulb, BOSH ");
        catalogue.put(9,"Lamp, INPARTS ");
        catalogue.put(10,"Turn signal, OXFORD ");
        catalogue.put(11,"Oil, CASTROL ");
        catalogue.put(12,"Chain lubricant, MOTUL ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input a part-number: ");
        int n = scanner.nextInt();

        if (n <= 0 ){
            System.out.println("Invalid number entered.");
        } else if(n > 0 && n <= 12) {
            System.out.println(catalogue.get(n));
        } else {
            System.out.println("We don't have any parts under this number.");
        }

    }
}
