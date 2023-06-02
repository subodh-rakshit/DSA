import java.util.*;

public class PrintOneToN{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int range = scan.nextInt();
    int counter = 1;

    while(counter <= range){
      System.out.println(counter);
      counter++;
    }
  }
}