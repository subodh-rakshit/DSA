public class PrintSubarray{

  public static void print_subarray(int numbers[]){
    int totalSubarray = 0;
    for(int i = 0; i < numbers.length; i++){
      int start = i;
      for(int j = i; j < numbers.length; j++){
        int end = j;
        for(int k = start; k <= end; k++){
          System.out.print(numbers[k] + " ");
        }
        totalSubarray++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("Total Subarrays: "+totalSubarray);
  }
  
  public static void main(String args[]){
    int numbers[] = {2,4,6,8,10};
    print_subarray(numbers);
  }
}