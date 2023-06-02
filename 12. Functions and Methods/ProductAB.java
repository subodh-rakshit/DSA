import java.util.*;

public class ProductAB{
  
  public static int multiply(int a, int b){
    int product = a * b;
    return product;
  }
  
  public static void main(String args[]){
    int a = 3;
    int b = 5;
    int prod = multiply(3, 5);
    System.out.println(prod);
  }
}