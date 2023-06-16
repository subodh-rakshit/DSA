import java.util.*;

public class ValidParentheses {

  public static boolean isValid(String str) {
    Stack<Character> s = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      // opening condition
      if (ch == '(' || ch == '{' || ch == '[') {
        s.push(ch);
      } else {
        // closing condition
        // if stack is already empty and then we come to closing condition.
        if (s.isEmpty()) {
          return false;
        }

        // if the stack is not empty
        if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')) {
          s.pop();
        } else {
          return false;
        }
      }
    }

    if (s.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    String str = "({})[]"; // true -> valid string
    System.out.println(isValid(str));
  }
}
