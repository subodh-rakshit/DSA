import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetImplementation {
  public static void main(String[] args) {
    HashSet<String> cities = new HashSet<>();
    cities.add("Delhi");
    cities.add("Mumbai");
    cities.add("Noida");
    cities.add("Bengaluru");

    System.out.println(cities); // printed randomly

    LinkedHashSet<String> lhs = new LinkedHashSet<>();
    lhs.add("Delhi");
    lhs.add("Mumbai");
    lhs.add("Noida");
    lhs.add("Bengaluru");

    System.out.println(lhs); // printed as per the order of insertion

    lhs.remove("Delhi");
    System.out.println(lhs);
  }
}
