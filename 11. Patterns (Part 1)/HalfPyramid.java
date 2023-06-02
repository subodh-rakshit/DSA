import java.util.*;

public class HalfPyramid{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = 4;
    for(int line = 1; line <= n; line++){
      for(int number = 1; number <= line; number++){
        System.out.print(number);
      }
      System.out.println();
    }
  }
}