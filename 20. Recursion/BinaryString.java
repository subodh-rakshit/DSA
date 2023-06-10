public class BinaryString {

	public static void print_binary_string(int n, int lastPlace, String str) {

		// base case
		if (n == 0) {
			System.out.println(str);
			return;
		}

		// kaam
		// if (lastPlace == 0) {
		// // sit 0 on chair n
		// print_binary_string(n - 1, 0, str += "0");
		// print_binary_string(n - 1, 1, str += "1");
		// } else {
		// print_binary_string(n - 1, 0, str += "0");
		// }

		// now the short syntax (above kaam ka)
		print_binary_string(n - 1, 0, str+"0");
		if (lastPlace == 0) {
			print_binary_string(n - 1, 1, str+"1");
		}
	}

	public static void main(String[] args) {
		print_binary_string(3, 0, "");
	}
}
