public class GridWays {

  public static int grid_ways(int i, int j, int n, int m) {

    // base case
    if (i == n - 1 && j == m - 1) { // condition for last cell
      return 1;
    } else if (i == n || j == n) { // when we reach the rightmost end or the bottom most end (boundary cross condition)
      return 0;
    }

    int w1 = grid_ways(i + 1, j, n, m);
    int w2 = grid_ways(i, j + 1, n, m);
    return w1 + w2;
  }

  public static void main(String[] args) {
    int n = 3, m = 3;
    System.out.println(grid_ways(0, 0, n, m));
  }
}
