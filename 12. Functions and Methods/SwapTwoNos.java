import java.util.*;

public class SwapTwoNos{

  public static void swap(int a, int b){
    int temp = a;
    a = b;
    b = temp;
    
  }
  
  public static void main(String args[]){
   // swap -> values exchange
    int a = 5;
    int b = 10;

    // swap
    swap(a, b);
    System.out.println("A: "+a);
    System.out.println("B: "+b);
    
  }
}