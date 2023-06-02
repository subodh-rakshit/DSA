import java.util.*;

public class TypeConversion{
  public static void main(String args[]){
    // int a = 25;
    // long b = a;
    // System.out.println(b);
    // long a = 25;
    // int b = a;
    // System.out.println(b);
    Scanner sc = new Scanner(System.in);
    // int number = sc.nextFloat();  // Not possible
    // System.out.println(number);
    float number = sc.nextInt();  // Possible
    System.out.println(number);
  }
}