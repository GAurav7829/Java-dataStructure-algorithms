package Recursion;

public class Program2 {
	public static void main(String[] args) {
		int result = fibonacci(4);
		System.out.println("fibonacci result " + result);
	}

	public static int fibonacci(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 0 || n == 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
