public class LinkedListPart2 {

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

  // Slow-Fast approach (helper function)
  public Node findMid(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next; // +1
      fast = fast.next.next; // +2
    }

    return slow; // slow is my midNode
  }

  public boolean checkPalindrome() {
    if (head == null || head.next == null) {
      return true;
    }

    // step 1 - find mid
    Node midNode = findMid(head);

    // step 2 - reverse 2nd half
    Node prev = null;
    Node curr = midNode;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    Node right = prev; // right half head
    Node left = head; // left half head

    // step 3 - check left half and right half
    while (right != null) {
      if (left.data != right.data) {
        return false;
      }
      left = left.next;
      right = right.next;
    }

    return true;
  }

  public static boolean isCycle() {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next; // +1
      fast = fast.next.next; // +2
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }

  public static void removeCycle() {
    // detect cycle
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) {
        cycle = true;
        break;
      }
    }
    if (cycle == false) {
      return;
    }

    // find meeting point
    slow = head;
    Node prev = null; // last node track
    while (slow != fast) {
      prev = fast;
      slow = slow.next;
      fast = fast.next;
    }

    // remove cycle -> last.next = null
    prev.next = null;
  }

  private Node getMid(Node head) {
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  private Node merge(Node head1, Node head2) {
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
      } else {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
      }
    }

    while (head1 != null) {
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;
    }

    while (head2 != null) {
      temp.next = head2;
      head2 = head2.next;
      temp = temp.next;
    }

    return mergedLL.next;
  }

  public Node mergeSort(Node head) {
    // base case
    if (head == null || head.next == null) {
      return head;
    }

    // find mid
    Node mid = getMid(head);

    // left & right half perform mergesort
    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);

    // merge
    return merge(newLeft, newRight);
  }

  public void zig_zag() {
    // find mid
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    Node mid = slow;

    // reverse 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    Node left = head;
    Node right = prev;
    Node nextL, nextR;

    // alternate merge - zig zag merge
    while (left != null && right != null) {
      // zig-zag formation
      nextL = left.next;
      left.next = right;
      nextR = right.next;
      right.next = nextL;

      // update the values
      left = nextL;
      right = nextR;
    }
  }

  public static void main(String[] args) {

    // Detect Cycle in LL
    // head = new Node(1);
    // head.next = new Node(2);
    // head.next.next = new Node(3);
    // head.next.next.next = head;
    // 1-> 2 -> 3 -> 1

    // head = new Node(1);
    // head.next = new Node(2);
    // head.next.next = new Node(3);

    // System.out.println(isCycle());

    // Remove Cycle in LinkedList
    // head = new Node(1);
    // Node temp = new Node(2);
    // head.next = temp;
    // head.next.next = new Node(3);
    // head.next.next.next = temp;
    // 1-> 2 -> 3 -> 2
    // System.out.println(isCycle());
    // removeCycle();
    // System.out.println(isCycle());

    // Merge Sort in Linked List
    // LinkedListPart2 ll = new LinkedListPart2();
    // ll.addFirst(1);
    // ll.addFirst(2);
    // ll.addFirst(3);
    // ll.addFirst(4);
    // // ll.addFirst(5);
    // // 5 -> 4 -> 3 -> 2 -> 1
    // ll.print();
    // ll.head = ll.mergeSort(ll.head);
    // ll.print();

    // zig zag linked list
    LinkedListPart2 ll = new LinkedListPart2();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    // 1 -> 2 -> 3 -> 4 -> 5
    ll.print();
    ll.zig_zag();
    ll.print();
  }
}
