 import java.util.*;
 public class FindItineararyForTicketsHashMap {
    public static String getStart(HashMap<String ,String> tickets){
        HashMap<String ,String> revMap = new HashMap<>();
        for(String key: tickets.keySet()){
            revMap.put(tickets.get(key), key);
        }
        for(String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key; // starting point 
            }
        }
        return null;
    }
public static void main(String[] args) {
    HashMap<String, String> ticktes = new HashMap<>();
    ticktes.put("Chennai","Bangaluru");
    ticktes.put("Mumbia","Dehli");
    ticktes.put("Goa","Chennai");
    ticktes.put("Delhi","Goa");

    String start  = getStart(ticktes);
    System.out.print(start);
    for(String key: ticktes.keySet()){
        System.out.print("->"+ ticktes.get(start));
        start = ticktes.get(start);
    }
    System.out.println();
}
}
