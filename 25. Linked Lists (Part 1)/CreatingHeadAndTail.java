public class CreatingHeadAndTail {

  // creating a node class
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

  public static void main(String[] args) {
    CreatingHeadAndTail ll = new CreatingHeadAndTail();
    // If we create a class of LinkedList then the syntax would be
    // LinkedList ll = new LinkedList();

    // ll.head = new Node(1);
    // ll.head.next = new Node(2);

    // So we will create some methods inside of LinkedList that will do some works
    // Methods
    // add()
    // remove()
    // print()
    // search()
  }
}
