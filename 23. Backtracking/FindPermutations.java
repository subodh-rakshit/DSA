public class FindPermutations {

  public static void find_permutation(String str, String ans){
    // base case
    if(str.length() == 0){
      System.out.println(ans);
      return;
    }

    // recursion
    for(int i = 0; i < str.length(); i++){
      char curr = str.charAt(i);
      // "abcde" -> if we want to remove c then 
      // "ab" + "de" = "abde"
      String newString = str.substring(0, i) + str.substring(i + 1);
      find_permutation(newString, ans + curr);
    }
  }

  public static void main(String[] args) {
    String str = "abc";
    find_permutation(str, "");
  }
}
