public class FactorialOfN {

    public static int fact(int n){

        // Base Case
        if(n == 0){
            return 1;
        }

        int fn = n * fact(n - 1);
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
