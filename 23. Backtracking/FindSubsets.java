public class FindSubsets {

  public static void find_subsets(String str, String ans, int i) {
    // base case
    if (i == str.length()) {
      // System.out.println(ans);
      if(ans.length() == 0){
        System.out.println("null");
      } else{
        System.out.println(ans);
      }
      return;
    }

    // recursion
    // Yes Choice (If the character says yes, it wants to involve in the subset
    // process)
    find_subsets(str, ans + str.charAt(i), i + 1);

    // No Choice (If the chracter says no, it do not want to involve in the subset
    // process)
    find_subsets(str, ans, i + 1);

  }

  public static void main(String[] args) {
    String str = "abc";
    find_subsets(str, "", 0);
  }
}
