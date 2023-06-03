public class SearchInSortedMatrix {

    public static boolean staircase_search(int matrix[][], int key){

        // Implementing using the topRight as a reference
        // int row = 0, col = matrix[0].length - 1;
        // while(row < matrix.length && col >= 0){
        //     if(matrix[row][col] == key){
        //         System.out.println("Found key at: ("+row+","+col+")");
        //         return true;
        //     } else if( key < matrix[row][col]){
        //         col--;
        //     } else if (key > matrix[row][col]){
        //         row++;
        //     }
        // }
        // System.out.println("Key not found");
        // return false;

        // Implementing using the leftBottom as a reference
        int row = matrix.length - 1, col = 0;
        while(col < matrix[0].length && row >= 0){
            if(matrix[row][col] == key){
                System.out.println("Found key at: ("+row+","+col+")");
                return true;
            } else if (key < matrix[row][col]){
                row--;
            } else if (key > matrix[row][col]){
                col++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 33;
        staircase_search(matrix, key);
    }
}
