public class DoublyLinkedList {
    public class Node {
      int data;
      Node next;
       Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
        
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    // add
    public void addFirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head==null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head =  newnode;
    }

    public void addLast(int data){
        Node newnode = new Node(data);
        size++;
        if(head==null){
            head = tail = newnode;
            return;
        }
        Node temp = head;
        while (temp.next!=null) {
            temp =temp.next;
        }
       temp.next = newnode;
       newnode.next = null;
       newnode.prev = temp;
    }
    // remove 
    public int removeFirst(){
    if(head == null){
        System.out.println("DLL is empty");
        return Integer.MIN_VALUE;
    }
    if(size == 1){
        int val = head.data;
        head = tail = null;
        size--;
        return val;
    }
    int val = head.data;
    head = head.next;
    head.prev = null;
    size--;
    return val;
}

    public int removeLast(){
    if(head == null){
        System.out.println("DLL is empty");
        return Integer.MIN_VALUE;
    }
    if(size == 1){
        int val = head.data;
        head = tail = null;
        size--;
        return val;
    }
    Node temp = head;
    for(int i=0;i<size-2;i++){
        temp = temp.next;
    }
    int val = temp.next.data;
    temp.next = null;
    tail = temp;
    size--;
    return val;
}
    // print

    public void print(){
        Node temp = head;
        System.out.print("null<->");
        while (temp!=null) {
            System.out.print(temp.data +"<->");
            temp = temp.next;
            
        }
        System.out.println("null");
    }

    public void reverse(){
        Node curr = head;
        Node prev  = null;
        Node next;

        while (curr!=null) {
            next = curr.next;
            curr.next  = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head =prev;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addLast(4);
        dll.print();
        System.out.println(dll.size);
        // dll.removeFirst();
        // dll.removeLast();
        dll.reverse();
        dll.print();

    }
}
