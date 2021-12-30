package Recursion;

public class Program4 {
	public static void main(String[] args) {
		int result = power(2, 3);
		System.out.println("2^3 = " + result);
	}

	public static int power(int n, int p) {
		if (p < 0) {
			return -1;
		}
		if (p == 0) {
			return 1;
		}
		return n * power(n, p - 1);
	}
}
