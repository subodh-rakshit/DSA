import java.util.*;

public class PrintStarPattern{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    for(int line = 1; line <= 4; line++){
      for(int star = 1; star <= line; star++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}