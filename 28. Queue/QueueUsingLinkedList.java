public class QueueUsingLinkedList {

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class Queue {
    static Node head = null;
    static Node tail = null;

    // method for empty queue
    public static boolean isEmpty() {
      return head == null && tail == null;
    }

    // method for adding elements in queue
    // add
    public static void add(int data) {
      Node newNode = new Node(data);
      if (head == null) {
        head = tail = newNode;
        return;
      }
      tail.next = newNode;
      tail = newNode;
    }

    // removing elements in queue
    // remove
    public static int remove() {
      if (isEmpty()) {
        System.out.println("empty queue");
        return -1;
      }

      int front = head.data;

      // single element in linked list
      if (tail == head) {
        head = tail = null;
      } else {
        head = head.next;
      }
      return front;
    }

    // peek
    public static int peek() {
      if (isEmpty()) {
        System.out.println("empty queue");
        return -1;
      }

      return head.data;
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    // 1 2 3
    System.out.println(q.remove());
    q.add(4);
    System.out.println(q.remove());
    q.add(5);
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}
