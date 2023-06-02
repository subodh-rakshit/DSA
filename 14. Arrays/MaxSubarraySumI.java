public class MaxSubarraySumI{

  public static void max_subarray(int numbers[]){
    int currentSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for(int i = 0; i < numbers.length; i++){
      int start = i;
      for(int j = i; j < numbers.length; j++){
        int end = j;
        currentSum = 0;
        for(int k = start; k <= end; k++){
          // subarray sum
          currentSum += numbers[k];
        }
        System.out.println(currentSum);
        if(maxSum < currentSum){
          maxSum = currentSum;
        }
      }
    }
    System.out.println("Max Subarray Sum: "+maxSum);
  }
  
  public static void main(String args[]){
    int numbers[] = {1,-2,6,-1,3};
    max_subarray(numbers);
  }
}