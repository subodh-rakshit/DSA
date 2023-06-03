public class ClearLastIBits {

    public static int clearIthBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIthBits(15, 2));
    }
}
