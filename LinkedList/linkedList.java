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

    // add in tail new Node
    public  void addFirst(int data) {
        Node newNode = new Node(data);

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
        ll.printLL();
        ll.addFirst(2);
        ll.printLL();
        ll.addFirst(3);
        ll.printLL();
        ll.addFirst(4);
        ll.printLL();

        ll.addLast(5);
        ll.printLL();
        ll.addLast(7);
        ll.printLL();
        
        ll.addMiddle(3,11);
        ll.printLL();

    }
}
