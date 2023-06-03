public class Palindrome {

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                // not a palindrome
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Palindrome -> same from start and also from last
        // String str = "racecar";
        // String str = "noon";
        String str = "racpar";
        System.out.println(isPalindrome(str));
    }
}
