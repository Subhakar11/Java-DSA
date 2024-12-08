// import java.util.ArrayList;
import java.util.*;
public class ArrayLists {
    public static void main(String args[]){
        ArrayList<Integer> list  = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list);
        System.out.println(list.contains(4));
        System.out.println(list.contains(10));

        list.set(0,1);
        System.out.println(list);

        System.out.println("Size of array list is:"+list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println(); 
        
        //reverse of array list o(n)
     for(int j=list.size()-1;j>=0;j--){
    System.out.print(list.get(j));
   }
    }

 
  
   
}
