package Recursion;

public class Program6 {
	public static void main(String[] args) {
		int result = decimalToBinary(13);
		System.out.println("13 = " + result);
	}

	// decimal to binary
	public static int decimalToBinary(int n) {
		if (n == 0) {
			return 0;
		}
		return (n % 2) + 10 * decimalToBinary(n / 2);
	}

}
