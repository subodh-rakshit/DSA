public class DiagonalSum {

    public static int diagonal_sum(int matrix[][]) { // O(n^2)
        int sum = 0;

        // Not optimised code for calculating sum
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // } else if (i + j == matrix.length - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        // optimised code for calculating sum   -> O(n)
        for (int i = 0; i < matrix.length; i++) {
            // Primary Diagonal
            sum += matrix[i][i];

            // secondary diagonal
            // condition to check whether the element is repeating or not in 3 x 3 matrix
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13,
        // 14, 15, 16 } };
        int matrix[][] = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
        System.out.println(diagonal_sum(matrix));
        ;
    }
}
