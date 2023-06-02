import java.util.*;

public class BinomialCoefficient{

  public static int factorial(int n){
    int f = 1;
    for(int i = 1; i <= n; i++){
      f = f * i;
    }
    return f;
  }

  public static int binCoeff(int n, int r){
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n - r);

    int binCoefficient = fact_n/(fact_r * fact_nmr);
    return binCoefficient;
  }
  
  public static void main(String args[]){
    System.out.println(binCoeff(5,2));
  }
}