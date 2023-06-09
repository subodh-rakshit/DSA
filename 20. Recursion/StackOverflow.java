public class StackOverflow {

    public static void printDec(int n) {

        // Base Case -> If we remove the base case then Stack Overflow happens
        // if(n == 1){
        // System.out.println(n);
        // return;
        // }

        System.out.println(n + " ");
        printDec(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}
