import java.util.*;

public class PrintSumOfN{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int sum = 0;
    int i = 1;
    while(i <= n){
      sum = sum + i;
      i++;
    }
    System.out.println("Sum is: "+sum);
  }
}