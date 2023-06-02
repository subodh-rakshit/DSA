public class MaxSubarraySumII{

  public static void max_subarray(int numbers[]){
    int currentSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[numbers.length];
    
    // calculate prefix array
    prefix[0] = numbers[0];
    for(int i = 1; i < numbers.length; i++){
      prefix[i] = prefix[i - 1] + numbers[i];
    }
    
    for(int i = 0; i < numbers.length; i++){
      int start = i;
      for(int j = i; j < numbers.length; j++){
        int end = j;
        currentSum = 0;
        // for(int k = start; k <= end; k++){
        //   // subarray sum
        //   currentSum += numbers[k];
        // }
        
        currentSum = start == 0 ? prefix[end]: prefix[end] - prefix[start - 1];
        
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