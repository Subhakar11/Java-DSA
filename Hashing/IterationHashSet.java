import java.util.*;
public class IterationHashSet{
    public static void main(String args[]){
        HashSet<String> cities= new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // Iterator it =  cities.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        //or

        // for(String city: cities){
        //     System.out.println(city);
        // }
System.out.println(cities);
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");
        System.out.println(ts);
    }
}