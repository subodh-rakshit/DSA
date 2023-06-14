public class LinkedList {

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  // add first
  public void addFirst(int data) {
    // step 1 : create new node
    Node newNode = new Node(data);
    size++;

    // Special case
    if (head == null) {
      head = tail = newNode;
      return;
    }

    // step 2: newNode next = head;
    newNode.next = head; // linking step

    // step 3: head = newNode
    head = newNode; // pointing step
  }

  public void addLast(int data) {
    // step 1: create a new node
    Node newNode = new Node(data);
    size++;

    // Special case
    if (head == null) {
      head = tail = newNode;
      return;
    }

    // step 2: tail.next = newNode
    tail.next = newNode;

    // step 3: tail = newNode
    tail = newNode;
  }

  public void print(){
    // if(head == null){
    //   System.out.println("Linked List is empty");
    //   return;
    // }
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void add(int idx, int data){
    // special case: when we need to add something in head
    if(idx == 0){
      addFirst(data);
      return;
    }

    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;

    while(i < idx - 1){
      temp = temp.next;
      i++;
    }

    // i = idx - 1; temp -> prev
    newNode.next = temp.next;
    temp.next = newNode;
  }



  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    // addFirst
    // ll.addFirst(1);
    // ll.addFirst(2);

    // addLast
    // ll.addFirst(2);
    // ll.addFirst(1);
    // ll.addLast(3);
    // ll.addLast(4);

    // LL Print
    // ll.print();
    // ll.addFirst(2);
    // ll.print();
    // ll.addFirst(1);
    // ll.print();
    // ll.addLast(3);
    // ll.print();
    // ll.addLast(4);
    // ll.print();

    // add in middle of linked list
    // ll.addFirst(2);
    // ll.addFirst(1);
    // ll.addLast(3);
    // ll.addLast(4);
    // ll.add(2, 9);
    // ll.print();

    // Size of a LL
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(4);
    ll.addLast(5);
    ll.add(2, 3);
    ll.print();           // 1 -> 2 -> 3 -> 4 -> 5 -> null
    System.out.println(ll.size);
  }
}
