import java.util.ArrayList;

public class ArrayListOperations {
  public static void main(String[] args) {
    // ClassName objectName = new ClassName();
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<Boolean> list3 = new ArrayList<>();
    list.add(1);    // O(1)
    list.add(2);
    list.add(3);
    list.add(4);

    list.add(1,9);    // O(n)
    System.out.println(list);

    // Get operation - O(1)
    int element = list.get(2);
    System.out.println(element);

    // Delete
    // list.remove(2);
    // System.out.println(list);

    // set
    // list.set(2, 10);
    // System.out.println(list);

    // contains
    // System.out.println(list.contains(1));
  }
}
