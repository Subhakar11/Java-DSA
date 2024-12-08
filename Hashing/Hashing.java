import java.util.*;
public class Hashing {

    public static void main(String[] args) {

        // create
        HashMap<String ,Integer>  hm = new HashMap<>();

        // // insert
        // hm.put("India", 100);
        // hm.put("China", 90);
        // hm.put("US", 50);


        // System.out.println(hm);

        // // get 
        // int population = hm.get("India");
        // System.out.println(population);
        // System.out.println(hm.get("Indonesia"));

        // // containskey 
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Indonesia"));

        // // remove
        // System.out.println(hm.remove("Indonesia"));
        // System.out.println(hm);

        // // size()
        // System.out.println(hm.size());

        // // Is Empty
        // hm.clear();
        // System.out.println(hm.isEmpty());



        hm.put("India", 100);
        hm.put("China", 90);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);


        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key="+k+",value="+hm.get(k));
        }
    }
     
}