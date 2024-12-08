 import java.util.*;
 public class PriorityQueueforObject {
    static class Student implements Comparable <Student>{ //overriding
        String name;
        int rank;

        public Student(String name , int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student S2){
            return this.rank - S2.rank;
        }
    }

    public static void main(String[] args) {
        // 1,2,3,4,5
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A",4));
        pq.add(new Student("B",5));
        pq.add(new Student("C",2));
        pq.add(new Student("D",12));
       while (!pq.isEmpty()) {
        System.out.println(pq.peek().name+"->" + pq.peek().rank); //O(1)
      pq.remove(); // O(logn)
    }
        
}
 }
