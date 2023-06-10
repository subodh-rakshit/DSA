public class FriendsPairing {

    public static int friends_pairing(int n){

        // Base case
        if(n == 1 || n == 2){
            return n;
        }

        // choice
        // single
        // int fnm1 = friends_pairing(n - 1);

        // // pair
        // int fnm2 = friends_pairing(n - 2);
        // int pairWays = (n - 1) * fnm2;

        // // total ways
        // int totWays = fnm1 + pairWays;

        // return totWays;

        // In short writing a recursion statement
        return friends_pairing(n - 1) + (n - 1) * friends_pairing(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(friends_pairing(3));
    }
}
