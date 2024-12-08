import java.util.*;

public class TreeMap1 {
    public static void main(String args[]) {
        // Creating a TreeMap
        TreeMap<String, Integer> tm = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        tm.put("India", 100);
        tm.put("China", 167);
        tm.put("Indonesia", 34);
        tm.put("Russia", 56);

        // Creating a HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hm.put("India", 100);
        hm.put("China", 167);
        hm.put("Indonesia", 34);
        hm.put("Russia", 56);

        // Printing the HashMap
        System.out.print(hm);
        System.out.println();

        // Printing the TreeMap
        System.out.print(tm);
    }
}
