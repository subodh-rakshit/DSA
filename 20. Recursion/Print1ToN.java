public class Print1ToN {

    public static void printInc(int n){

        // Base Case
        if(n == 1){
            System.out.print(n + " ");
            return;
        }

        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        printInc(n);
    }
}
