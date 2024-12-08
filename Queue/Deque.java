import java.util.*;
public class Deque{
    public static void main(String args[]){
        Deque<Integer> deque =  new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(3);
        deque.addFirst(2);
        deque.addLast(2);
        deque.addLast(2);
        deque.removeFirst();
        System.out.print(deque);

    }
}