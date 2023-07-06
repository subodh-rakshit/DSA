import java.util.HashSet;
import java.util.Iterator;

public class HashsetIteration {
  public static void main(String[] args) {
    HashSet<String> cities = new HashSet<>();
    cities.add("Delhi");
    cities.add("Mumbai");
    cities.add("Noida");
    cities.add("Bengaluru");

    // Using iterators
    Iterator it = cities.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

    // Using advanced loop
    System.out.println("----------Printing using advanced loop-----------");
    for (String city : cities) {
      System.out.println(city);
    }
  }
}
