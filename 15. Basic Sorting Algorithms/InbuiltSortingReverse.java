import java.util.*;

public class InbuiltSortingReverse {

    public static void printArr(Integer arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int compare(int a, int b){
        // a < b -> -ve
        // a == b -> 0
        // a > b -> +ve
        return b - a;   // reverseOrder
    }
    
    public static void main(String[] args) {
        Integer arr[] = {5,4,1,3,2};
        // Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        printArr(arr);
    }
}
