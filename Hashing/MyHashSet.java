import java.util.*;

public class MyHashSet {
    public static void main(String[] args) {
       HashSet<Integer> set =  new HashSet<>();
       set.add(1); 
       set.add(2); 
       set.add(3); 
       set.add(4); 

       System.out.println(set);
        set.remove(2);
        System.out.println(set);
 set.clear();
 System.out.println(set.size());
 System.out.println(set.isEmpty());

       if(set.contains(2)){
        System.out.println("Set 2 contains");
       }


       
    }
}