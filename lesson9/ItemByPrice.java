package Lesson8;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ItemByPrice<String, Integer extends Comparable<Integer>> implements Comparator<String> {

    TreeMap<String, Integer> catalogue = new TreeMap<>();

    public ItemByPrice(TreeMap<String, Integer> map) {
        this.catalogue.putAll(map);
    }

    @Override
    public int compare(String o1, String o2) {
        return catalogue.get(o1).compareTo(catalogue.get(o2));
    }



}
