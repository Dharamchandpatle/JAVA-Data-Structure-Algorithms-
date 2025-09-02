import java.util.LinkedList;

import org.w3c.dom.Node;

public class linkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size ;

    // add in tail new Node
    public  void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // add in tail new Node
    public  void addLast(int data) {
        Node newNode = new Node(data);
        size++ ;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

     public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null ");
    }

    // add node in middle ...
    public void addMiddle(int idx , int data){
        Node newNode = new Node(data);
        size++;
        Node temp = head ; 
        int i = 0 ;

        while(i <= idx-1){
            temp = temp.next ;
            i++;
        }

        newNode.next = temp.next ;
        temp.next = newNode;
    }
    
    public static void main(String aa[]) {
        linkedList ll = new linkedList();
     
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);

        ll.addLast(5);
        ll.addLast(7);

        ll.addMiddle(3,11);
        ll.printLL();
        System.out.println(ll.size);

    }
}
