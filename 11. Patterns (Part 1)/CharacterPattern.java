import java.util.*;

public class CharacterPattern{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = 4;
    char ch = 'A';

    // outer loop
    for(int line = 1; line <= n; line++){
      // inner loop
      for(int chars = 1; chars <= line; chars++){
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
  }
}