
    import java.util.ArrayList;
import java.util.List;

public class ListinList {
    public static void main(String[] args) {
        // Creating a list of lists
        List<List<Integer>> listOfLists = new ArrayList<>();

        // Creating inner lists and adding them to the outer list
        List<Integer> innerList1 = new ArrayList<>();
        innerList1.add(1);
        innerList1.add(2);
        innerList1.add(3);
        listOfLists.add(innerList1);

        List<Integer> innerList2 = new ArrayList<>();
        innerList2.add(4);
        innerList2.add(5);
        innerList2.add(6);
        listOfLists.add(innerList2);

        // Accessing elements
        System.out.println(listOfLists.get(0).get(1)); // Output: 2
        System.out.println(listOfLists.get(1).get(2)); // Output: 6
    }
}


