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

  // add first
  public void addFirst(int data) {
    // step 1 : create new node
    Node newNode = new Node(data);

    if (head == null) {
      head = tail = newNode;
      return;
    }

    // step 2: newNode next = head;
    newNode.next = head; // linking step

    // step 3: head = newNode
    head = newNode; // pointing step
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.addFirst(1);
    ll.addFirst(2);
  }
}
