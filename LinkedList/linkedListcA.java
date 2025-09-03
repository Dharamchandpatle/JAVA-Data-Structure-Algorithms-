import java.util.LinkedList;

import org.w3c.dom.Node;

public class linkedListcA {
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
    public int removeFirst(){
    // size =0 
    if(size ==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE; 
    }

    if(size == 1){
        int val = head.data ;
        head = tail = null;
        size = 0;
    }

    int val = head.data ;
    head = head.next ;
    size--;
    return val ;
}
// remove from last 
public int removeLast(){
    if(size == 0 ){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE ;
    }else if(size == 1 ){
        int val = head.data ;
        head = tail = null ;
        size = 0 ;
        return val ;
    }

    // prev ; i = size -2 
  Node prev = head ;
  for(int i = 0 ; i<size -2 ; i++){
    prev = prev.next ;
  }

  int val = prev.next.data ;
  prev.next = null ;
  size--;
  return val ;
}

// Iterative search in linkedlist 
public int searchKey(int key ){
    int i = 0 ; 
    Node temp = head ;

    while(temp != null ){
        if(temp.data == key){
            return i ;
        }
        temp = temp.next ;
        i++;   
     }
     return -1 ;
}


    public static void main(String aa[]) {
        linkedListcA ll = new linkedListcA();
     
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);

        ll.addLast(5);
        ll.addLast(7);

        ll.addMiddle(3,11);
        ll.printLL();

        ll.removeFirst();
        ll.printLL();

        System.out.println(ll.size);

    }
}
