public class CountSetBits {

    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){

            // check our LSB
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(15));
        System.out.println(countSetBits(16));
    }
}
