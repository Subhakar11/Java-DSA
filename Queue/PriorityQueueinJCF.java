import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueinJCF {
    public static void main(String[] args) {
        // low value high priority 
       // PriorityQueue<Integer> pq = new PriorityQueue<>();

        // high value high priority
       PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(5);
        pq.add(1);
        pq.add(2);
        pq.add(4);
        pq.add(7);
        
        while (!pq.isEmpty()) {
            System.out.println(pq.peek()); //O(1)
            pq.remove(); //O(logn)
        }
    }
}
