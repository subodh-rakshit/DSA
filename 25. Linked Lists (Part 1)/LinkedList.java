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

  public void print() {
    // if(head == null){
    // System.out.println("Linked List is empty");
    // return;
    // }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void add(int idx, int data) {
    // special case: when we need to add something in head
    if (idx == 0) {
      addFirst(data);
      return;
    }

    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;

    while (i < idx - 1) {
      temp = temp.next;
      i++;
    }

    // i = idx - 1; temp -> prev
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public int removeFirst() {
    if (size == 0) {
      System.out.println("LL is Empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  public int removeLast() {
    if (size == 0) {
      System.out.println("Linked List is Empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }

    // prev: i = size - 2;
    Node prev = head;
    for (int i = 0; i < size - 2; i++) {
      prev = prev.next;
    }

    int val = prev.next.data; // int val = tail.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;
  }

  public int iterativeSearch(int key) {
    Node temp = head;
    int i = 0;

    while (temp != null) {
      if (temp.data == key) { // key found
        return i;
      }
      temp = temp.next;
      i++;
    }

    // key not found
    return -1;
  }

  public int helper(Node head, int key) {
    // base case
    if (head == null) {
      return -1;
    }

    if (head.data == key) {
      return 0;
    }
    int idx = helper(head.next, key);
    if (idx == -1) {
      return -1;
    }

    return idx + 1;
  }

  public int recursiveSearch(int key) {
    return helper(head, key);
  }

  public void reverse() {
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    head = prev;
  }

  public void deleteNthFromEnd(int n) {
    // calculate size
    int size = 0;
    Node temp = head;

    while (temp != null) {
      temp = temp.next;
      size++;
    }

    if (n == size) {
      head = head.next; // removeFirst
      return;
    }

    // size - n
    int i = 1;
    int indexToFind = size - n;
    Node prev = head;
    while (i < indexToFind) {
      prev = prev.next;
      i++;
    }

    prev.next = prev.next.next;
    return;
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
    // ll.addFirst(2);
    // ll.addFirst(1);
    // ll.addLast(4);
    // ll.addLast(5);
    // ll.add(2, 3);
    // ll.print(); // 1 -> 2 -> 3 -> 4 -> 5 -> null
    // System.out.println(ll.size);

    // Remove first in LL
    // ll.addFirst(2);
    // ll.addFirst(1);
    // ll.addLast(4);
    // ll.addLast(5);
    // ll.add(2, 3);
    // ll.print(); // 1 -> 2 -> 3 -> 4 -> 5 -> null
    // ll.removeFirst();
    // ll.print();
    // System.out.println(ll.size);

    // Remove Last in LL
    // ll.addFirst(2);
    // ll.addFirst(1);
    // ll.addLast(4);
    // ll.addLast(5);
    // ll.add(2, 3);
    // ll.print(); // 1 -> 2 -> 3 -> 4 -> 5 -> null
    // ll.removeFirst();
    // ll.print();
    // System.out.println(ll.size);

    // ll.removeLast();
    // ll.print();
    // System.out.println(ll.size);

    // iterative search
    // ll.addFirst(2);
    // ll.addFirst(1);
    // ll.addLast(4);
    // ll.addLast(5);
    // ll.add(2, 3);
    // ll.print(); // 1 -> 2 -> 3 -> 4 -> 5 -> null

    // System.out.println(ll.iterativeSearch(3));
    // System.out.println(ll.iterativeSearch(10));

    // Recursive Search
    // ll.addFirst(2);
    // ll.addFirst(1);
    // ll.addLast(4);
    // ll.addLast(5);
    // ll.add(2, 3);
    // ll.print(); // 1 -> 2 -> 3 -> 4 -> 5 -> null

    // System.out.println(ll.recursiveSearch(3));
    // System.out.println(ll.recursiveSearch(10));

    // Reverse Linked List
    // ll.addFirst(2);
    // ll.addFirst(1);
    // ll.addLast(4);
    // ll.addLast(5);
    // ll.add(2, 3);
    // ll.print(); // 1 -> 2 -> 3 -> 4 -> 5 -> null

    // ll.reverse();
    // ll.print();

    // Remove the nth node from the end
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(4);
    ll.addLast(5);
    ll.add(2, 3);
    ll.print(); // 1 -> 2 -> 3 -> 4 -> 5 -> null

    ll.deleteNthFromEnd(3);
    ll.print();
  }
}
