public class LongestWordWithAllPrefixes {

  static class Node {
    Node children[] = new Node[26]; // 'a' - 'z'
    boolean eow = false;

    public Node() {
      for (int i = 0; i < 26; i++) {
        children[i] = null;
      }
    }
  }

  public static Node root = new Node();

  public static void insert(String word) { // O(L) -> O(Length of largest word)
    Node curr = root;
    for (int level = 0; level < word.length(); level++) {
      int idx = word.charAt(level) - 'a';
      if (curr.children[idx] == null) {
        curr.children[idx] = new Node();
      }
      curr = curr.children[idx];
    }

    curr.eow = true;
  }

  public static boolean search(String key) { // O(L)
    Node curr = root;
    for (int level = 0; level < key.length(); level++) {
      int idx = key.charAt(level) - 'a';
      if (curr.children[idx] == null) {
        return false;
      }
      curr = curr.children[idx];
    }

    return curr.eow = true;
  }

  public static int countNodes(Node root) {
    if (root == null) {
      return 0;
    }

    int count = 0;
    for (int i = 0; i < 26; i++) {
      if (root.children[i] != null) {
        count += countNodes(root.children[i]);
      }
    }
    return count + 1;
  }

  public static String ans = "";

  public static void longestWord(Node root, StringBuilder temp) {
    if (root == null) {
      return;
    }

    // loop to take the elements in lexicographical order
    for (int i = 0; i < 26; i++) {
      if (root.children[i] != null && root.children[i].eow == true) {
        char ch = (char) (i + 'a');
        temp.append(ch);
        if (temp.length() > ans.length()) {
          ans = temp.toString();
        }
        longestWord(root.children[i], temp);
        temp.deleteCharAt(temp.length() - 1); // Backtracking stepF
      }
    }

    // loop to take the elements in reverse lexicographical order
    // for (int i = 25; i >=0; i--) {
    //   if (root.children[i] != null && root.children[i].eow == true) {
    //     char ch = (char) (i + 'a');
    //     temp.append(ch);
    //     if (temp.length() > ans.length()) {
    //       ans = temp.toString();
    //     }
    //     longestWord(root.children[i], temp);
    //     temp.deleteCharAt(temp.length() - 1); // Backtracking stepF
    //   }
    // }
  }

  public static void main(String[] args) {
    String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };

    // create trie DS with the words array
    for (int i = 0; i < words.length; i++) {
      insert(words[i]);
    }

    longestWord(root, new StringBuilder(""));
    System.out.println(ans);
  }
}
