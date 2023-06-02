public class InsertionSort {

    public static void insertion_sort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;
            // finding out the correct position to insert
            while(prev >= 0 && arr[prev] > curr){  // prev = 2 arr[prev] = 5 > 3
                arr[prev + 1] = arr[prev];  // arr[2 + 1] = 3 = arr[2] = 5
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertion_sort(arr);
        printArr(arr);
    }
}
