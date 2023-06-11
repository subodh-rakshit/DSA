public class QuickSort {

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void quick_sort(int arr[], int si, int ei) {

    // Base case
    if (si >= ei) {
      return;
    }

    // find out the pivot
    // last element
    int pidx = partition(arr, si, ei);
    quick_sort(arr, si, pidx - 1); // left part
    quick_sort(arr, pidx + 1, ei);
  }

  public static int partition(int arr[], int si, int ei) {

    int pivot = arr[ei];
    int i = si - 1; // to make place for elements smaller than pivot

    for (int j = si; j < ei; j++) {
      if (arr[j] <= pivot) {
        i++;
        // swap
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }

    // now place the pivot in the right array index
    i++;
    int temp = arr[ei];
    arr[ei] = arr[i];
    arr[i] = temp;

    return i;
  }

  public static void main(String[] args) {
    // int arr[] = {6,3,9,8,2,5};
    int arr[] = { 6, 3, 9, 8, 2, 5, -5 };
    quick_sort(arr, 0, arr.length - 1);
    printArr(arr);
  }
}
