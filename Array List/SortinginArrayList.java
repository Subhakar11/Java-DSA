import java.util.ArrayList;
import java.util.Collections;

public class SortinginArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(10);
        
        System.out.println(list);
        //Ascending
        Collections.sort(list);
        System.out.println(list);
        //decending 
        Collections.sort(list ,Collections.reverseOrder());
        System.out.println(list);
    }
}
