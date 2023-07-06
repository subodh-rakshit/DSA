import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapImplementation {
  public static void main(String[] args) {
    TreeMap<String, Integer> tm = new TreeMap<>();
    tm.put("India", 100);
    tm.put("China", 150);
    tm.put("US", 50);
    tm.put("Indonesia", 6);

    // Compairing it with HashMap
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India", 100);
    hm.put("China", 150);
    hm.put("US", 50);

    System.out.println(tm); // alphabetical order
    System.out.println(hm); // unordered map
  }
}
