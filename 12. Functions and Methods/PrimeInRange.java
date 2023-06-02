import java.util.*;

public class PrimeInRange{

  public static boolean isPrime(int n){
    if(n == 2){
      return true;
    }

    // Second program to do it
    for(int i = 2; i <= n - 1; i++){
      if(n % i == 0){
        return false;
      }
    }
    return true;
  }

  public static void primesInRange(int n){
    for(int i = 2; i <= n; i++){
      if(isPrime(i)){
        System.out.println(i);
      }
    }
    System.out.println();
  }
  
  public static void main(String args[]){
    primesInRange(20); // 2 to 20
  }
}