import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetImplementation {
  public static void main(String[] args) {
    HashSet<String> cities = new HashSet<>();
    cities.add("Delhi");
    cities.add("Mumbai");
    cities.add("Noida");
    cities.add("Bengaluru");
    System.out.println("----------Printing using HashSet------------");
    System.out.println(cities); // printed randomly
    System.out.println();

    LinkedHashSet<String> lhs = new LinkedHashSet<>();
    lhs.add("Delhi");
    lhs.add("Mumbai");
    lhs.add("Noida");
    lhs.add("Bengaluru");
    System.out.println("----------Printing using LinkedHashSet------------");
    System.out.println(lhs); // printed as per the order of insertion
    System.out.println();

    lhs.remove("Delhi");
    System.out.println("----------Printing using LinkedHashSet------------");
    System.out.println(lhs);
    System.out.println();

    // TreeSet
    TreeSet<String> ts = new TreeSet<>();
    ts.add("Delhi");
    ts.add("Mumbai");
    ts.add("Noida");
    ts.add("Bengaluru");
    System.out.println("----------Printing using TreeSet------------");
    System.out.println(ts);
  }
}
