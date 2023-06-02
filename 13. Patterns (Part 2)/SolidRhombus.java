public class SolidRhombus{

  public static void solid_rh(int n){
    // outer loop
    for(int i = 1; i <= n; i++){
      // inner loop
      // for spaces
      for(int j = 1; j <= n-i; j++){
        System.out.print(" ");
      }

      // for stars
      for(int j = 1; j <= n; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  public static void main(String args[]){
    solid_rh(5);
  }
}