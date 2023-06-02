import java.util.*;

public class SmallestLargestNumber{

  public static int getLargest(int numbers[]){
    int largest = Integer.MIN_VALUE;  // -infinity
    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] > largest){
        largest = numbers[i];
      }
    }
    return largest;
  }

  public static int getSmallest(int numbers[]){
    int smallest = Integer.MAX_VALUE;
    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] < smallest){
        smallest = numbers[i];
      }
    }
    return smallest;
  }
  
  public static void main(String args[]){
    int numbers[] = {1,2,6,3,5};
    int largestNumber = getLargest(numbers);
    int smallestNumber = getSmallest(numbers);
    System.out.println("Largest Number: "+largestNumber);
    System.out.println("Smallest Number: "+smallestNumber);
  }
}