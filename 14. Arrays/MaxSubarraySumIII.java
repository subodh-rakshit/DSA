public class MaxSubarraySumIII{

  public static void kadanes(int numbers[]){
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;

    for(int i = 0; i < numbers.length; i++){
      currentSum = currentSum + numbers[i];
      if(currentSum < 0){
        currentSum = 0;
      }
      maxSum = Math.max(currentSum, maxSum);
    }
    System.out.println("Our max Subarray Sum is: "+maxSum);
  }
  
  public static void main(String args[]){
    int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
    kadanes(numbers);
  }
}