public class MethodScope{

  public static void printS(){
    int s = 45;
  }
  public static void main(String args[]){
    // System.out.println(s);  // Not true because s is not defined till now
    // int s = 45;
    System.out.println(s);
  }
}