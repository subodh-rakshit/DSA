import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapImpl {
  public static void main(String[] args) {
    LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
    lhm.put("India", 100);
    lhm.put("China", 150);
    lhm.put("US", 50);

    System.out.println(lhm); // output as per the insertion order

    // Compairing it with HashMap
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India", 100);
    hm.put("China", 150);
    hm.put("US", 50);

    System.out.println(hm); // output randomly
  }
}
