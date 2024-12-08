
import java.util.*;
public class LinkedHashMaps {
    public static void main(String args[]) {
        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("China", 167);
        lhm.put("Indonesia", 34);
        lhm.put("Russia", 56);
    HashMap<String,Integer> hm = new HashMap<>();

    hm.put("India", 100);
    hm.put("China", 167);
    hm.put("Indonesia", 34);
    hm.put("Russia", 56);
        System.out.print(hm);
        System.out.println();
        System.out.print(lhm);
    }
}
