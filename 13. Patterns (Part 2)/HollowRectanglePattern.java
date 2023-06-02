public class HollowRectanglePattern{

  public static void hollow_rectangle(int totalRows, int totalColumns){
    // outer loop
    for(int i = 1; i <= totalRows; i++){
      // inner loop
      for(int j = 1; j <= totalColumns; j++){
        // cell - (i, j)
        if(i == 1 || i == totalRows || j == 1 || j == totalColumns){
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }  
  }
  
  public static void main(String args[]){
    hollow_rectangle(10, 7);
  }
}