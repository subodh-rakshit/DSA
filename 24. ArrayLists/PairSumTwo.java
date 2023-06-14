import java.util.ArrayList;

public class PairSumTwo {

  public static boolean pair_sum_2(ArrayList<Integer> list, int target) {
    int breakingPoint = -1;
    int n = list.size();
    for (int i = 0; i < list.size(); i++) {
      // breaking point condition
      if (list.get(i) > list.get(i + 1)) {
        breakingPoint = i;
        break;
      }
    }

    int lp = breakingPoint + 1; // smallest element
    int rp = breakingPoint; // largest element

    while (lp != rp) {
      // case 1
      if (list.get(lp) + list.get(rp) == target) {
        return true;
      }

      // case 2
      if (list.get(lp) + list.get(rp) < target) {
        lp = (lp + 1) % n;
      }

      // case 3
      else {
        rp = (n + rp - 1) % n;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // 11, 15, 6, 8, 9, 10 - Sorted & Rotated
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);
    System.out.println(pair_sum_2(list, 16));
  }
}
