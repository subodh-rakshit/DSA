import java.util.*;

public class LargestThree{
  public static void main(String args[]){
    int a = 1, b = 3, c = 6;
    if((a >= b) && (a >= c)){
      System.out.println("Largest is A");
    } else if (b >= c){
      System.out.println("Largest is B");
    } else {
      System.out.println("Largest is C");
    }
  }
}